package java_study;

public class StaticStudentTest {
    public static void main(String[] args) {
        StaticStudent james = new StaticStudent();
        StaticStudent thomas = new StaticStudent();

        System.out.println("james " + james.studentID);
        System.out.println("thomas " + thomas.studentID);
        System.out.println();
        // static변수는 static way로 호출하는게 좋음
        // 객체 생성 없이도 호출할 수 있음
        // static 메소드에서는 멤버변수 사용할 수 없음
        System.out.println(StaticStudent.serialNum);
    }
}
