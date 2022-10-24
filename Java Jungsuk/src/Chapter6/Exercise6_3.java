package Chapter6;

public class Exercise6_3 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름:" + s.name);
        System.out.println("총점:" + s.getTotal());
        System.out.println("평균:" + s.getAverage());
    }
}

class Student {
    String name;
    int ban;
    int no;
    int kor, eng, math;

    Student() {}

    Student(String name, int no, int ban, int kor, int math, int eng) {
        this.name = name;
        this.no = no;
        this.ban = ban;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }

    int getTotal() {
        int total = kor + eng + math;
        return total;
    }

    float getAverage() {
        return getTotal()/3;
    }

    String info() {
        return name + 
        "," + no + 
        "," + ban + 
        "," + kor + 
        "," + math + 
        "," + eng + 
        "," + getTotal() + 
        "," + getAverage(); 
    }
}
