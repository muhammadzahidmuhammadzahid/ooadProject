/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooad_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Muhammad zahid
 */

public class conn {
    public static Connection co;
    public static Connection connn() throws SQLException, ClassNotFoundException
    {
        if (co == null) {
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String s = "jdbc:sqlserver://localhost; databaseName = OOAd;user=zahid;password=147741;";
            co = DriverManager.getConnection(s);   
        }
        return co;
    }
}