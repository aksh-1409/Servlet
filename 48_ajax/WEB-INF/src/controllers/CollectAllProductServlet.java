package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import javax.servlet.http.HttpSession;
import models.User;
import models.Product;
import com.google.gson.Gson;
import java.util.ArrayList;

@WebServlet("/all_products.do")
public class CollectAllProductServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
    HttpSession session = request.getSession();
        
    User user = (User)session.getAttribute("user");
    String result = "session_expired";
    if(user!=null){
    ArrayList<Product> products = Product.fetchAllProducts(user.getUserID());

    Gson gson = new Gson();
    result = gson.toJson(products);
    }
    
    response.getWriter().write(result);
    
  }
}
