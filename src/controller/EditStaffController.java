/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import daofile.daoAll;
import model.EditStaffModel;
import view.EditStaff;

/**
 *
 * @author kiYo
 */
public class EditStaffController {
    private EditStaffModel smodel;
    private EditStaff view;
    
    public EditStaffController(EditStaffModel smodel, EditStaff view){
        this.smodel = smodel;
        this.view = view;
        
    }
    public EditStaffController(EditStaff view){
        this.view = view;
    }
    public boolean uptStaff(){
        daoAll o=new daoAll(smodel);
        return o.updateStaff();
    }
    public void delStaff(){
            daoAll.deleteStaff(
            smodel.getdID(),
            smodel.getname(),
            smodel.getfield(),
            smodel.getcontact(),
            smodel.getcategory(),
            smodel.getshift()
            );
            view.deleteData();
    }
    public boolean searchStaff(){
        daoAll o=new daoAll(smodel);
        return o.searchStaff();
    }
}





