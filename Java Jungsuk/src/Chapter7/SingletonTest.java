package Chapter7;

final class SingletonTest {
    // Singleton - 생성자를 통해서 인스턴스 생성 불가
    // 그렇기 때문에 인스턴스를 생성해서 반환해주는 메소드가 있어야한다.
    // 인스턴스 생성 없이도 호출 할 수 있어야하기 때문에 static 메소드여야함
    private static SingletonTest s = new SingletonTest();
    private SingletonTest() {}

    public static SingletonTest getInstance() {
        if (s==null) {
            s = new SingletonTest();
        }
        return s;
    }
}

class SingletonTests {
    public static void main(String[] args) {
        SingletonTest s = SingletonTest.getInstance();
    }
}
