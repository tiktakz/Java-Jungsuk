package Arraylist;

public class studentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(1001, "Lee");
        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 83);
        studentLee.showStudentInfo();

        System.out.println("----------------");
        
        Student studentKim = new Student(1002, "Kim");
        studentKim.addSubject("국어", 30);
        studentKim.addSubject("수학", 53);
        studentKim.showStudentInfo();
    }
}
