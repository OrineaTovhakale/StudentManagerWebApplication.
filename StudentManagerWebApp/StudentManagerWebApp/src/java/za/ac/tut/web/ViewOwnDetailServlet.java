/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.StudentFacadeLocal;
import za.ac.tut.entity.Student;

/**
 *
 * @author Ranku
 */
public class ViewOwnDetailServlet extends HttpServlet {

   
    @EJB
    private StudentFacadeLocal studentFacade;
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
      String username = request.getRemoteUser();
        Student student = studentFacade.find(username);
        request.setAttribute("student", student);
        request.getRequestDispatcher("view_own_details_outcome.jsp").forward(request, response);  
        
       
    }

    

}
