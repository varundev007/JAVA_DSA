package JAVA_INTERVIEW_QUESTIONS._7_MethodChaining;

// MAKING CONSTRUCTOR PRIVATE

class Students{

    String name;
    int age;
    String city;

    // MAKING CONSTRUCTOR PRIVATE

    private Students(){

    }

    public Students setName(String name) {
        this.name = name;
        return this;
    }

    public Students setAge(int age) {
        this.age = age;
        return this;
    }

    public Students setCity(String city) {
        this.city = city;
        return this;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    //CREATING STATIC FUNCTION BECOUSE WE HAD MADE CONTRUCTOR PRIVATE

    public static Students of(){
        return new Students(); // this cant be return due to static keyword
    }
}
public class _2_builderPatterns {
    public static void main(String[] args) {

//        we cant create object like below as there is private constructor
//        Students s1 = new Students();
          Students s1 =   Students.of().setName("VarunDev").setAge(24).setCity("bangalore");

        System.out.println(s1);

    }
}
