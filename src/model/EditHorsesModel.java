/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kiYo
 */
public class EditHorsesModel {
    private static String dID;
    private static String Name;
    private static String Qualification;
    private static String Type;
    private static String Timing;

    public EditHorsesModel(String dID, String Name, String Qualification, String Type, String Timing) {
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
        EditHorsesModel.dID = dID;
    }

    public static String getNameH() {
        return Name;
    }

    public static void setNameH(String Name) {
        EditHorsesModel.Name = Name;
    }

    public static String getQualification() {
        return Qualification;
    }

    public static void setQualification(String Qualification) {
        EditHorsesModel.Qualification = Qualification;
    }

    public static String getType1() {
        return Type;
    }

    public static void setType1(String Type) {
        EditHorsesModel.Type = Type;
    }

    public static String getTiming() {
        return Timing;
    }

    public static void setTiming(String Timing) {
        EditHorsesModel.Timing = Timing;
    }
}
