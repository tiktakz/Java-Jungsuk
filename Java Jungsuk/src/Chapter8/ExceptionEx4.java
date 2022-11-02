package Chapter8;

class ExceptionEx4 {
    // try-catch 흐름
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0); // 여기서 예외가 발생 -> 그럼 try블럭을 바로 벗어나기 떄문에 밑에 4를 출력하지 않음
            System.out.println(4);
        }
        // ArithmeticException 걸리면 catch 블럭에 있으면 해당 코드 수행. 이후 다른 catch는 수행하지 않음
        // 마지막에 Exception타입 참조변수 선언하면 걸러지지 않은 예외처리 다 가능 (예외처리의 최고조상임)
        catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException) {
                System.out.println("True");
                System.out.println("ArithmeticException");
                // 정보출력
                ae.printStackTrace();
                System.out.println("ae error: "+ ae.getMessage());
            }
        } 
        catch (Exception e) {
            System.out.println(5); // 예외가 발생하지 않으면 실행되지 않음
        }
        System.out.println(6);
    }    
}
