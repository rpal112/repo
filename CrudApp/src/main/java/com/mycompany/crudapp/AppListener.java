/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.crudapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author rpal
 */
public class AppListener implements ServletContextListener {

    private static Connection connection = null;

    public AppListener() {

    }

    @Override
    public void contextInitialized(ServletContextEvent e) {
      ServletContext context = e.getServletContext();
      String db = "info.db";
      String dbPath = context.getRealPath("/");
        System.out.println(dbPath);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root", "root");
            if(connection!=null){
            context.setAttribute("connection", connection);
                System.out.println("Conexiune realizata");
        }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AppListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent e) {
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AppListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
