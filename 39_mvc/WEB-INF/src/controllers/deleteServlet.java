package controllers;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import java.io.IOException;
import models.Student;

@WebServlet("/del.do")
public class deleteServlet extends HttpServlet{
public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
    Integer studentId = Integer.parseInt(request.getParameter("student_id"));

    Student.deleteStudent(studentId);

    request.getRequestDispatcher("show.do").forward(request, response);
}
}