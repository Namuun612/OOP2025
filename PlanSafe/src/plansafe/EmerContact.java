/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plansafe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Dell
 */
public class EmerContact extends PlanSafe implements Contact{
    private String contactName, phone, address;

    public EmerContact(String contactName, String phone, String address, String disasterType) {
        super(disasterType);
        this.contactName = contactName;
        this.phone = phone;
        this.address = address;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public void saveContact() {
        try (FileWriter fw = new FileWriter("contact.txt")) {
            fw.write("Name: " + contactName + "\n");
            fw.write("Phone: " + phone + "\n");
            fw.write("Address: " + address + "\n");
            System.out.println("Contact saved to contact file.");
        } catch (IOException e) {
            System.out.println("Error saving contact: ");
        }
    }

    @Override
    public void accessContact() {
        try (BufferedReader br = new BufferedReader(new FileReader("contact.txt"))) {
            String line;
            System.out.println("\n--- Contact File Contents ---");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading contact: ");
        }
    }
    
    @Override
    public String printDetails() {
        return super.printDetails() +"\nName: " + contactName +"\nPhone: " + phone +"\nAddress: " + address;
    }
}
