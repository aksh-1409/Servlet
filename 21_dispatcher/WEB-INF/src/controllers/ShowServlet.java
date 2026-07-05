package controllers;

import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;

@WebServlet("/show.do")
public class ShowServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException , ServletException{
       
        //request handling ...
        System.out.println("Hello Show Page Walon...");


        //response generation(page creation)
       RequestDispatcher view = request.getRequestDispatcher("next.html");
       view.forward(request, response);
    }
}


