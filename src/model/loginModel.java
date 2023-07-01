/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
/**
 *
 * @author kiYo
 */
public class loginModel {
    private String username, password;

    public loginModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public static boolean usernamevalidation(String var){
        if (var.equals("")){
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean passwordvalidation(String var){
        if(var.equals("")){
            return false;
        } else{
            return true;
        }
    }
}