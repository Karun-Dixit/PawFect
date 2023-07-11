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
import javax.swing.table.DefaultTableModel;
import model.EditStaffModel;
import static model.EditStaffModel.getcategory;
import static model.EditStaffModel.getcontact;
import static model.EditStaffModel.getdID;
import static model.EditStaffModel.getfield;
import static model.EditStaffModel.getname;
import static model.EditStaffModel.getshift;
import model.StaffModel;

/**
 *
 * @author kiYo
 */
public class daoStaff {
    private EditStaffModel smodel;

    public daoStaff(EditStaffModel smodel) {
        this.smodel=smodel;
    }
    
    private StaffModel model;
    public daoStaff(StaffModel model) {
        this.model=model;
    }
    public static boolean saveToStaff(String name, String field, String ph, String exp, String shift) {
        try(Connection dbconn = (Connection) DbConnection.connectDB()){
            PreparedStatement st = (PreparedStatement)
            dbconn.prepareStatement("Insert into staffs(Name,Field,Contact,Category,Shift) values(?,?,?,?,?)");
            st.setString(1,name);
            st.setString(2,field);
            st.setString(3,ph);
            st.setString(4,exp);
            st.setString(5,shift);
            int res = st.executeUpdate();
            st.close();
            dbconn.close();
            return res>0;
        }catch(SQLException ex){
            return false;
        }
    }
    
    public boolean searchStaff(){
        String dID=smodel.getdID();
        try{
            Connection dbconn = (Connection) DbConnection.connectDB();
            Statement st=(Statement)dbconn.createStatement();
            ResultSet rs = st.executeQuery("select * from staffs where ID='"+dID+"'");
            if(rs.next()){
                EditStaffModel edstaf=new EditStaffModel(dID,rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
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
   
    
    public boolean updateStaff() {
        try{
             Connection dbconn = (Connection) DbConnection.connectDB();
             Statement st=(Statement)dbconn.createStatement();
             st.executeUpdate("update staffs set Name='"+getname()+"',Field='"+getfield()+"',Contact='"+getcontact()+"',Category='"+getcategory()+"',Shift='"+getshift()+"'where ID='"+getdID()+"'");
             JOptionPane.showMessageDialog(null,"Successfully Updated!");
             return true;
        }catch(Exception e){
            return false;
        }
    }
    
    
    public boolean deleteStaff() {
        try{
                Connection dbconn = (Connection) DbConnection.connectDB();
                Statement st=(Statement)dbconn.createStatement();
                st.executeUpdate("delete from staffs where ID='"+getdID()+"'");
                JOptionPane.showMessageDialog(null,"Successfully Deleted!");
                return true;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        return false;
    }
    
    
    
    public boolean allStaffs(){
        DefaultTableModel a=model.getTableName();
        a.setRowCount(0);
        try{
            Connection connect = (Connection) DbConnection.connectDB();
            Statement statement= connect.createStatement();
            ResultSet result= statement.executeQuery("select * from staffs");
            while(result.next()){
                a.addRow(new Object[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6)});
            }
            return true;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }    
}
