/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
/**
 *
 * @author kiYo
 */
public class View_Report1Model {
    private static String id;
    private static String name;
    private static String age;
    private static String dob;
    private static String breed;
    private static String contact;
    private static String tests;
    private static String report;

    public View_Report1Model(String id, String name, String age, String dob, String breed, String contact, String tests, String report) {
        View_Report1Model.id = id;
        View_Report1Model.name = name;
        View_Report1Model.age = age;
        View_Report1Model.dob = dob;
        View_Report1Model.breed = breed;
        View_Report1Model.contact = contact;
        View_Report1Model.tests = tests;
        View_Report1Model.report = report;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        View_Report1Model.id = id;
    }

    public static String getNameV() {
        return name;
    }

    public static void setNameV(String name) {
        View_Report1Model.name = name;
    }

    public static String getAgeV() {
        return age;
    }

    public static void setAgeV(String age) {
        View_Report1Model.age = age;
    }

    public static String getDob() {
        return dob;
    }

    public static void setDob(String dob) {
        View_Report1Model.dob = dob;
    }

    public static String getBreed() {
        return breed;
    }

    public static void setBreed(String breed) {
        View_Report1Model.breed = breed;
    }

    public static String getContact() {
        return contact;
    }

    public static void setContact(String contact) {
        View_Report1Model.contact = contact;
    }

    public static String getTests() {
        return tests;
    }

    public static void setTests(String tests) {
        View_Report1Model.tests = tests;
    }

    public static String getReport() {
        return report;
    }

    public static void setReport(String report) {
        View_Report1Model.report = report;
    }
   
}
