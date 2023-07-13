/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kiYo
 */
public class EditRabbitsModel {
    private static String dID;
    private static String Name;
    private static String Qualification;
    private static String Type;
    private static String Timing;

    public EditRabbitsModel(String dID, String Name, String Qualification, String Type, String Timing) {
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
        EditRabbitsModel.dID = dID;
    }

    public static String getNameC() {
        return Name;
    }

    public static void setNameC(String Name) {
        EditRabbitsModel.Name = Name;
    }

    public static String getQualification() {
        return Qualification;
    }

    public static void setQualification(String Qualification) {
        EditRabbitsModel.Qualification = Qualification;
    }

    public static String getType1() {
        return Type;
    }

    public static void setType1(String Type) {
        EditRabbitsModel.Type = Type;
    }

    public static String getTiming() {
        return Timing;
    }

    public static void setTiming(String Timing) {
        EditRabbitsModel.Timing = Timing;
    }
}
