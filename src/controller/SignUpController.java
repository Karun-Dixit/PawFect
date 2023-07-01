/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.SignUpModel;
import view.Signup;
import daofile.daoLogin;


/**
 *
 * @author kiYo
 */
public class SignUpController {
    private SignUpModel smodel;
    private Signup view;
    
    public SignUpController(SignUpModel smodel, Signup view){
        this.smodel = smodel;
        this.view = view;
    }
    public SignUpController(Signup view){
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
