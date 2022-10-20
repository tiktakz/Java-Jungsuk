package java_study;

class StaticStudent {
    static int serialNum = 10000; // 공유됨

    int studentID;
    String studentName;

    // 학생 생성될 떄마다 serialNum 증가시키기

    public StaticStudent() {
        serialNum++;
        studentID = serialNum;
    }
}
