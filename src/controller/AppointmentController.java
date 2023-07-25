/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.AppointmentModel;
import view.Appointment;
//import daofile.daoAppointment;
/**
 *
 * @author kiYo
 */
public class AppointmentController {
    private AppointmentModel smodel;
    private Appointment view;
    
    public AppointmentController(AppointmentModel smodel, Appointment view){
        this.smodel = smodel;
        this.view = view;
    }
    public AppointmentController(Appointment view){
        this.view = view;
    }
    public void Appointment(){
//        if(view.isvalid()){
//            daoAppointment.saveToAppointment(
//            smodel.getDoctorName(),
//            smodel.getField(),
//            smodel.getTime(),
//            smodel.getRoom_no(),
//            smodel.getPatientName()
//            );
//            view.insertData();
//            
//        }
    }
}
