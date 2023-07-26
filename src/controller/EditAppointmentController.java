/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import daofile.daoAppointment;
import model.EditAppointmentModel;
import view.EditAppointment;
/**
 *
 * @author kiYo
 */
public class EditAppointmentController {
    private EditAppointmentModel cmodel;
    private EditAppointment view;
    
    public EditAppointmentController(EditAppointmentModel cmodel, EditAppointment view){
        this.cmodel = cmodel;
        this.view = view;
        
    }
    public EditAppointmentController(EditAppointment view){
        this.view = view;
    }
    public boolean uptAppointment(){
        daoAppointment o=new daoAppointment(cmodel);
        return o.updateAppointment();
    }
    public boolean delAppointment(){
            daoAppointment dd=new daoAppointment(cmodel);
            return dd.deleteAppointment();
    }
    public boolean searchAppointment(){
        daoAppointment o=new daoAppointment(cmodel);
        return o.searchAppointment();
    }
}