package Chapter6;

public class TvTest4 {
    // 객체배열
    /* 객체배열은 객체의 주소를 저장하고 있기 때문에 배열을 생성하고 요소를 저장해줘야함 */

    public static void main(String[] args) {
        Tv[] TvArr = new Tv[3]; // Tv 객체를 3개 저장할 수 있음

        for (int i=0; i<TvArr.length; i++) {
            TvArr[i] = new Tv();
            TvArr[i].channel = i+10; // Tv 객체 생성 후 각 채널에 i+10
        }
    
        for (int i=0; i<TvArr.length; i++) {
            TvArr[i].channelUp(); // 각 객체에 channelUp() 메소드 실행
            System.out.printf("TvArr[%d].channel=%d%n", i, TvArr[i].channel);
        }
    }
}

class Tv {
    String color;
    boolean power;
    int channel;

    void power() {power =! power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}
