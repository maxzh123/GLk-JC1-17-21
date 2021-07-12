package Collections;

public class Student {
    String studentName;
    int grade;

    public Student(String studentName, int grade) {
        this.studentName = studentName;
        this.grade = grade;
    }


    public int getGrade() {
        return grade;
    }


    @Override
    public String toString() {
        return "Имя студента= " + studentName +
                ", его оценка=" + grade;
    }
}
