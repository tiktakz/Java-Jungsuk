package Chapter6;

class Data {
    int x;
}

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);
        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
        // 결과 : 10, 10
    }

    static void change(int x) {
        // 기본형 매개변수 int x을 받았기 때문에 d.x(10)을 복사해서 받아 사용하고 메소드 종료 이후 없어짐
        // 기본혀 매개변수는 read only
        x=1000;
        System.out.println("change() : x = " + x);
    }
}
