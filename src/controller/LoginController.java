/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DbConnection;
import view.Login;
import model.loginModel;
import daofile.daoLogin;
import javax.swing.JOptionPane;

public class LoginController {

    private loginModel lmodel;
    private Login view;
    
    public LoginController(loginModel lmodel, Login view){
        this.lmodel = lmodel;
        this.view = view;
    }
    
    public void verifyuser(){
        if(view.isvalid()){
            if(daoLogin.verifyLogin(lmodel.getUsername(),lmodel.getPassword())){
            } else{
            }
   }
   }
}