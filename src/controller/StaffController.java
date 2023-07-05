/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.StaffModel;
import view.AddStaff;
import view.EditStaff;
import daofile.daoAll;
/**
 *
 * @author kiYo
 */
public class StaffController {
    private StaffModel smodel;
    private AddStaff view;
    
    public StaffController(StaffModel smodel, AddStaff view){
        this.smodel = smodel;
        this.view = view;
    }
    public StaffController(AddStaff view){
        this.view = view;
    }
    public void addStaff(){
        if(view.isvalid()){
            daoAll.saveToStaff(
            smodel.getname(),
            smodel.getfield(),
            smodel.getcontact(),
            smodel.getcategory(),
            smodel.getshift()
            );
            view.insertData();
            
        }
    }
    public void uptStaff(){
        if(view.istovalid()){
            daoAll.updateStaff(
            smodel.getname(),
            smodel.getfield(),
            smodel.getcontact(),
            smodel.getcategory(),
            smodel.getshift()
            );
            view.updateData();
            
        }
    }
}
