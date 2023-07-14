/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daofile;

import database.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.BillingsModel;
import model.BillingsModel;

/**
 *
 * @author kiYo
 */
public class daoBillings {
    private BillingsModel smodel;

    public daoBillings(BillingsModel smodel) {
        this.smodel=smodel;
    }
    public boolean searchBillings(){
        String dID=smodel.getPatientID();
        try{
            Connection dbconn = (Connection) DbConnection.connectDB();
            Statement st=(Statement)dbconn.createStatement();
            ResultSet rs = st.executeQuery("select * from patients where PatientID='"+dID+"'");
            if(rs.next()){
                BillingsModel edstaf=new BillingsModel(dID,rs.getString(4),rs.getString(2),rs.getString(8),rs.getString(9),rs.getString(6));
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Such ID doestn't exist!");
                return false;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return false;
    }
    
    public boolean searchMeds(){
        String dID=smodel.getPatientID();
        String mID=smodel.getMedID();
        try{
            Connection dbconn = (Connection) DbConnection.connectDB();
            Statement st=(Statement)dbconn.createStatement();
            ResultSet rs = st.executeQuery("select * from meds where PatientID ='"+dID+"' and MedID = '"+mID+"'");
            if(rs.next()){
                BillingsModel edstaf=new BillingsModel(dID,rs.getString(1),rs.getString(1),rs.getString(1),rs.getString(1),rs.getString(6));
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Such ID doestn't exist!");
                return false;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return false;
    }
}
