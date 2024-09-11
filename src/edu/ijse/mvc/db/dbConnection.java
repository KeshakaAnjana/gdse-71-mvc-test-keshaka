/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Keshaka
 */
public class dbConnection {
    private static dbConnection dbConnection;
    
    private Connection Connection;
    
    private dbConnection()throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Supermarket", "root", "ijse@1234");
        
    }
    
    public static dbConnection getInstance()throws SQLException, ClassNotFoundException{
        if(dbConnection == null){
            dbConnection = new dbConnection();
        }
        return dbConnection;
    }
     public Connection getConnection(){
        return Connection;
    }
}
