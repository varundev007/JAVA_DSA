package JAVA_INTERVIEW_QUESTIONS._1ComparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Emp implements Comparable<Emp> {

    private String name;
    private String phone;
    private int empId;

    @Override
    public int compareTo(Emp o) {
        return this.empId-o.empId;
    }

    public Emp(String name, String phone, int empId){
        this.name =name;
        this.phone = phone;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getEmpId() {
        return empId;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", empId=" + empId +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Emp> emps = new ArrayList<>();
        emps.add(new Emp("varun","420",456));
        emps.add(new Emp("Rd","654",642));
        emps.add(new Emp("ravi","4563",546));
   //     System.out.println(emps);//cant print emps details directly, override toString function

        //Comparables
        //Can only support single sorting logic

        Collections.sort(emps);// need to implement Comparable class
        System.out.println(emps);

        ArrayList<Emp> emp1 = new ArrayList<>(emps);
        Collections.sort(emp1, new NameComparator());

        System.out.println(emp1);

        //Comparator
        //Supports multiple sorting logics

        ArrayList<Emp> emp2 = new ArrayList<>(emps);
        Collections.sort(emp2, new IdComparator());

        System.out.println(emp2);
    }


}
