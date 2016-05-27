/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.DataAccess;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Employee;

@WebServlet(name = "ReqEmployee", urlPatterns = {"/ReqEmployee"})
public class ReqEmployee extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException 
    {
         
         String emp_ssn = request.getParameter("emp_ssn");
         System.out.print("insise req emp.java"+emp_ssn);
         try
         {
             List<Employee> emplist=DataAccess.getEmpById(emp_ssn);
             if(emplist.size()!=0)
             {
                 request.setAttribute("emplist", emplist);
                RequestDispatcher rd = request.getRequestDispatcher("ReqEmployee.jsp");
                rd.forward(request,response);
             }
             else
             {
                 request.setAttribute("errorMessage", "Employee Record not found");
		request.getRequestDispatcher("internal error.jsp").forward(request, response);
             }
         
         /*request.setAttribute("emplist", emplist);
         RequestDispatcher rd = request.getRequestDispatcher("ReqEmployee.jsp");
         rd.forward(request,response); */
         }
         
         catch(Exception e)
         {
             try{
                 request.setAttribute("errorMessage", e.getMessage());
				request.getRequestDispatcher("internal error.jsp").forward(request, response);
             }
             catch(Exception em){
                 System.out.println(em.getMessage() + " " + e.getMessage());
             }
                 
             
         }
         
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReqEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReqEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
