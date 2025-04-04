package com.shahjahan.oopsconcepts;

public class Employee {
   private String name;
   private String position;
   private String salary;

//3005 class


   //Constructor making
   public Employee(String emp_name,String emp_position,String emp_salary){

        this.name=emp_name;
        this.position=emp_position;
        this.salary=emp_salary;

   }




   //no geter





    //getName Geter
    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getSalary() {
        return salary;
    }
}
