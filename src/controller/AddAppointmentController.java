/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.AddAppointmentModel;
import view.AddAppointment;
import daofile.daoAppointment;
/**
 *
 * @author kiYo
 */
public class AddAppointmentController {
    private AddAppointmentModel smodel;
    private AddAppointment view;
    
    public AddAppointmentController(AddAppointmentModel smodel, AddAppointment view){
        this.smodel = smodel;
        this.view = view;
    }
    public AddAppointmentController(AddAppointment view){
        this.view = view;
    }
    public void addAppointment(){
        if(view.isvalid()){
            daoAppointment.saveToAppointment(
            smodel.getDoctorName(),
            smodel.getField(),
            smodel.getTime(),
            smodel.getRoom_no(),
            smodel.getPatientName()
            );
            view.insertData();
            
        }
    }
}
