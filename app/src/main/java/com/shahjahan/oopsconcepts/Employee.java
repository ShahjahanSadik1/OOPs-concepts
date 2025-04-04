package com.shahjahan.oopsconcepts;

public class Employee {
   private String name;
   private String position;
   private float salary;


//3006 class


   //Constructor making
   public Employee(String emp_name,String emp_position,float emp_salary){

        this.name=emp_name;
        this.position=emp_position;
        this.salary=emp_salary;

   }


    //two Constructor making
    public Employee(String emp_name,String emp_position,float emp_salary,float emp_apsent){

        this.name=emp_name;
        this.position=emp_position;
        this.salary=emp_salary-(emp_apsent*500);


    }


   //no geter





    //getName Geter
    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public float getSalary() {
        return salary;
    }
}
