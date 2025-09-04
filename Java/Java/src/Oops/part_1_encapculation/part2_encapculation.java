package Oops.part_1_encapculation;

public class part2_encapculation {
    public static void main(String[] args) {
       // Employee engineer =  new Employee();
    //  System.out.println(engineer.empID); cant access private variable, private var->only accessable in class
        // to access private vars we need getters setter. this is encapculation implementation
        //Encapculation-> wrapping up of data in single unit with hiding up the data from another class

    //    Employee engineer= new Employee(79,"Varun");
    //    System.out.println(engineer.getPh());  op 79
   //     System.out.println(engineer.getName()); op Varun

        Employee engineer2 = new Employee(); //Called to assign some default values
  //      System.out.println(engineer2.getPh());  // op 2435
  //      System.out.println(engineer2.getName());//op ravi
        engineer2.setName("Tarun");
        engineer2.setPh(24553);
        System.out.println(engineer2.getPh());
        System.out.println(engineer2.getName());
    }
}
class Employee{
    private int empID= 2;
    private int ph= 0;
    private String name;
    private int basicSal = 20000;
    private int incentive = 200;
    //Constructor-> non returning type function
    Employee(int phoneNo, String empName){
        ph= phoneNo;
        name= empName;
    }

    //Default constructor
    Employee(){
        ph= 2435;
        name = "ravi";
    }
    // if we create private constructor then we wont be able to create obj of that constructor
    private void countSal(){
        System.out.println(basicSal+incentive);
    }
    int getPh(){
        return ph;
    }
    String getName(){
        return name;
    }

    void setPh(int phone){
        this.ph=phone;
    }
    void setName(String name){
        name = name; //it confuse and take "ravi" as op
        this.name=name;
    }
}
