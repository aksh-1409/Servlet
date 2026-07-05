package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User{
    private Integer userId;
    private String username;
    private String email;
    private String password;

    public void setUserId(Integer userId){
        this.userId = userId;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setUserEmail(String email){
        this.email = email;
    }
    public void setUserPassword(String password){
        this.password = password;
    }

    public Integer getUserID(){
        return userId;
    }

    public String getUsername(){
        return username;
    }
    public String getUserEmail(){
        return email;
    }
    public String getUserPassword(){
        return password;
    }


    public User(String email,String password){
        this.email = email;
        this.password = password;
    }

    public boolean saveUserInfo(){
        boolean flag = false;
        try{
            
        Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("YOUR_DB_URL", "YOUR_DB_USER", "YOUR_DB_PASSWORD");

            String query = "insert into users (name,email,password) value (?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setString(1, username);
            ps.setString(2, email);
            ps.setString(3, password);
            
            int val = ps.executeUpdate();

            if(val == 1)
            flag = true;

           
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
         return flag;
    }


      public boolean signInUser(){
        boolean flag = false;
        try{
            
        Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("YOUR_DB_URL", "YOUR_DB_USER", "YOUR_DB_PASSWORD");

            String query = "select * from users where email=? and password=?";

            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setString(1,email);
            ps.setString(2, password);
            
            
            ResultSet set = ps.executeQuery();

            if(set.next()){
                userId = set.getInt("user_id");
               username =  set.getString("name");
                flag = true;
            }
            

           con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
         return flag;
    }
}
