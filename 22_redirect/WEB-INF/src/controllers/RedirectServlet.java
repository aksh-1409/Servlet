package controllers;

import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;

@WebServlet("/redirect.do")
public class RedirectServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException , ServletException{
       

        response.sendRedirect("https://rgpv.ac.in");
        response.sendRedirect("https://www.porsche.com/international/");
        
    }
}


