package Chapter8;

class ExceptionEx9 {
    public static void main (String[] args) {
        // 예외 발생시키기
        try {
            Exception e = new Exception("고의 발생 예외");
            throw e; // 예외 발생
        }
        catch (Exception e) {
            System.out.println("에러메시지 : " + e.getMessage());
            e.printStackTrace();
        }
    }    
}
