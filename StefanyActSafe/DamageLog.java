/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActSafe;

import java.util.ArrayList;

/**
 *
 * @author stefanybento
 */
public class DamageLog extends ActSafe {
    private ArrayList<String> damagePhoto;
    private String damageDescription;
    private String location;
    
    public DamageLog() {
        this.damagePhoto = new ArrayList<>();
    }
    
    public void addPhoto(String photo){ 
        damagePhoto.add(photo); 
    }

    public void setDamageDescription(String damageDescription) {
        this.damageDescription = damageDescription;
    }

    public void setLocation(String location) {
        this.location = location;
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
    
    public void submitLog() {
        // in case of Database, for now only array list
        System.out.println("Log submetido to: " + location + " Description: " + damageDescription);
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Damage: " + damageDescription + " - Location: " + location);
        System.out.println("Photos: " + damagePhoto);
    }
}
