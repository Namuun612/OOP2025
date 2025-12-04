/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StefanyActSafe;

/**
 *
 * @author stefanybento
 */
public class ActSafe {
    protected String name;
    protected String description;
    
    public ActSafe() {}
        
    public ActSafe(String name, String description){
        this.name = name;
        this.description = description;
    }    

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    
    public void printInfo(){
        System.out.println("Section: " + name + " - " + description);
    }
    
}
