package Chapter7;

abstract class Player { // 추상 클래스
    abstract void play(int pos); // 추상 메소드 - 자손클래스에서 반드시 구현
    abstract void stop(); // 추상 메소드
}

// 추상 클래스는 상속을 통해 완성해야 객체 생성 가능

class AudioPlayer extends Player {
    void play(int pos) { System.out.println("Pos " + pos + "에서 재생"); }
    void stop() { System.out.println("재생을 멈춤"); }

    // play(int pos) 또는 stop() 메소드 둘 중 하나를 구현 하지 않으면 에러
    // 둘다 구현하던가 AudioPlayer을 abstract class으로 정의해야함.
}


public class PlayerTest {
    public static void main(String[] args) {
        // Player p = new Player(); // 추상 클래스는 객체 생성 못함
        AudioPlayer ap = new AudioPlayer();
        ap.play(100);
        ap.stop();

        Player ap1 = new AudioPlayer();
        ap1.play(200);
        ap1.stop();
    }
}