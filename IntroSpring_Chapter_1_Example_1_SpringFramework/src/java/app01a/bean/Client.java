/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app01a.bean;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author MIchail
 */
public class Client extends HttpServlet {
 ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring-config.xml"});
    Product product1 = context.getBean("product", Product.class);
    
  
    Product product2 = context.getBean("product", Product.class);
    
    Product featuredProduct = context.getBean("featuredProduct", Product.class);
    Calendar calendar = context.getBean("calendar", java.util.Calendar.class);
    
    Employee employee1 = context.getBean("employee1", Employee.class);
    Employee employee2 = context.getBean("employee2", Employee.class);
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
            out.println("<title>Servlet Client</title>");            
            out.println("</head>");
            out.println("<body>");
           
           
            product1.setName("Excellent snake oil");
            out.println("<h1>product1: " + product1.getName() + "</h1>");
            out.println("<h1>product2: " + product2.getName() + "</h1>");
            out.println("<h1>featuredProduct: " + featuredProduct.getName() +", "+featuredProduct.getDescription()
                    +", "+featuredProduct.getPrice()+"</h1>");
            out.println("<h1>Calendar Time: " + calendar.getTime() + "</h1>");
            out.println("<h1>Employee 1 home address: " + employee1.getHomeAddress() + "</h1>");
            out.println("<h1>Employee 1 first name: " + employee1.getFirstName() + "</h1>");
             out.println("<h1>Employee 2 home address: " + employee2.getHomeAddress() + "</h1>");
            out.println("<h1>Employee 2 first name: " + employee2.getFirstName() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
