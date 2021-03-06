/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.DataAccess;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lipi Patel
 */
@WebServlet(name = "AllEmployees", urlPatterns = {"/AllEmployees"})
public class AllEmployees extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException
    {
        
        request.setAttribute("AllEmployees", DataAccess.getAll());
      
     
        RequestDispatcher rd=request.getRequestDispatcher("AllEmployees.jsp");
        rd.forward(request, response);
      
    }

     protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try
        {
            processRequest(request, response);
        } 
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

     
     
      protected void doPOST(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try
        {
            processRequest(request, response);
        } 
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    
}
