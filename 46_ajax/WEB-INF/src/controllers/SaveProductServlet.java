package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import models.User;
import javax.servlet.http.HttpSession;

import models.User;
import models.Product;


@WebServlet("/save_product.do")
public class SaveProductServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        HttpSession session = request.getSession();

        User user = (User)session.getAttribute("user");

    if(user!=null){
    String productName  =  request.getParameter("product_name");        
    Integer productQuantity  = Integer.parseInt(request.getParameter("product_quantity"));        
    Integer productPrice  = Integer.parseInt(request.getParameter("product_price"));        
    String productDescription  =  request.getParameter("product_description");   

    Product product = new Product(productName,productQuantity,productPrice, productDescription,user);

    response.getWriter().print(product.saveProduct());   
    } 
}
}
