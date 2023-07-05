/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kiYo
 */
public class StaffModel {
    private String name;
    private String field;
    private String contact;
    private String category;
    private String shift;

    public StaffModel(String name, String field, String contact, String category, String shift) {
        this.name = name;
        this.field = field;
        this.contact = contact;
        this.category = category;
        this.shift = shift;
    }


    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getfield() {
        return field;
    }

    public void setfield(String field) {
        this.field = field;
    }

    public String getcontact() {
        return contact;
    }

    public void setcontact(String contact) {
        this.contact = contact;
    }

    public String getcategory() {
        return category;
    }

    public void setcategory(String category) {
        this.category = category;
    }

    public String getshift() {
        return shift;
    }

    public void setshift(String shift) {
        this.shift = shift;
    }
    
    
    
    public static boolean namevalidation(String var){
        if (var.equals("")){
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean fieldvalidation(String var){
        if (var.equals("")){
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean contactvalidation(String var){
        if (var.equals("")){
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean categoryvalidation(String var){
        if (var.equals("")){
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean shiftvalidation(String var){
        if (var.equals("")){
            return false;
        } else {
            return true;
        }
    }
}
