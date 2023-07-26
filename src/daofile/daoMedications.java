/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daofile;

import database.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author kiYo
 */
public class daoMedications {
    //MedicationsSS......
    public static boolean saveToMedications(String PName, String Med1, String Med2, String Med3, String totalCost) {
        try (Connection dbconn = (Connection) DbConnection.connectDB()) {
        PreparedStatement st = (PreparedStatement) dbconn.prepareStatement("INSERT INTO meds (PatientID, Med1, Med2, Med3, tmfees) VALUES (?,?,?,?,?)");

        st.setString(1, PName);
        st.setString(5, totalCost);

        // Check and set Med1, Med2, and Med3 values to null if empty
        st.setString(2, Med1.isEmpty() ? null : Med1);
        st.setString(3, Med2.isEmpty() ? null : Med2);
        st.setString(4, Med3.isEmpty() ? null : Med3);

        int res = st.executeUpdate();
        JOptionPane.showMessageDialog(null, "The prescribed meds are saved!!", "Success", JOptionPane.INFORMATION_MESSAGE);
        st.close();
        dbconn.close();
        return res > 0;
    } catch (SQLException ex) {
        return false;
    }
    }
}
