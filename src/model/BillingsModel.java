/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kiYo
 */
public class BillingsModel {
    private static String patientID;
    private static String MedID;
    private static String patientName;
    private static String amFee;
    private static String rpFee;
    private static String totalCost;

    public static String getPatientID() {
        return patientID;
    }

    public static void setPatientID(String patientID) {
        BillingsModel.patientID = patientID;
    }

    public static String getMedID() {
        return MedID;
    }

    public static void setMedID(String MedID) {
        BillingsModel.MedID = MedID;
    }

    public static String getPatientName() {
        return patientName;
    }

    public static void setPatientName(String patientName) {
        BillingsModel.patientName = patientName;
    }

    public static String getAmFee() {
        return amFee;
    }

    public static void setAmFee(String amFee) {
        BillingsModel.amFee = amFee;
    }

    public static String getRpFee() {
        return rpFee;
    }

    public static void setRpFee(String rpFee) {
        BillingsModel.rpFee = rpFee;
    }

    public static String getTotalCost() {
        return totalCost;
    }

    public static void setTotalCost(String totalCost) {
        BillingsModel.totalCost = totalCost;
    }

    public BillingsModel(String patientID, String MedID, String patientName, String amFee, String rpFee, String totalCost) {
        this.patientID = patientID;
        this.MedID = MedID;
        this.patientName = patientName;
        this.amFee = amFee;
        this.rpFee = rpFee;
        this.totalCost = totalCost;
    }
    
}
