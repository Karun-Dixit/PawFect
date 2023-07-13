/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daofile;

import database.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static model.EditPatientsModel.*;
import model.EditPatientsModel;
//import model.PatientsModel;

/**
 *
 * @author kiYo
 */
public class daoPatients {
    private EditPatientsModel smodel;

    public daoPatients(EditPatientsModel smodel) {
        this.smodel=smodel;
    }
    
//    private PatientsModel model;
//    public daoPatients(PatientsModel model) {
//        this.model=model;
//    }
    
    public static boolean saveToPatients(String name, String age, String dob, String field, String owner, String contact) {
        System.out.println(name);
        try(Connection dbconn = (Connection) DbConnection.connectDB()){
            PreparedStatement st = (PreparedStatement)
            dbconn.prepareStatement("Insert into patients(PatientName,Age,DOB,Field,OwnerName,Contact) values(?,?,?,?,?,?)");
            st.setString(1,name);
            st.setString(2,age);
            st.setString(3,dob);
            st.setString(4,field);
            st.setString(5,owner);
            st.setString(6,contact);
            int res = st.executeUpdate();
            JOptionPane.showMessageDialog(null, "User data inserted", "Success", JOptionPane.INFORMATION_MESSAGE);
            st.close();
            dbconn.close();
            return res>0;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());  
            return false;
        }
    }
    
    public boolean searchPatients(){
        String dID=smodel.getdID();
        try{
            Connection dbconn = (Connection) DbConnection.connectDB();
            Statement st=(Statement)dbconn.createStatement();
            ResultSet rs = st.executeQuery("select * from patients where ID='"+dID+"'");
            if(rs.next()){
                EditPatientsModel edstaf=new EditPatientsModel(dID,rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
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
   
    
    public boolean updatePatients() {
        try{
             Connection dbconn = (Connection) DbConnection.connectDB();
             Statement st=(Statement)dbconn.createStatement();
             st.executeUpdate("update patients set PatientName='"+getName()+"',Age='"+getAge()+"',DOB='"+getDob()+"',Field='"+getField()+"',OwnerName='"+getOwner()+"',Contact='"+getContact()+"'where ID='"+getdID()+"'");
             JOptionPane.showMessageDialog(null,"Successfully Updated!");
             return true;
        }catch(Exception e){
            return false;
        }
    }
    
    
    public boolean deletePatients() {
        try{
                Connection dbconn = (Connection) DbConnection.connectDB();
                Statement st=(Statement)dbconn.createStatement();
                st.executeUpdate("delete from patients where ID='"+getdID()+"'");
                JOptionPane.showMessageDialog(null,"Successfully Deleted!");
                return true;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        return false;
    }
    
}
