/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.StaffModel;
import view.Staff;
import daofile.daoLogin;
/**
 *
 * @author kiYo
 */
public class StaffController {
    private StaffModel smodel;
    private Staff view;
    
    public StaffController(StaffModel smodel, Staff view){
        this.smodel = smodel;
        this.view = view;
    }
    public StaffController(Staff view){
        this.view = view;
    }
    public void signupuser(){
        if(view.isvalid()){
            daoLogin.saveToDatabase(
            smodel.getfname(),
            smodel.getlname(),
            smodel.getph(),
            smodel.getuname(),
            smodel.getpass(),
            smodel.getconnpass()
            );
            view.insertData();
            
        }
    }
}
