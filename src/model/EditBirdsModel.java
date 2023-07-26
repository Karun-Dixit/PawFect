/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kiYo
 */
public class EditBirdsModel {
    private static String dID;
    private static String Name;
    private static String Qualification;
    private static String Type;
    private static String Timing;

    public EditBirdsModel(String dID, String Name, String Qualification, String Type, String Timing) {
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
        EditBirdsModel.dID = dID;
    }

    public static String getNameB() {
        return Name;
    }

    public static void setNameB(String Name) {
        EditBirdsModel.Name = Name;
    }

    public static String getQualification() {
        return Qualification;
    }

    public static void setQualification(String Qualification) {
        EditBirdsModel.Qualification = Qualification;
    }

    public static String getType1() {
        return Type;
    }

    public static void setType1(String Type) {
        EditBirdsModel.Type = Type;
    }

    public static String getTiming() {
        return Timing;
    }

    public static void setTiming(String Timing) {
        EditBirdsModel.Timing = Timing;
    }
}
