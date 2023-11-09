/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.GUI;

/**
 *
 * @author LENOVO
 */

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Database {
    public static Connection getDatabaseCon(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db_tiketonline", "root", "");
            return con;
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
