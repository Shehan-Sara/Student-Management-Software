/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Shehan Rashmika
 */
public class Database {
    
    private final String DB_URL = "jdbc:mysql://localhost:3306/abc";
    private final String DB_USERNAME = "root";
    private final String DB_PASSWORD = "";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
    }
    
    
    
}
