/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActSafe;

/**
 *
 * @author stefanybento
 */
public class AlertSystem extends ActSafe {
    private String alertMessage;
    private String severityLevel;
    
    public AlertSystem() {}

    public AlertSystem(String name, String description, String alertMessage, String severityLevel) {
        super(name, description);
        this.alertMessage = alertMessage;
        this.severityLevel = severityLevel;
    }

    public void setAlertMessage(String alertMessage) {
        this.alertMessage = alertMessage;
    }

    public void setSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
    }

    public String getAlertMessage() {
        return alertMessage;
    }

    public String getSeverityLevel() {
        return severityLevel;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Alert: " + alertMessage + " - Severity: " + severityLevel);
    }
}
