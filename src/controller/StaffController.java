/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.StaffModel;
import view.Staff;
import daofile.daoStaff;
/**
 *
 * @author kiYo
 */
public class StaffController {
    private StaffModel model;
    private Staff view;
    public StaffController(StaffModel model, Staff view) {
        this.model=model;
        this.view=view;
    }

    public boolean allStaffs(){
        daoStaff object=new daoStaff(model);
        return object.allStaffs();
    }
}
