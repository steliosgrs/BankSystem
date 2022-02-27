<<<<<<< HEAD

package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Stelios Georgaras
 */
public class ViewIdServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Εμφάνιση λογαριασμού</title>");            
            out.println("</head>");

            out.println("<body>");
            out.println("<h1>Servlet ViewIdServlet at " + request.getContextPath() + "</h1>");
            
            out.println("<form class='' action='ViewIdServlet2' method='post'>");
            out.println("<h3>Εμφάνιση λογαριασμού μέσω ID</h3>");
            out.println("<label for='id'>Account ID: </label>");
            
            out.println("<input type='number' name='id' id='id' >");
            
            
            out.println("<br>");

            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
            out.println("<a href='index.html'>Menu</a>");
            out.println("</body>");
            out.println("</html>");
        }
            
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
=======

package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Stelios Georgaras
 */
public class ViewIdServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Εμφάνιση λογαριασμού</title>");            
            out.println("</head>");

            out.println("<body>");
            out.println("<h1>Servlet ViewIdServlet at " + request.getContextPath() + "</h1>");
            
            out.println("<form class='' action='ViewIdServlet2' method='post'>");
            out.println("<h3>Εμφάνιση λογαριασμού μέσω ID</h3>");
            out.println("<label for='id'>Account ID: </label>");
            
            out.println("<input type='number' name='id' id='id' >");
            
            
            out.println("<br>");

            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
            out.println("<a href='index.html'>Menu</a>");
            out.println("</body>");
            out.println("</html>");
        }
            
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
>>>>>>> cc9054e7c13b6d3ccb9d874c2f3d96d8ffb80772
