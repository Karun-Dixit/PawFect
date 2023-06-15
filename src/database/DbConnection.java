package database;



import javax.swing.*;

import java.sql.*;



public class DbConnection {
    static final String Db_url="jdbc:mysql://localhost:3306/pawfect";
    static final String user="root";
    static final String pass="nepal123";
    public static Connection connectDB(){
        Connection conn = null;
    
        try{
             //Class.forName("com.mysql.cj.jdbc.Driver");
             conn = DriverManager.getConnection(Db_url,user,pass);
             return conn;
           }catch (Exception ex){
               System.out.println("There were errors connecting...");
               return null;
           }
//
//            
//
//        }
    }

//    public Connection connection;
//
//    Statement statement;
//
//    ResultSet resultSet;
//
//    int value;
//
//
//
//    public DbConnection(){
//
//        try {
//
//            String username = "root";
//
//            String password = "kiyo1209";
//
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            connection = DriverManager.getConnection(
//
//                    "jdbc:mysql://localhost:3306/PawFect",username,password);
//
//
//
//                    if(connection!=null){
//
//                        System.out.println("Connected to database");
//
//                    }else{
//
//                        System.out.println("Error connecting to database");
//
//                    }
//
//            statement = connection.createStatement();
//
//        }catch (Exception e){
//
//            e.printStackTrace();
//
//        }
//
//    }
//
//
//
//    // Via the use of sql query
//
//    // insert, update and delete
//
//    public int manipulate(String query){
//
//        try {
//
//            value = statement.executeUpdate(query);
//
//            connection.close();
//
//        }catch (SQLIntegrityConstraintViolationException ex){
//
//            JOptionPane.showMessageDialog(null, "These details already exist!");
//
//        }catch (SQLException e){
//
//            e.printStackTrace();
//
//        }
//
//        return value;
//
//    }
//
//
//
//    public ResultSet retrieve(String query){
//
//        try {
//
//            resultSet = statement.executeQuery(query);
//
//        }catch (SQLException e){
//
//            e.printStackTrace();
//
//        }
//
//        return resultSet;
//
//    }
//
//
//
    public static void main(String[] args) {

        new DbConnection();

    }

}