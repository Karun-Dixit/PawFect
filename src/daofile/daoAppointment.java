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
import model.AppointmentModel;
import static model.EditAppointmentModel.*;
import static model.EditAppointmentModel.getdID;
import model.EditAppointmentModel;
/**
 *
 * @author kiYo
 */
public class daoAppointment {
    private EditAppointmentModel cmodel;
    
    public daoAppointment(EditAppointmentModel cmodel){
        this.cmodel=cmodel;
    }
    private AppointmentModel appmodel;
    public daoAppointment(AppointmentModel appmodel) {
        this.appmodel=appmodel;
    }
    public static boolean saveToAppointment(String name, String field, String ph, String exp, String exp1) {
        try(Connection dbconn = (Connection) DbConnection.connectDB()){
            PreparedStatement st = (PreparedStatement)
            dbconn.prepareStatement("Insert into appointment(DOCTOR_NAME,FIELD,TIME,ROOM_NO,PATIENT_NAME) values(?,?,?,?,?)");
            st.setString(1,name);
            st.setString(2,field);
            st.setString(3,ph);
            st.setString(4,exp);
            st.setString(5,exp1);
            int res = st.executeUpdate();
            JOptionPane.showMessageDialog(null, "User data inserted", "Success", JOptionPane.INFORMATION_MESSAGE);
            st.close();
            dbconn.close();
            return res>0;
        }catch(SQLException ex){
            return false;
        }
    }
    
    //Appointmentss Searching....
        public boolean searchAppointment(){
        String dID=cmodel.getdID();
        try{
            Connection dbconn = (Connection) DbConnection.connectDB();
            Statement st=(Statement)dbconn.createStatement();
            ResultSet rs = st.executeQuery("select * from appointment where SN='"+dID+"'");
            if(rs.next()){
                EditAppointmentModel edstaf=new EditAppointmentModel(dID,rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
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
   
    //Appointmentss Update....
    public boolean updateAppointment() {
        try{
             Connection dbconn = (Connection) DbConnection.connectDB();
             Statement st=(Statement)dbconn.createStatement();
             st.executeUpdate("update appointment set DOCTOR_NAME='"+getDoctorName()+"',FIELD='"+getField()+"',TIME='"+getTime()+"',ROOM_NO='"+getRoom_no()+"',PATIENT_NAME='"+getPatientName()+"'where SN='"+getdID()+"'");
        }catch(Exception e){
            return false;
        }             JOptionPane.showMessageDialog(null,"Successfully Updated!");
             return true;

    }
    
    // Appointmentss delete....
    public boolean deleteAppointment() {
        try{
                Connection dbconn = (Connection) DbConnection.connectDB();
                Statement st=(Statement)dbconn.createStatement();
                st.executeUpdate("delete from appointment where SN='"+getdID()+"'");
                JOptionPane.showMessageDialog(null,"Successfully Deleted!");
                return true;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        return false;
    }
    
    //Appointments All....
    public boolean allAppointment(){
        DefaultTableModel a=appmodel.getTableName();
        a.setRowCount(0);
        try{
            Connection connect = (Connection) DbConnection.connectDB();
            Statement statement= connect.createStatement();
            ResultSet result= statement.executeQuery("select * from appointments");
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
