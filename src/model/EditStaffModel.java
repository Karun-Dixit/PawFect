/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kiYo
 */
public class EditStaffModel {
    private static String dID;
    private static String name;
    private static String field;
    private static String contact;
    private static String category;
    private static String shift;

    public static String getdID() {
        return dID;
    }

    public static void setdID(String dID) {
        EditStaffModel.dID = dID;
    }

    public static String getname() {
        return name;
    }

    public static void setname(String name) {
        EditStaffModel.name = name;
    }

    public static String getfield() {
        return field;
    }

    public static void setfield(String field) {
        EditStaffModel.field = field;
    }

    public static String getcontact() {
        return contact;
    }

    public static void setcontact(String contact) {
        EditStaffModel.contact = contact;
    }

    public static String getcategory() {
        return category;
    }

    public static void setcategory(String category) {
        EditStaffModel.category = category;
    }

    public static String getshift() {
        return shift;
    }

    public static void setshift(String shift) {
        EditStaffModel.shift = shift;
    }

    public EditStaffModel(String dID, String name, String field, String contact, String category, String shift) {
        EditStaffModel.dID = dID;
        EditStaffModel.name = name;
        EditStaffModel.field = field;
        EditStaffModel.contact = contact;
        EditStaffModel.category = category;
        EditStaffModel.shift = shift;
    }
    
    
}
