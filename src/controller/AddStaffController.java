/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.AddStaffModel;
import view.AddStaff;
import daofile.daoStaff;
/**
 *
 * @author kiYo
 */
public class AddStaffController {
    private AddStaffModel smodel;
    private AddStaff view;
    
    public AddStaffController(AddStaffModel smodel, AddStaff view){
        this.smodel = smodel;
        this.view = view;
    }
    public AddStaffController(AddStaff view){
        this.view = view;
    }
    public void addStaff(){
        if(view.isvalid()){
            daoStaff.saveToStaff(
            smodel.getname(),
            smodel.getfield(),
            smodel.getcontact(),
            smodel.getcategory(),
            smodel.getshift()
            );
            view.insertData();
            
        }
    }
}
