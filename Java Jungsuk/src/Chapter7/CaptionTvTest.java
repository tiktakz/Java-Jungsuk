package Chapter7;

class Tv {
    boolean power;
    int channel;
    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}

class CaptionTv extends Tv {
    boolean caption;
    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}

class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        // captionTv에는 channel 변수와 channelUp메소드가 없지만 Tv를 상속받았기 때문에
        // 해당 변수와 메소드가 사용이 가능하다
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello, World");
        ctv.caption = true;
        ctv.displayCaption("Hello, World True");
    } 
}
