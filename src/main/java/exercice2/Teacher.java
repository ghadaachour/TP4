package exercice2;


import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GHADA
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Teacher extends User {
    private Long hIndex;
    private List<Course> courses;

    public Teacher(String firstName, String lastName, String email, Long cin, Long hIndex, List<Course> courses) {
        super(firstName, lastName, email, cin);
        this.hIndex = hIndex;
        this.courses = courses;
    }
    @Override
      public void displayInfo() {
        super.displayInfo();
        System.out.println("hindex: " + hIndex);
        System.out.println("courses: " + courses);
        
    }

    public void updateProfile(String newFirstName, String newLastName, String newEmail,Long newhIndex, List<Course> newCourses) {
        super.updateProfile(newFirstName, newLastName, newEmail);
        this.hIndex = newhIndex;
        this.courses = newCourses;
       
    }

 
    public boolean authenticate() {
       return true ;
    }
    
     public String displayCoursesContent(){
        String r="Course{ ";
        for(Course c: courses){
            r+=c+" ";
        }
         r+="} ";
         return r;
    }
}