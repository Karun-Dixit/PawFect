/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kiYo
 */
public class SignUpModel {
    private String fname; 
    private String lname;
    private String ph;
    private String uname;
    private String pass;
    private String connpass;

    public SignUpModel(String fname, String lname, String ph, String uname, String pass, String connpass) {
        this.fname = fname;
        this.lname = lname;
        this.ph = ph;
        this.uname = uname;
        this.pass = pass;
        this.connpass = connpass;
    }

    public String getfname() {
        return fname;
    }

    public void setfname(String fname) {
        this.fname = fname;
    }

    public String getlname() {
        return lname;
    }

    public void setlname(String lname) {
        this.lname = lname;
    }

    public String getph() {
        return ph;
    }

    public void setph(String ph) {
        this.ph = ph;
    }

    public String getuname() {
        return uname;
    }

    public void setuname(String uname) {
        this.uname = uname;
    }

    public String getpass() {
        return pass;
    }

    public void setpass(String pass) {
        this.pass = pass;
    }

    public String getconnpass() {
        return connpass;
    }

    public void setconnpass(String connpass) {
        this.connpass = connpass;
    }
    
    public static boolean firstnamevalidation(String var){
        if (var.equals("")){
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean lastnamevalidation(String var){
        if (var.equals("")){
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean usernamevalidation(String var){
        if (var.equals("")){
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean phnumvalidation(String var){
        if (var.equals("")){
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean phnumlengthvalidation(String var){
        if (var.length()!=10){
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean pwdvalidation(String var){
        if(var.equals("")){
            return false;
        } else{
            return true;
        }
    }
    
    public static boolean conpwvalidation(String var){
        if(var.equals("")){
            return false;
        } else{
            return true;
        }
    }
    
    public static boolean samepwdvalidation(String var1,String var2){
        if (var1.equals(var2)){
            return true;
        } else {
            return false;
        }
        }
}
