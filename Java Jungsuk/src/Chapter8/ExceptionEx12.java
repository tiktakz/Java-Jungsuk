package Chapter8;

class ExceptionEx12 {
    public static void main(String[] args) {
        method1();
    }
    static void method1(){
        try {
            throw new Exception();
        }
        catch (Exception e) {
            System.out.println("method1() 예외처리 완료");
            e.printStackTrace();
        }
    }
}
