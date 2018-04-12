/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelles.Administrateur;
import modelles.User;

/**
 *
 * @author Joubert
 */
@WebServlet(name = "BrowserControl", urlPatterns = {"/BrowserControl"})
public class BrowserControl extends HttpServlet {

    private User loggedUser;
    
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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BrowserControl</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BrowserControl at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    private void connection(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
        String id = request.getParameter("id");
        String password = request.getParameter("password");        
        System.out.println("id : " +id);
        System.out.println("password : " +password);
        
        this.loggedUser = new Administrateur("AAA","Jerome","lala","jerom@gamil.com");
        
        switch (loggedUser.getType()) {
            case "Administrateur":
                Administrateur loggedAdmin = (Administrateur) this.loggedUser;
                System.out.println("IdAmind : " +loggedAdmin.getIdAmind());
                response.sendRedirect( "resources/pages/test.html"); 
                
                break;
            case "Etudiant":
                
                response.sendRedirect( "resources/pages/etudiant.html"); 
                
                break;
            case "Intervenant":
                
                response.sendRedirect( "resources/pages/intervenant.html"); 
                
                break;
            default:
                
                
                break;
        }
    }
    
    
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////        String delete = request.getParameter("delete");
//
//        response.sendRedirect( "/test.jsp"); // Refresh page with table.
//    }
    



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
        
               
        
        
        switch (request.getParameter("page")) {
            case "Connection":
                    this.connection(request, response);
                 break;                 
            default:
                break;
        
        }
        
//        response.sendRedirect( "resources/pages/admin.html"); // Refresh page with table.   
        
        
        processRequest(request, response);
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
       
        
        processRequest(request, response);
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
