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
import static model.AppointmentModel.*;
import model.AppointmentModel;
/**
 *
 * @author kiYo
 */
public class daoAppointment {
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
    
}
