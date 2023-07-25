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
public class View_ReportModel {
    private static String id;
    private static String name;
    private static String age;
    private static String dob;
    private static String breed;
    private static String contact;
    private static String tests;
    private static String result;

    public View_ReportModel(String id) {
        View_ReportModel.id = id;
//        View_ReportModel.name = name;
//        View_ReportModel.age = age;
//        View_ReportModel.dob = dob;
//        View_ReportModel.breed = breed;
//        View_ReportModel.contact = contact;
//        View_ReportModel.tests = tests;
//        View_ReportModel.result = result;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        View_ReportModel.id = id;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        View_ReportModel.name = name;
    }

    public static String getAge() {
        return age;
    }

    public static void setAge(String age) {
        View_ReportModel.age = age;
    }

    public static String getDob() {
        return dob;
    }

    public static void setDob(String dob) {
        View_ReportModel.dob = dob;
    }

    public static String getBreed() {
        return breed;
    }

    public static void setBreed(String breed) {
        View_ReportModel.breed = breed;
    }

    public static String getContact() {
        return contact;
    }

    public static void setContact(String contact) {
        View_ReportModel.contact = contact;
    }

    public static String getTests() {
        return tests;
    }

    public static void setTests(String tests) {
        View_ReportModel.tests = tests;
    }

    public static String getResult() {
        return result;
    }

    public static void setResult(String result) {
        View_ReportModel.result = result;
    }

   
}
