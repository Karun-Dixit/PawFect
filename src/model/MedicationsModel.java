/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kiYo
 */
public class MedicationsModel {
    private String patientID;
    private    String Med1;
    private    String Med2;
    private    String Med3;
    private    String totalCost;

    public MedicationsModel(String patientID, String Med1, String Med2, String Med3, String totalCost) {
        this.patientID = patientID;
        this.Med1 = Med1;
        this.Med2 = Med2;
        this.Med3 = Med3;
        this.totalCost = totalCost;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getMed1() {
        return Med1;
    }

    public void setMed1(String Med1) {
        this.Med1 = Med1;
    }

    public String getMed2() {
        return Med2;
    }

    public void setMed2(String Med2) {
        this.Med2 = Med2;
    }

    public String getMed3() {
        return Med3;
    }

    public void setMed3(String Med3) {
        this.Med3 = Med3;
    }

    public String getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    
}
