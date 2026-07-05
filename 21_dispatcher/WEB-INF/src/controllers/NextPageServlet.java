package controllers;

import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;

@WebServlet("/next.do")
public class NextPageServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException , ServletException{
       
        //request handling ...
        System.out.println("Hello Next Page Walon...");


        //response generation(page creation)
       RequestDispatcher view = request.getRequestDispatcher("show.do");
       view.forward(request, response);
    }
}


