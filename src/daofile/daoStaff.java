/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daofile;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import database.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class daoStaff extends DbConnection {

    public boolean add(StudentModel mod) {
        PreparedStatement ps = null;
        Connection dbconn = (Connection) DbConnection.connectDB();

        String sql = "INSERT INTO students(first_name,last_name,age,address,email,phone_number) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            ps = dbconn.prepareStatement(sql);
            ps.setString(1, mod.getFirst_name());
            ps.setString(2, mod.getLast_name());
            ps.setInt(3, mod.getAge());
            ps.setString(4, mod.getAddress());
            ps.setString(5, mod.getEmail());
            ps.setString(6, mod.getPhone_number());
            ps.execute();
            return true;

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            try {
                dbconn.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
        return false; // Added a default return statement outside the try-catch block
    }
    
    
    
    public boolean update(StudentModel mod) {
        PreparedStatement ps = null;
        Connection dbconn = (Connection) DbConnection.connectDB();

        String sql = "UPDATE students Set first_name=? , last_name= ? , age = ?, address=?, email=?, phone_number=? WHERE student_id=?";

        try {
            ps = dbconn.prepareStatement(sql);
            ps.setString(1, mod.getFirst_name());
            ps.setString(2, mod.getLast_name());
            ps.setInt(3, mod.getAge());
            ps.setString(4, mod.getAddress());
            ps.setString(5, mod.getEmail());
            ps.setString(6, mod.getPhone_number());
            ps.setInt(7,mod.getStudent_id());
            ps.execute();
            return true;

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            try {
                dbconn.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
        return false; // Added a default return statement outside the try-catch block
    }
    
    public boolean delete(StudentModel mod) {
        PreparedStatement ps = null;
        Connection dbconn = (Connection) DbConnection.connectDB();

        String sql = "DELETE FROM students WHERE student_id=?";

        try {
            ps = dbconn.prepareStatement(sql);
            ps.setInt(1,mod.getStudent_id());
            ps.execute();
            return true;

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            try {
                dbconn.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
        return false; // Added a default return statement outside the try-catch block
    }
    
    public boolean search(StudentModel mod) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection dbconn = (Connection) DbConnection.connectDB();

        String sql = "SELECT * FROM students WHERE first_name=?";

        try {
            ps = dbconn.prepareStatement(sql);
            ps.setString(1, mod.getFirst_name());
            rs = ps.executeQuery();
            
            if (rs.next())
            {
                mod.setStudent_id(Integer.parseInt(rs.getString("student_id")));
                mod.setFirst_name(rs.getString("first_name"));
                mod.setLast_name(rs.getString("last_name"));
                mod.setAge(Integer.parseInt("age"));
                mod.setAddress(rs.getString("address"));
                mod.setEmail(rs.getString("email"));
                mod.setPhone_number(rs.getString("phone_number"));
                return true;
                
            }

            return false;

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            try {
                dbconn.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
        return false; // Added a default return statement outside the try-catch block
    }
}

