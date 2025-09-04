package JAVA_INTERVIEW_QUESTIONS._0_JavaFAQs.Types_of_variables_in_java;

//1) Difference between Instance Variable and Class Variable?
/*
TYPES OF VARIABLE:-
1) Local -  variable inside body of the method or method parameter(scope-  within the function)
2) Static - declared with static keyword
3) Instance - declared inside the class but outside all the methods
*/
public class _1_InstanceVar_vs_ClassVariable {
    static int b =20;
    int a=0 ;// a is instance variable
    public static void main(String[] args) {
        // Accessing all varibles
        int x= 10; //local var
        System.out.println(x);//op 10

        _1_InstanceVar_vs_ClassVariable A = new _1_InstanceVar_vs_ClassVariable();//created class to access instance var

        System.out.println(A.a);//accesing instance var  op 0

        System.out.println(_1_InstanceVar_vs_ClassVariable.b);//accessing static vaiable op 20
    }
    public void localVar(int a){ //a is local var
        a=0; // a is local var
    }
}
