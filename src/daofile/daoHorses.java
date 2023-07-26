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
import static model.EditHorsesModel.getNameH;
import static model.EditHorsesModel.getQualification;
import static model.EditHorsesModel.getTiming;
import static model.EditHorsesModel.getType1;
import static model.EditHorsesModel.getdID;
import model.EditHorsesModel;
import model.HorsesModel;

/**
 *
 * @author kiYo
 */
public class daoHorses {
    //Horsesss....
    private EditHorsesModel hmodel;
    
    public daoHorses(EditHorsesModel hmodel){
        this.hmodel=hmodel;
    }
    private HorsesModel horsemodel;
    public daoHorses(HorsesModel horsemodel) {
        this.horsemodel=horsemodel;
    }
    public static boolean saveToHorses(String Name, String Qualification, String Type, String Timing) {
        try(Connection dbconn = (Connection) DbConnection.connectDB()){
            PreparedStatement st = (PreparedStatement)
            dbconn.prepareStatement("Insert into Horses(Name,Qualifications,Type,Timing) values(?,?,?,?)");
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
        public boolean searchHorses(){
        String dID=hmodel.getdID();
        try{
            Connection dbconn = (Connection) DbConnection.connectDB();
            Statement st=(Statement)dbconn.createStatement();
            ResultSet rs = st.executeQuery("select * from Horses where ID='"+dID+"'");
            if(rs.next()){
                EditHorsesModel edstaf=new EditHorsesModel(dID,rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
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
   
    
    public boolean updateHorses() {
        try{
             Connection dbconn = (Connection) DbConnection.connectDB();
             Statement st=(Statement)dbconn.createStatement();
             st.executeUpdate("update Horses set Name='"+getNameH()+"',Qualifications='"+getQualification()+"',Type='"+getType1()+"',Timing='"+getTiming()+"'where ID='"+getdID()+"'");
        }catch(Exception e){
            return false;
        }             JOptionPane.showMessageDialog(null,"Successfully Updated!");
             return true;

    }
    
    public boolean deleteHorses() {
        try{
                Connection dbconn = (Connection) DbConnection.connectDB();
                Statement st=(Statement)dbconn.createStatement();
                st.executeUpdate("delete from Horses where ID='"+getdID()+"'");
                JOptionPane.showMessageDialog(null,"Successfully Deleted!");
                return true;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        return false;
    }
    
    public boolean allHorses(){
        DefaultTableModel a=horsemodel.getTableName();
        a.setRowCount(0);
        try{
            Connection connect = (Connection) DbConnection.connectDB();
            Statement statement= connect.createStatement();
            ResultSet result= statement.executeQuery("select * from Horses");
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
