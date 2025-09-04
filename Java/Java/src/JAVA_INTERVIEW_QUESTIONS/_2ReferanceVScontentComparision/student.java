package JAVA_INTERVIEW_QUESTIONS._2ReferanceVScontentComparision;

public class student {
    int x=34;

    @Override
    public boolean equals(Object obj) {
        student s = (student) obj;
        return s.x == this.x;
    }
}
