/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import daofile.daoStaff;
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
        daoStaff o=new daoStaff(smodel);
        return o.updateStaff();
    }
    public boolean delStaff(){
            daoStaff dd=new daoStaff(smodel);
            return dd.deleteStaff();
    }
    public boolean searchStaff(){
        daoStaff o=new daoStaff(smodel);
        return o.searchStaff();
    }
}





