package ObjectsAndClasses.MoreExercise.P01CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
     private String department;
     private double avrgSalary;

     public Department(String department) {
        this.department = department;

     }

     public String getName() {
         return this.department;
     }

     public void setAvrgSalary(double salary) {
         this.avrgSalary = salary;
     }

     public double getAvrgSalary() {
         return this.avrgSalary;
     }



}
