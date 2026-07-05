package controllers;

import java.util.Date;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

@WebServlet("/b.do")
public class BServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException , ServletException{
       
       HttpSession session = request.getSession();

       System.out.println("Session");
       System.out.println("Id:" + session.getId());
       System.out.println("Creation Time :" + new Date(session.getCreationTime()));
       System.out.println("Last Accessed Time Time: " + new Date(session.getLastAccessedTime()));
       System.out.println("Is New:" + session.isNew());
       System.out.println("Max Inactive Interval Time: " + session.getMaxInactiveInterval());

        System.out.println("--------------------------------------------");
        session.setAttribute("more_info", 987);

       request.getRequestDispatcher("b.html").forward(request,response);
    }
}


