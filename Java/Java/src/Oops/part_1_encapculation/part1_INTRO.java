package Oops.part_1_encapculation;
// OOPS- Object oriented Programming System/Structure
//Advantage- reuseability , follows dry principle
// object -> class -> interface -> package
// pillar of OOPS-> Encapculation , Abstraction, Inheritance,  Polymophism

// Object -> Real life intity
// Class -> Virtual entity

        /*
        class c1{
            main();
            member function;
            data member;
        }
        IN CLASS C1 WE HAVE WRAPPED THE MAIN, MEMBER FUN AND DATA MEMBER THIS IS ENCAPCULATION( DATA HIDING)
        IT SECURES DATA
         */

public class part1_INTRO {
    public static void main(String[] args) {
        System.out.println(Employees.empId);
        // able to access as it is static ->static makes variable accessable everywhere in the file->help in memory managementx
       Employees engineer = new Employees();
       //new -> allocates memory
        //obj name (engineer) holds memory
        System.out.println(engineer.incentive);
        //we are able to access incentive after creating obj this not good for security
        //To overcome this issue we follow encapculation
        //follow part2
    }
}
class Employees{
    static int empId= 1;
    int basicSal= 20000;
    int incentive= 200;
    int ph= 5;
    void countSal(){
        System.out.println(basicSal + incentive);
    }
}
