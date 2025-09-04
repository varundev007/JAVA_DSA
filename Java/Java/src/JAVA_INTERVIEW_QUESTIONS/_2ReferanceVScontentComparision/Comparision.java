package JAVA_INTERVIEW_QUESTIONS._2ReferanceVScontentComparision;

public class Comparision {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        // now to compare content of the objects -> override equals method in student class

    }
}
