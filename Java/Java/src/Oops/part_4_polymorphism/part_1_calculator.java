package Oops.part_4_polymorphism;

public class part_1_calculator {
    public static void main(String[] args) {
        feature.add(2,5);
        feature.add(1.3, 2.1);
        feature.add(1,3,5);
    }
}

class feature{
    static void add(int a, int b){
        System.out.println(a+b);
    }

    //Method-overloading
    // -> With in a class, different return type, different type of parameter or differetn no of paras with same method
    // Compile time polymorphidm (Static type)  ->  method overloading
    // run time polumorphism (Dynamic type) -> method over riding
    static void add(double a , double b){
        System.out.println(a+b);
    }
    static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

}
