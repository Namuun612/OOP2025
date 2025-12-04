/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stefanyActSafe;

/**
 *
 * @author stefanybento
 */
public class Locator extends ActSafe {
    private String county;
    private String nearestShelter;
    private static java.util.ArrayList<Locator> customShelters = new java.util.ArrayList<>();
    
    public Locator() {}

    public Locator(String county, String nearestShelter) {
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
    
    public static void addCustomShelter(Locator shelter) {
        if (shelter != null) {
            customShelters.add(shelter);
        }
    }
    
    public String findShelterByCounty(String county) {
        if (county == null || county.isEmpty()) {
            return "Please enter a county name.";
        }

        county = county.trim().toLowerCase();

        for (Locator l : customShelters) {
            if (l.getCounty().equalsIgnoreCase(county)) {
                return "User-added shelter:\n" + l.getNearestShelter();
            }
        }

        return switch (county) {
            case "dublin" -> """  
                            Dublin shelters:
                             
                            1) Dublin Community Shelter
                               15, O'Connell Street - Dublin 1
                             
                            2) Northside Emergency Accommodation
                               42, Gardiner Middle Street - Dublin 1
                            """;   
            case "cork" -> """  
                            Cork shelters:
                             
                            1) Cork Simon Emergency Shelter
                               8, Anderson's Quay - Cork
                             
                            2) Southside Support Hostel
                               21, Douglas Street - Cork
                            """;
            case "donegal" -> """  
                            Donegal Support Centre
                            3, Harbour Road - Donegal Town
                            """;    
            case "galway" -> """  
                            Galway Safe Haven
                            12, Eyre Square - Galway City
                            """;
            case "limerick" -> """  
                            Novas Temporary Accommodation
                            5 Henry Street - Limerick
                            """;
            case "waterford" -> """  
                            Waterford City Homeless Hub
                            22, The Quay - Waterford
                            """;
            case "kilkenny" -> """  
                            Good Shepherd Centre
                            10, Patrick Street - Kilkenny
                            """;
            case "wicklow" -> """  
                            Wicklow Support Housing
                            7 Main Street - Wicklow Town
                            """;
            case "clare" -> """  
                            Clare Heaven Refuge
                            4, Abbey Street - Ennis, Co. Clare
                            """;
            case "kerry" -> """  
                            Kerry Homeless Assistance
                            9, High Street - Tralee, Co. Kerry
                            """;
            case "meath" -> """  
                            Meath Homeless Assistance
                            11, Railway Street - Navan, Co. Meath
                            """;
            case "laois" -> """  
                            Laois Emergency Housing
                            6, Church Street - Portlaoise, Co. Laois
                            """;    
            default -> "No shelter found in this county.";    
        };
    }

}
