/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kiYo
 */
public class EditAppointmentModel {
    private static String dID;
    private static String DoctorName;
    private static String field;
    private static String time;
    private static String room_no;
    private static String patientName;

    public EditAppointmentModel(String dID, String DoctorName, String field, String time, String room_no, String patientName) {
        this.dID = dID;
        this.DoctorName = DoctorName;
        this.field = field;
        this.time = time;
        this.room_no = room_no;
        this.patientName = patientName;
    }

    public static String getdID() {
        return dID;
    }

    public static void setdID(String dID) {
        EditAppointmentModel.dID = dID;
    }

    public static String getDoctorName() {
        return DoctorName;
    }

    public static void setDoctorName(String DoctorName) {
        EditAppointmentModel.DoctorName = DoctorName;
    }

    public static String getField() {
        return field;
    }

    public static void setField(String field) {
        EditAppointmentModel.field = field;
    }

    public static String getTime() {
        return time;
    }

    public static void setTime(String time) {
        EditAppointmentModel.time = time;
    }

    public static String getRoom_no() {
        return room_no;
    }

    public static void setRoom_no(String room_no) {
        EditAppointmentModel.room_no = room_no;
    }

    public static String getPatientName() {
        return patientName;
    }

    public static void setPatientName(String patientName) {
        EditAppointmentModel.patientName = patientName;
    }
    
    
    
}
