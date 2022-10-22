package Arraylist;
import java.util.ArrayList;

public class Student {
    private int studentID;
    private String studentName;
    // 학생이 수강한 여러과목을 ArrayList로 관리함
    private ArrayList<Subject> subjectList;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;

        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScore(score);
        subjectList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;

        for (Subject subject : subjectList)  {
            total += subject.getScore();
            System.out.println("학생 " + studentName + subject.getName() + ", 성적은 " + subject.getScore());
        }
        System.out.println("총점은 " + total+"점");
    }
}
