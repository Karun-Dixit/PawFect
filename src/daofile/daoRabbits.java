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
import model.RabbitsModel;
import model.EditRabbitsModel;
import static model.EditRabbitsModel.getNameC;
import static model.EditRabbitsModel.getQualification;
import static model.EditRabbitsModel.getTiming;
import static model.EditRabbitsModel.getType1;
import static model.EditRabbitsModel.getdID;

/**
 *
 * @author kiYo
 */
public class daoRabbits {
//    Rabbitsss....
    private EditRabbitsModel cmodel;
    
    public daoRabbits(EditRabbitsModel cmodel){
        this.cmodel=cmodel;
    }
    private RabbitsModel rabbitmodel;
    public daoRabbits(RabbitsModel rabbitmodel) {
        this.rabbitmodel=rabbitmodel;
    }
    public static boolean saveToRabbits(String Name, String Qualification, String Type, String Timing) {
        try(Connection dbconn = (Connection) DbConnection.connectDB()){
            PreparedStatement st = (PreparedStatement)
            dbconn.prepareStatement("Insert into Rabbits(Name,Qualifications,Type,Timing) values(?,?,?,?)");
            st.setString(1,Name);
            st.setString(2,Qualification);
            st.setString(3,Type);
            st.setString(4,Timing);
            int res = st.executeUpdate();
            JOptionPane.showMessageDialog(null, "User data inserted", "Success", JOptionPane.INFORMATION_MESSAGE);
            st.close();
            dbconn.close();
            return res>0;
        }catch(SQLException ex){
            return false;
        }
    }
    
    //Rabbitsss Searching....
        public boolean searchRabbits(){
        String dID=cmodel.getdID();
        try{
            Connection dbconn = (Connection) DbConnection.connectDB();
            Statement st=(Statement)dbconn.createStatement();
            ResultSet rs = st.executeQuery("select * from Rabbits where ID='"+dID+"'");
            if(rs.next()){
                EditRabbitsModel edstaf=new EditRabbitsModel(dID,rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
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
   
    //Rabbitsss Update....
    public boolean updateRabbits() {
        try{
             Connection dbconn = (Connection) DbConnection.connectDB();
             Statement st=(Statement)dbconn.createStatement();
             st.executeUpdate("update Rabbits set Name='"+getNameC()+"',Qualification='"+getQualification()+"',Type='"+getType1()+"',Timing='"+getTiming()+"'where ID='"+getdID()+"'");
        }catch(Exception e){
            return false;
        }             JOptionPane.showMessageDialog(null,"Successfully Updated!");
             return true;

    }
    
    // Rabbitsss delete....
    public boolean deleteRabbits() {
        try{
                Connection dbconn = (Connection) DbConnection.connectDB();
                Statement st=(Statement)dbconn.createStatement();
                st.executeUpdate("delete from Rabbits where ID='"+getdID()+"'");
                JOptionPane.showMessageDialog(null,"Successfully Deleted!");
                return true;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        return false;
    }
    
    //Rabbits All....
    public boolean allRabbits(){
        DefaultTableModel a=rabbitmodel.getTableName();
        a.setRowCount(0);
        try{
            Connection connect = (Connection) DbConnection.connectDB();
            Statement statement= connect.createStatement();
            ResultSet result= statement.executeQuery("select * from Rabbits");
            while(result.next()){
                a.addRow(new Object[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5)});
            }
            return true;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }    
    
}
