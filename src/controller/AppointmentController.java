/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import daofile.daoAppointment;
import model.AppointmentModel;
import view.Appointment;
/**
 *
 * @author kiYo
 */
public class AppointmentController {
    private AppointmentModel model;
    private Appointment view;
    public AppointmentController(AppointmentModel model, Appointment view) {
        this.model=model;
        this.view=view;
    }

    public boolean allAppointment(){
        daoAppointment object=new daoAppointment(model);
        return object.allAppointment();
    }
}
