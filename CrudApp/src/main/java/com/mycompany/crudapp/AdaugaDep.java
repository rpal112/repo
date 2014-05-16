/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.crudapp;

import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rpal
 */
public class AdaugaDep extends HttpServlet {

   
   public AdaugaDep(){
       super();
   }
   
   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       
   }
   
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       
       Integer cod = Integer.parseInt(request.getParameter("cod"));
       String nume = request.getParameter("nume");
       Connection connection = (Connection) this.getServletContext().getAttribute("connection");
       try {
           Statement statement = connection.createStatement();
           statement.executeUpdate("INSERT INTO department (codDepartment , departmentName) values('" + cod + "','" + nume + "')");
           statement.close();
           System.out.println("A fost adaugat un nou departament");
       } catch (SQLException ex) {
           Logger.getLogger(AdaugaDep.class.getName()).log(Level.SEVERE, null, ex);
       }
       
   }

 
}
