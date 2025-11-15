/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plansafe;

/**
 *
 * @author Dell
 */
public class LocationRisk extends PlanSafe implements RiskCalculator{
    private double hazard, exposure, vulnerability;
    private String location, riskLevel = "";
    private double riskScore = 0;

    public LocationRisk(double hazard, double exposure, double vulnerability, String location, String disasterType) {
        super(disasterType);
        this.hazard = hazard;
        this.exposure = exposure;
        this.vulnerability = vulnerability;
        this.location = location;
    }

    public double getHazard() {
        return hazard;
    }

    public void setHazard(double hazard) {
        this.hazard = hazard;
    }

    public double getExposure() {
        return exposure;
    }

    public void setExposure(double exposure) {
        this.exposure = exposure;
    }

    public double getVulnerability() {
        return vulnerability;
    }

    public void setVulnerability(double vulnerability) {
        this.vulnerability = vulnerability;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getRiskScore() {
        return riskScore;
    }

    public void setRiskScore(double riskScore) {
        this.riskScore = riskScore;
    }
    
    @Override
    public double calculateRisk(double hazard, double exposure, double vulnerability) {
        this.riskScore = (hazard + exposure + vulnerability) / 3 * 10;
        return riskScore;
    }
    
    
//    not ready
//    public String riskLevel() {
//        if (riskScore >= 70) return riskLevel = "HIGH";
//        else if (riskScore >= 40) return riskLevel = "MEDIUM";
//        else return riskLevel = "LOW";
//    }
    
    @Override
     public String printDetails(){
        return super.printDetails() + "\nHazard level: "+hazard+"\nExposure level: "+exposure+"\nVulnerability level: "+vulnerability+"\nRisk score: "+riskScore+"\nLocation: "+location;
    }
    
    
}

