package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Product{
    private Integer productId;
    private String name;
    private Integer quantity;
    private Integer price;
    private String description;
    private User user; 

    public Product(String name, Integer quantity,Integer price,String description, User user){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
        this.user = user;
    }
    public Product(Integer productId,String name, Integer quantity,Integer price,String description){
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
    }


    public Integer getProductId() {
        return productId;
    }
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }


    public boolean saveProduct(){
         boolean flag = false;
         try{
            
        Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("YOUR_DB_URL", "YOUR_DB_USER", "YOUR_DB_PASSWORD");

           String query = "insert into products (name,quantity,price,description,user_id) value (?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setString(1,name);
            ps.setInt(2, quantity);
            ps.setInt(3, price);
            ps.setString(4, description);
            ps.setInt(5, user.getUserID());

            int val = ps.executeUpdate();

            if(val == 1)
            flag = true;
            

           con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
         return flag;
    }


    public static ArrayList<Product> fetchAllProducts(Integer userId){
        ArrayList<Product> list = new ArrayList<>();

        try{
            
        Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("YOUR_DB_URL", "YOUR_DB_USER", "YOUR_DB_PASSWORD");

           String query = "Select * from products where user_id=?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,userId);

            ResultSet set =  ps.executeQuery();

            while(set.next()){
            Integer prProductId = set.getInt("product_id"); 
            String prName = set.getString("name");
            Integer prQuantity = set.getInt("quantity");
            Integer prPrice = set.getInt("price");
            String prDescription = set.getString("description");

            Product products = new Product(prProductId,prName,prQuantity,prPrice,prDescription);

            list.add(products);
            }
            

           con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }

        return list;

    }
}
