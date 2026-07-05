package models;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class Student{
    private Integer studentId;
    private String studentName;
    private String studentCollege;
    private Integer studentAge;
    private Float studentMarks;

    // public Student(String studentName, String studentCollege, Integer studentAge, Float studentMarks){
    //     this.studentName = studentName;
    //     this.studentCollege = studentCollege;
    //     this.studentAge = studentAge;
    //     this.studentMarks = studentMarks;
    // }


    public void setStudentCollege(String studentCollege){
        this.studentCollege = studentCollege;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public void setStudentAge(Integer studentAge){
        this.studentAge = studentAge;
    }
    public void setStudentMarks(Float studentMarks){
        this.studentMarks = studentMarks;
    }
    public void setStudentId(Integer studentId){
        this.studentId = studentId;
    }



    public String getStudentCollege(){
        return studentCollege;
    }

    public Integer getStudentAge(){
        return studentAge;
    }

    public String getStudentName(){
        return studentName;
    }

    public Float getStudentMarks(){
        return studentMarks;
    }

    public Integer getStudentId(){
        return studentId;
    }



    public void saveStudent(){

            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(System.getenv("DB_URL"), System.getenv("DB_USER"), System.getenv("DB_PASSWORD"));
                String query = "insert into students (name,age,college,marks) value (?,?,?,?)";
                PreparedStatement ps= con.prepareStatement(query);

                ps.setString(1,studentName);
                ps.setInt(2,studentAge);
                ps.setString(3,studentCollege);
                ps.setFloat(4,studentMarks);

                ps.executeUpdate();

            }catch(SQLException e){
                e.printStackTrace();
            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }
    }
    
    public static ArrayList<Student> fetchData(){
            ArrayList<Student> arr = new ArrayList<>();
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(System.getenv("DB_URL"), System.getenv("DB_USER"), System.getenv("DB_PASSWORD"));
                String query = "Select * from students";
                PreparedStatement ps = con.prepareStatement(query);

              ResultSet set =   ps.executeQuery();

              while(set.next()){
              String name = set.getString("name");         
              Integer age = set.getInt("age");             
              String college = set.getString("college");   
              Float marks = set.getFloat("marks");
              Integer Id =  set.getInt("student_id");
                //  Student student = new Student(name,college,age,marks);
                Student student = new Student();
                student.setStudentId(Id);
                student.setStudentName(name);
                student.setStudentAge(age);
                student.setStudentCollege(college);
                student.setStudentMarks(marks);
                
                arr.add(student);
            }
            }catch(SQLException e){
                e.printStackTrace();
            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }
            return arr;
    }
}
