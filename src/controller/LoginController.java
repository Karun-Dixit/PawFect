/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DbConnection;
import view.DashBoard;
import view.Signup;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginController {

    public static void userLogin(String username, String password) {
        Connection dbconn = (Connection) DbConnection.connectDB();
        if (dbconn != null) {
            try {
                PreparedStatement st = dbconn.prepareStatement("SELECT * FROM Users WHERE uName=? AND pass=?");
                st.setString(1, username);
                st.setString(2, password);
                ResultSet res = st.executeQuery();
                if (res.next()) {
                    DashBoard d = new DashBoard();
                    d.setTitle("Dashboard");
                    d.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Username/Password not found", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("The connection is not available.");
        }
    }
}