/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stefanyActSafe;

import java.util.ArrayList;

/**
 *
 * @author stefanybento
 */
public class DamageLog extends ActSafe {
    private ArrayList<String> damagePhoto = new ArrayList<>();
    private String damageDescription;
    private String location;
    private String severity;
    
    private static ArrayList<DamageLog> logs = new ArrayList<>();
    
    public DamageLog() {}

    public DamageLog(String damageDescription, String location, String severity) {
        this.damageDescription = damageDescription;
        this.location = location;
        this.severity = severity;
    }
    
    public void addPhoto(String photoPath){
        if (photoPath != null && !photoPath.isEmpty()) {
            damagePhoto.add(photoPath);
        }    
    }

    public void setDamageDescription(String damageDescription) {
        this.damageDescription = damageDescription;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public ArrayList<String> getDamagePhoto() { 
        return damagePhoto; 
    }
    
    public String getDamageDescription() {
        return damageDescription;
    }

    public String getLocation() {
        return location;
    }

    public String getSeverity() {
        return severity;
    }
    
    public void submitLog() {
        logs.add(null);
    }
    
    public static String getAllLogsText() {
        if (logs.isEmpty()) {
            return "No damage logs submitted yet.";
        }
        StringBuilder sb = new StringBuilder("Damage log history:\n\n");
        for (DamageLog d: logs) {
            sb.append("Location: ").append(d.location)
              .append(" Severity: ").append(d.severity)
              .append("\nDescription: ").append(d.damageDescription)
              .append("\n--------\n");
        }    
        return sb.toString();
    }
    
    public static DamageLog findByLocation(String loc) {
        if (loc == null || loc.trim().isEmpty())
            return null;
        for (DamageLog d: logs) {
            if (d.location.equalsIgnoreCase(loc.trim())) {
                return d;
            }
        }
        return null;
    }
    
    public static boolean deleteByLocation(String loc) {
        DamageLog found = findByLocation(loc);
        if (found != null) {
            logs.remove(found);
            return true;
        }
        return false;
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Damage: " + damageDescription
                            + " Location: " + location
                            + " Severity: " + severity);
        System.out.println("Photos: " + damagePhoto);
    }
    
    @Override
    public String toString() {
        return "Damage at " + location + " (" + severity + "): " + damageDescription;
    }
    
}
