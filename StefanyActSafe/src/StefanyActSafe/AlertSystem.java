/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StefanyActSafe;

/**
 *
 * @author stefanybento
 */
public class AlertSystem extends ActSafe {
    private String condition;
    private String severityLevel;
    private String notificationsText;
    
    public AlertSystem() {}

    public AlertSystem(String condition, String severityLevel) {
        super("Alert System", "In-app notifications for severe weather conditions");
        this.condition = condition;
        this.severityLevel = severityLevel;
        this.notificationsText = buildNotificationsText(condition, severityLevel);
    }
    
    private String buildNotificationsText(String condition, String severityLevel){
        StringBuilder sb = new StringBuilder();
        
        sb.append("Severe Weather ALert\n");
        sb.append("Condition: ").append(condition).append("\n");
        sb.append("Severity: ").append(severityLevel).append("\n\n");
        sb.append("Potential dangers:\n");
        
        String cond = condition.toLowerCase();
        
        if (cond.contains("storm")) {
            sb.append("Strong winds and heavy rain.\n")
              .append("Risk of falling tree and power outages.\n")
              .append("Avoid outdoor activities.");
        } else if (cond.contains("flood")) {
            sb.append("Rising water levels and road flooding.\n")
              .append("Risk of being trapped or swept away.\n")
              .append("Avoid driving through flooded areas and move to higher ground.");
        } else if (cond.contains("snow") || cond.contains("ice")) {
            sb.append("Slippery roads and walkways.\n")
              .append("Drive with caution and wear appropriate footwear.");
        }

        return sb.toString();
    }

    public void setSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
    }

    public String getCondition() {
        return condition;
    }

    public String getSeverityLevel() {
        return severityLevel;
    }

    public String getNotificationsText() {
        return notificationsText;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(notificationsText);
    }
    
    @Override
    public String toString(){
        return notificationsText;
    }
}
