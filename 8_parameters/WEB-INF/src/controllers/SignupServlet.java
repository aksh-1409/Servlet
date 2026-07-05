package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;

@WebServlet("/signup.do")
public class SignupServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String username = request.getParameter("user_name");
        String userEmail = request.getParameter("user_email");
        String userPassword = request.getParameter("user_password");

        System.out.println(username);
        System.out.println(userEmail);
        System.out.println(userPassword);


    }
}