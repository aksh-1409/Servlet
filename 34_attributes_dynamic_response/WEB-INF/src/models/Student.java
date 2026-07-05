package models;

public class Student{
    private String studentName;
    private String studentCollege;
    private Integer studentAge;
    private Float studentMarks;

    public Student(String studentName, String studentCollege, Integer studentAge, Float studentMarks){
        this.studentName = studentName;
        this.studentCollege = studentCollege;
        this.studentAge = studentAge;
        this.studentMarks = studentMarks;
    }


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
}