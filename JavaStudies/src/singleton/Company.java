package singleton;

// 객체가 하나만 생성되게 하는 패턴
public class Company {
    // 생성자를 private 생성
    // 외부에서 생성자 사용 불가
    // 유일하게 사용되는 instance
    private static Company instance = new Company();
    private Company() {}

    // 객체생성 없이 메소드 호출하기 위해서 static
    public static Company getInstance() {
        return instance;
    }
}
