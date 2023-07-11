/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daofile;

import database.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author kiYo
 */
public class daoPatients {
    public static boolean saveToPatients(String name, String age, String dob, String field, String owner, String contact) {
        try(Connection dbconn = (Connection) DbConnection.connectDB()){
            PreparedStatement st = (PreparedStatement)
            dbconn.prepareStatement("Insert into patients(PatientName,Age,DOB,Field,OwnerName,Contact) values(?,?,?,?,?,?)");
            st.setString(1,name);
            st.setString(2,age);
            st.setString(3,dob);
            st.setString(4,field);
            st.setString(5,owner);
            st.setString(5,contact);
            int res = st.executeUpdate();
            st.close();
            dbconn.close();
            return res>0;
        }catch(SQLException ex){
            return false;
        }
    }
}
