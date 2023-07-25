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
import model.View_Report1Model;
import static model.View_Report1Model.*;
import model.View_ReportModel;

/**
 *
 * @author kiYo
 */
public class daoView_Report {
    private View_Report1Model smodel;

    public daoView_Report(View_Report1Model smodel) {
        this.smodel=smodel;
    }
    
    public boolean searchView_Report(){
        String dID=smodel.getId();
        try{
            Connection dbconn = (Connection) DbConnection.connectDB();
            Statement st=(Statement)dbconn.createStatement();
            ResultSet rs = st.executeQuery("select * from patients where PatientID='"+dID+"'");
            if(rs.next()){
                View_Report1Model edstaf=new View_Report1Model(dID,rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(7),rs.getString(10),rs.getString(11));
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
    
    public boolean updateView_Report() {
        try{
             Connection dbconn = (Connection) DbConnection.connectDB();
             Statement st=(Statement)dbconn.createStatement();
             st.executeUpdate("update patients set Tests='"+getTests()+"',Report='"+getReport()+"'where PatientID='"+getId()+"'");
        }catch(Exception e){
            return false;
        }             JOptionPane.showMessageDialog(null,"Tests/Result Successfully Updated!");
             return true;
    }
    
    public boolean deleteView_Report() {
        try{
                Connection dbconn = (Connection) DbConnection.connectDB();
                Statement st=(Statement)dbconn.createStatement();
                st.executeUpdate("UPDATE patients SET Tests = null , Report=null where id='"+getId()+"'");
                JOptionPane.showMessageDialog(null,"Successfully Deleted!");
                return true;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        return false;
    }
    
}
