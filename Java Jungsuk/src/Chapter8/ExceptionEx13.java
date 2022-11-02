package Chapter8;

class ExceptionEx13 {
    public static void main(String[] args) {
        try {
            method1();
        }
        catch (Exception e) {
            System.out.println("main 메소드에서 예외처리 완료");
            e.printStackTrace();
        }
    }
    static void method1() throws Exception{
        throw new Exception();
    }
}
