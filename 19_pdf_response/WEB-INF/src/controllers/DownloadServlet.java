package controllers;

import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.io.*;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;

import java.io.InputStream;
import java.io.OutputStream;

@WebServlet("/java.do")
public class DownloadServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException , ServletException{
       
    response.setContentType("application/pdf");

    ServletContext context =  getServletContext();
       
    InputStream is  = context.getResourceAsStream("/WEB-INF/os.pdf");

    OutputStream os = response.getOutputStream();

    byte[] arr = new byte[256];
    int count = 0;

    while((count=is.read(arr))!=-1)
        os.write(arr);
        
    os.flush();
    os.close();
    
    }

}


