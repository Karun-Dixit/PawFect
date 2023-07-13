/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import daofile.daoPatients;
import model.EditPatientsModel;
import view.EditPatients;
/**
 *
 * @author kiYo
 */
public class EditPatientsController {
    private EditPatientsModel smodel;
    private EditPatients view;
    
    public EditPatientsController(EditPatientsModel smodel, EditPatients view){
        this.smodel = smodel;
        this.view = view;
        
    }
    public EditPatientsController(EditPatients view){
        this.view = view;
    }
    public boolean uptPatients(){
        daoPatients o=new daoPatients(smodel);
        return o.updatePatients();
    }
    public boolean delPatients(){
            daoPatients dd=new daoPatients(smodel);
            return dd.deletePatients();
    }
    public boolean searchPatients(){
        daoPatients o=new daoPatients(smodel);
        return o.searchPatients();
    }
}
