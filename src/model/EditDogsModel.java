/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Karun Dixit
 */
public class EditDogsModel {
    private static String dID;
    private static String Name;
    private static String Qualification;
    private static String Type;
    private static String Timing;

    public EditDogsModel(String dID, String Name, String Qualification, String Type, String Timing) {
        this.dID = dID;
        this.Name = Name;
        this.Qualification = Qualification;
        this.Type = Type;
        this.Timing = Timing;
    }

    public static String getdID() {
        return dID;
    }

    public static void setdID(String dID) {
        EditDogsModel.dID = dID;
    }

    public static String getNameD() {
        return Name;
    }

    public static void setNameD(String Name) {
        EditDogsModel.Name = Name;
    }

    public static String getQualification() {
        return Qualification;
    }

    public static void setQualification(String Qualification) {
        EditDogsModel.Qualification = Qualification;
    }

    public static String getType1() {
        return Type;
    }

    public static void setType1(String Type) {
        EditDogsModel.Type = Type;
    }

    public static String getTiming() {
        return Timing;
    }

    public static void setTiming(String Timing) {
        EditDogsModel.Timing = Timing;
    }
    
}
