package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
       String a = request.getHeader("Host");
       String b = request.getHeader("user-agent");
       String c =request.getHeader("accept");
       String d= request.getHeader("accept-language");
       String e = request.getHeader("accept-encoding");
       String f = request.getHeader("accept-charset");
       String g = request.getHeader("keep-alive");
       String n = request.getHeader("connection");

       System.out.println("Host:" + a);
       System.out.println("User - agent:" + b);
       System.out.println("Accept:" + c);
       System.out.println("Accept- language:" + d);
       System.out.println("Accept - Encoding:" + e);
       System.out.println("Accept - Charset:" + f);
       System.out.println("Keep - Alive:" + g);
       System.out.println("Connection:" + n);

    }
}