/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import view.Login;
import model.loginModel;
import daofile.daoLS;


public class LoginController {

    private loginModel lmodel;
    private Login view;
    
    public LoginController(loginModel lmodel, Login view){
        this.lmodel = lmodel;
        this.view = view;
    }
    
    public boolean verifyuser(){
        if(view.isvalid()){
            if(daoLS.verifyLogin(lmodel.getUsername(),lmodel.getPassword())){
            } else{
            }
   }
        return true;
   }
}