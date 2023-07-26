/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kiYo
 */
public class AddAppointmentModel {
    private String DoctorName;
    private String field;
    private String time;
    private String room_no;
    private String patientName;
    

    public AddAppointmentModel(String DoctorName, String field, String time, String room_no, String patientName) {
        this.DoctorName = DoctorName;
        this.field = field;
        this.time = time;
        this.room_no = room_no;
        this.patientName = patientName;
    }
    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRoom_no() {
        return room_no;
    }

    public void setRoom_no(String room_no) {
        this.room_no = room_no;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    
    public static boolean doctornamevalidation(String var){
        if(var.equals("")){
            return false;
        } else {
            return true;
        }
    }
     
    public static boolean fieldvalidation(String var){
        if (var.equals("")){
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean timevalidation(String var){
        if (var.equals("")){
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean roomvalidation(String var){
        if(var.equals("")){
            return false;
        } else{
            return true;
        }
    }
    
    public static boolean patientnamevalidation(String var){
        if(var.equals("")){
            return false;
        } else {
            return true;
        }
    }
    
}
