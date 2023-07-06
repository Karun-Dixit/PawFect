/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daofile;
import database.*;
import java.sql.*;
import view.EditStaff;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.EditStaffModel;
import static model.EditStaffModel.*;
/**
 *
 * @author kiYo
 */
public class daoAll extends DbConnection{
    private EditStaffModel smodel;

    public daoAll(EditStaffModel smodel) {
        this.smodel=smodel;
    }
    
    public static boolean verifyLogin(String username, String password) {
        String query = "SELECT COUNT(*) FROM users WHERE uname = ? AND pass = ?";
        try (Connection connection = (Connection) DbConnection.connectDB();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, username);
            statement.setString(2, password);
            
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0;
            }
        } catch (SQLException e) {
            System.out.println("Error verifying login: " + e.getMessage());
        }
        
        return false;
    }
    
    public static boolean saveToDatabase(String fname, String lname, String ph, String uname, String pass, String connpass) {
        try(Connection dbconn = (Connection) DbConnection.connectDB()){
            PreparedStatement st = (PreparedStatement)
            dbconn.prepareStatement("Insert into Users(fName,lName,PhNum,uName,pass,connpass) values(?,?,?,?,?,?)");
            st.setString(1,fname);
            st.setString(2,lname);
            st.setString(3,ph);
            st.setString(4,uname);
            st.setString(5,pass);
            st.setString(6,connpass);
            int res = st.executeUpdate();
            st.close();
            dbconn.close();
            return res>0;
        }catch(SQLException ex){
            return false;
        }
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
    
    public static boolean deleteStaff(String dID, String name, String field, String ph, String exp, String shift) {
        try{
                Connection dbconn = (Connection) DbConnection.connectDB();
                Statement st=(Statement)dbconn.createStatement();
                st.executeUpdate("delete from staffs where ID='"+dID+"'");
                JOptionPane.showMessageDialog(null,"Successfully Deleted!");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        return false;
    }
    
//    public void tableDetails(String var){
//        DefaultTableModel dtm = (DefaultTableModel) var.getModel(staffTable);
//        dtm.setRowCount(0);
//      Statement st=null;
//      ResultSet rs=null;
//    try{
//        Connection dbconn = (Connection) DbConnection.connectDB();
//        st=(Statement)dbconn.createStatement();
//        rs = st.executeQuery("select * from staffs");
//        while(rs.next()){
//            dtm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
//        }
//    }catch(SQLException e){
//    }
//    }
    
}

