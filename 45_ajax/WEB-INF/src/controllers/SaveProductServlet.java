package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import models.User;
import javax.servlet.http.HttpSession;


@WebServlet("/save_product.do")
public class SaveProductServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        
    String productName  =  request.getParameter("product_name");        
    String productQuantity  = Integer.parseInt(request.getParameter("product_quantity"));        
    String productPrice  =  request.getParameter("product_price");        
    String productName  =  request.getParameter("product_name");        
}
}
