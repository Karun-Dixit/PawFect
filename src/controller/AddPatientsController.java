/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import daofile.daoPatients;
import model.AddPatientsModel;
import view.AddPatients;
/**
 *
 * @author kiYo
 */
public class AddPatientsController {
    private AddPatientsModel smodel;
    private AddPatients view;
    
    public AddPatientsController(AddPatientsModel smodel, AddPatients view){
        this.smodel = smodel;
        this.view = view;
    }
    public void addPatients(){
        if(view.isvalid()){
            System.out.println("HyyyController");
            daoPatients.saveToPatients(
            smodel.getName(),
            smodel.getAge(),
            smodel.getDob(),
            smodel.getField(),
            smodel.getOwner(),
            smodel.getContact()
            );
            view.insertData();
        }
        
    }
}
