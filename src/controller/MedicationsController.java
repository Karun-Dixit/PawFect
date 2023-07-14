/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.MedicationsModel;
import view.Medications;
import daofile.daoMedications;
/**
 *
 * @author kiYo
 */
public class MedicationsController {
    private MedicationsModel dmodel;
    private Medications view;
    
    public MedicationsController(MedicationsModel dmodel, Medications view){
        this.dmodel = dmodel;
        this.view = view;
    }
    public MedicationsController(Medications view){
        this.view = view;
    }
    public void Medications(){
            daoMedications.saveToMedications(
            dmodel.getPatientID(),
            dmodel.getMed1(),
            dmodel.getMed2(),
            dmodel.getMed3(),
            dmodel.getTotalCost()
            );
    }
}
