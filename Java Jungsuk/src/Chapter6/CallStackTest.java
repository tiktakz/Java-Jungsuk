package Chapter6;

class CallStackTest {
    public static void main(String[] args) {
        System.out.println("main(String[] args)시작");
        firstMethod(); // static 메소드이기 때문에 객체 생성 없이 호출 가능
        System.out.println("main(String[] args)종료");
    }

    static void firstMethod() {
        System.out.println("firstMethod()시작");
        secondMethod();
        System.out.println("firstMethod()종료");
    }

    static void secondMethod() {
        System.out.println("secondMethod()시작");
        System.out.println("secondMethod()종료");
    }
}