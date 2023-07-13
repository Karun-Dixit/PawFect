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
import model.BirdsModel;
import model.EditBirdsModel;
import static model.EditBirdsModel.getNameB;
import static model.EditBirdsModel.getQualification;
import static model.EditBirdsModel.getTiming;
import static model.EditBirdsModel.getType1;
import static model.EditBirdsModel.getdID;

/**
 *
 * @author kiYo
 */
public class daoBirds {
    //Birdsss....
    private EditBirdsModel cmodel;
    
    public daoBirds(EditBirdsModel cmodel){
        this.cmodel=cmodel;
    }
    private BirdsModel birdmodel;
    public daoBirds(BirdsModel birdmodel) {
        this.birdmodel=birdmodel;
    }
    public static boolean saveToBirds(String Name, String Qualification, String Type, String Timing) {
        try(Connection dbconn = (Connection) DbConnection.connectDB()){
            PreparedStatement st = (PreparedStatement)
            dbconn.prepareStatement("Insert into Birds(Name,Qualification,Type,Timing) values(?,?,?,?)");
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
    
    //Birdsss Searching....
        public boolean searchBirds(){
        String dID=cmodel.getdID();
        try{
            Connection dbconn = (Connection) DbConnection.connectDB();
            Statement st=(Statement)dbconn.createStatement();
            ResultSet rs = st.executeQuery("select * from Birds where ID='"+dID+"'");
            if(rs.next()){
                EditBirdsModel edstaf=new EditBirdsModel(dID,rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
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
   
    //Birdsss Update....
    public boolean updateBirds() {
        try{
             Connection dbconn = (Connection) DbConnection.connectDB();
             Statement st=(Statement)dbconn.createStatement();
             st.executeUpdate("update Birds set Name='"+getNameB()+"',Qualification='"+getQualification()+"',Type='"+getType1()+"',Timing='"+getTiming()+"'where ID='"+getdID()+"'");
        }catch(Exception e){
            return false;
        }             JOptionPane.showMessageDialog(null,"Successfully Updated!");
             return true;

    }
    
    // Birdsss delete....
    public boolean deleteBirds() {
        try{
                Connection dbconn = (Connection) DbConnection.connectDB();
                Statement st=(Statement)dbconn.createStatement();
                st.executeUpdate("delete from Birds where ID='"+getdID()+"'");
                JOptionPane.showMessageDialog(null,"Successfully Deleted!");
                return true;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        return false;
    }

    //Birds All....
    public boolean allBirds(){
        DefaultTableModel a=birdmodel.getTableName();
        a.setRowCount(0);
        try{
            Connection connect = (Connection) DbConnection.connectDB();
            Statement statement= connect.createStatement();
            ResultSet result= statement.executeQuery("select * from Birds");
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
