package controllers;

import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.io.*;
import javax.servlet.annotation.WebServlet;
import java.sql.Date;

@WebServlet("/show.do")
public class ShowServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException , ServletException{

       String state_name = request.getParameter("state_name");
        // Student[] names = 
        // {
        //         new Student("Mohan", 12, "aksh@gmail.com" , Date.valueOf("2003-11-02")),
        //         new Student("Roahn" , 11, "ansh@gmail.com", Date.valueOf("1999-05-12")),
        //         new Student("ram", 13,"ram@gamil.com", Date.valueOf("2001-03-21")),
        // };


           State[] st = {
                new State(1, "mp"),
                new State(2, "up"),
                new State(3, "ap")
           };

           City[] ct = {
            new City(1,"jbp",st[0]),
            new City(2, "bhopal", st[0]),
            new City(3, "jhansi", st[1]),
            new City(4, "lucknow", st[1]),
            new City(5, "hyderabad", st[2]),
            new City(6, "banglore", st[2])            
           };                   

        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.write("<!DOCTYPE html>");
        pw.write("<html lang='en'>");
        pw.write("<head>");
        pw.write("<title>::Servlet Response::</title>");
        pw.write("</head>");
        pw.write("<body>");
        pw.write("<h1>My Servlet Response...!!!</h1>");
        pw.write("<hr>");
        pw.write("<table border='1' align='center' bgcolor = 'yellow'>");
        for( State next: st){
            if(state_name == next.Statename){
                for(City next1 : ct){
                    if(state_name == next1.state.Statename){
            pw.write("<tr>");
            pw.write("<td><h2>" + next1.cityname + "</h2></td>");
             pw.write("</tr>");
            }
            }
        }
        }
        pw.write("</table>");
        pw.write("</body>");
        pw.write("</html>");
        
        pw.close();
    }
}


