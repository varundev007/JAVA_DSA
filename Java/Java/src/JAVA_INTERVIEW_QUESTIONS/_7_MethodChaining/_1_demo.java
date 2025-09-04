package JAVA_INTERVIEW_QUESTIONS._7_MethodChaining;

class Student{
    private String name;
    private int age;
    private String city;

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}

public class _1_demo {
    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Varun").setAge(21).setCity("Varansi");

        System.out.println(s);

    }
}
