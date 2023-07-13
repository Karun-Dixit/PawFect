/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kiYo
 */
public class AddBirdsModel {
    private String Name;
    private    String Qualification;
    private    String Type;
    private    String Timing;

    public AddBirdsModel(String Name, String Qualification, String Type, String Timing) {
        this.Name = Name;
        this.Qualification = Qualification;
        this.Type = Type;
        this.Timing = Timing;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String Qualification) {
        this.Qualification = Qualification;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getTiming() {
        return Timing;
    }

    public void setTiming(String Timing) {
        this.Timing = Timing;
    }
     public static boolean namevalidation(String var){
        if(var.equals("")){
            return false;
        } else {
            return true;
        }
    }
     
    public static boolean qualificationvalidation(String var){
        if (var.equals("")){
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean typevalidation(String var){
        if (var.equals("")){
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean timingvalidation(String var){
        if(var.equals("")){
            return false;
        } else{
            return true;
        }
    }
    
}
