/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daofile;
import database.*;
import java.sql.*;
import model.EditDogsModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import static model.EditDogsModel.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DogsModel;
/**
 *
 * @author kiYo
 */
public class daoDogs {
    
    //DOGSSS......
    private EditDogsModel emodel;
    
    public daoDogs(EditDogsModel emodel){
        this.emodel=emodel;
    }
    private DogsModel dmodel;
    public daoDogs(DogsModel dmodel) {
        this.dmodel=dmodel;
    }
    public static boolean saveToDogs(String Name, String Qualification, String Type, String Timing) {
        try(Connection dbconn = (Connection) DbConnection.connectDB()){
            PreparedStatement st = (PreparedStatement)
            dbconn.prepareStatement("Insert into Dogs(Name,Qualification,Type,Timing) values(?,?,?,?)");
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
    
    // Dogsss Searching.....
        public boolean searchDogs(){
        String dID=emodel.getdID();
        try{
            Connection dbconn = (Connection) DbConnection.connectDB();
            Statement st=(Statement)dbconn.createStatement();
            ResultSet rs = st.executeQuery("select * from Dogs where ID='"+dID+"'");
            if(rs.next()){
                EditDogsModel edstaf=new EditDogsModel(dID,rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
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
   
    /// Dogss Update....
    public boolean updateDogs() {
        try{
             Connection dbconn = (Connection) DbConnection.connectDB();
             Statement st=(Statement)dbconn.createStatement();
             st.executeUpdate("update Dogs set Name='"+getNameD()+"',Qualification='"+getQualification()+"',Type='"+getType1()+"',Timing='"+getTiming()+"'where ID='"+getdID()+"'");
        }catch(Exception e){
            return false;
        }             JOptionPane.showMessageDialog(null,"Successfully Updated!");
             return true;

    }
    
    ///Dogsss delete.....
    public boolean deleteDogs() {
        try{
                Connection dbconn = (Connection) DbConnection.connectDB();
                Statement st=(Statement)dbconn.createStatement();
                st.executeUpdate("delete from Dogs where ID='"+getdID()+"'");
                JOptionPane.showMessageDialog(null,"Successfully Deleted!");
                return true;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        return false;
    }
    
    //Dogsss Alll....
    public boolean allDogs(){
        DefaultTableModel a=dmodel.getTableName();
        a.setRowCount(0);
        try{
            Connection connect = (Connection) DbConnection.connectDB();
            Statement statement= connect.createStatement();
            ResultSet result= statement.executeQuery("select * from Dogs");
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
