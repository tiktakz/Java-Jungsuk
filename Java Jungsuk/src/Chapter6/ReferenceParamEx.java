package Chapter6;

public class ReferenceParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);
        change(d);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
        // 결과 : 10, 10
    }

    static void change(Data d) {
        // 참조형 매개변수 Data d를 받았기 때문에 값이 아니라 주소값이 복사가 됨
        // 주소값이 복사되었기 때문에 같이 변경되고 스택에서 제거되어도 복사된 값이 변경되어 있음.
        d.x=1000;
        System.out.println("change() : x = " + d.x);
    }
}
