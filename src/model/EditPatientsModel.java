/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kiYo
 */
public class EditPatientsModel {
    private static String dID;
    private static String name;
    private static String age;
    private static String dob;
    private static String field;
    private static String owner;
    private static String contact;

    public EditPatientsModel(String dID, String name, String age, String dob, String field, String owner, String contact) {
        this.dID = dID;
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.field = field;
        this.owner = owner;
        this.contact = contact;
    }
    
    
    public static String getdID() {
        return dID;
    }

    public static void setdID(String dID) {
        EditPatientsModel.dID = dID;
    }

    public static String getNameP() {
        return name;
    }

    public static void setNameP(String name) {
        EditPatientsModel.name = name;
    }

    public static String getAge() {
        return age;
    }

    public static void setAge(String age) {
        EditPatientsModel.age = age;
    }

    public static String getDob() {
        return dob;
    }

    public static void setDob(String dob) {
        EditPatientsModel.dob = dob;
    }

    public static String getField() {
        return field;
    }

    public static void setField(String field) {
        EditPatientsModel.field = field;
    }

    public static String getOwnerP() {
        return owner;
    }

    public static void setOwnerP(String owner) {
        EditPatientsModel.owner = owner;
    }

    public static String getContact() {
        return contact;
    }

    public static void setContact(String contact) {
        EditPatientsModel.contact = contact;
    }

    
    
    
}
