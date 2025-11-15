/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActSafe;

/**
 *
 * @author stefanybento
 */
public class Locator extends ActSafe {
    private String county;
    private String nearestShelter;
    
    public Locator() {}

    public Locator(String name, String description, String county, String nearestShelter) {
        super(name, description);
        this.county = county;
        this.nearestShelter = nearestShelter;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setNearestShelter(String nearstShelter) {
        this.nearestShelter = nearstShelter;
    }

    public String getCounty() {
        return county;
    }

    public String getNearestShelter() {
        return nearestShelter;
    }
    
    public String findShelterByCounty(String county) {
        if (county == null || county.isEmpty()) {
            return "Please enter a county name.";
        }
        county = county.trim().toLowerCase();
        return switch (county) {
            case "dublin" -> "Dublin Community Centre Shelter";
            case "donegal" -> "Donegal Support Centre";    
            case "cork" -> "Cork Simon Emergency Shelter";
            case "galway" -> "Galway Safe Haven";
            case "limerick" -> "Novas Temporary Accommodation";
            case "waterford" -> "Waterford City Homeless Hub";
            case "kilkenny" -> "Good Shepherd Centre";
            case "wicklow" -> "Wicklow Support Housing";
            case "clare" -> "Clare Haven Refuse";
            case "kerry" -> "Kerry Homeless Assistance";
            case "meath" -> "Meath Homeless Assistance";
            case "laois" -> "Laois Emergency Housing";    
            default -> "No shelter found in this county.";    
        };
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("County: "+ county + "| Shelter " + nearestShelter);
    }
}
