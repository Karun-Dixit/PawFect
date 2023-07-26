/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.PatientsModel;
import view.Patients;
import daofile.daoPatients;
/**
 *
 * @author kiYo
 */
public class PatientsController {
    private PatientsModel model;
    private Patients view;
    public PatientsController(PatientsModel model, Patients view) {
        this.model=model;
        this.view=view;
    }

    public boolean allPatients(){
        daoPatients object=new daoPatients(model);
        return object.allPatients();
    }
}