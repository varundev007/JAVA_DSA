package JAVA_INTERVIEW_QUESTIONS._0_JavaFAQs.Types_of_variables_in_java;

public class example {
    public static void main(String[] args) {
        example E = new example();

        E.fun(); //op 10 10
        E.fun(); //op 11 10
    }
    static int a = 10;
    void fun(){
        int b= 10;
        System.out.println(a+ " "+b);
        a++;b++;
    }
}
