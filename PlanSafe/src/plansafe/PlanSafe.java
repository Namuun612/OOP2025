/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plansafe;

/**
 *
 * @author Dell
 */
public class PlanSafe {
    protected String disasterType;

    public PlanSafe(String disasterType) {
        this.disasterType = disasterType;
    }

    public String getDisasterType() {
        return disasterType;
    }

    public void setDisasterType(String disasterType) {
        this.disasterType = disasterType;
    }
    
    public String printDetails(){
        return "Disaster: "+disasterType;
    }
}
