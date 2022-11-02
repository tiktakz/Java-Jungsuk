package Chapter8;

class ExceptionEx2 {
    // try-catch 흐름
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0); // 여기서 예외가 발생 -> 그럼 try블럭을 바로 벗어나기 떄문에 밑에 4를 출력하지 않음
            System.out.println(4);
        } catch (Exception e) {
            System.out.println(5); // 예외가 발생하지 않으면 실행되지 않음
        }
        System.out.println(6);
    }    
}
