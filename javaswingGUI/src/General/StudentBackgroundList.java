/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package General;

/**
 *
 * @author jetro
 */
public class StudentBackgroundList {
    private int student_id;
    private String student_name,course,age,grade_level,status,section;
    
    public StudentBackgroundList(int student_id,String student_name,String age,String grade_level,String status,String section){
        this.student_id = student_id;
        this.student_name = student_name;
        this.course = course;
        this.age = age;
        this.status = status;
        this.section = section;
    }
    
    public int getStudent_id(){
        return student_id;
    }
    public String getStudent_name(){
        return student_name;
    }
    public String getcourse(){
        return course = course;
    }
    public String getage(){
        return age;
    }
    public String getstatus(){
        return status;
    }
    public String getsection(){
        return section;
    }
}
