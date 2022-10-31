package Chapter7;

class FighterTest2 {
    public static void main(String[] args) {
        Fighter2 f = new Fighter2();
        System.out.println("1번 객체" + f);
        f.attack(new Fighter2());
        f.move(1001,200); 
        f.stop();

        Fightable2 f2 = new Fighter2();
        f2.move(200,400);
        f2.attack(new Fighter2());
        // f2.stop(); Fightable2 에는 stop 메소드가 없음

        System.out.println("--------");
        System.out.println(f.getFightable2());
        System.out.println("--------");
        System.out.println("2번 객체" + f);
        f.move(9999,9999); // f 객체가 getFightable2() 메소드 호출하면서 새로운 객체 f 생성
        // 그래서 주소값 다르게 나옴
    }
}

abstract class Unit2 {
    int x, y;
    abstract void move(int x, int y);
    void stop() { System.out.println("Stop"); }
}

interface Fightable2 {
    // public abstract 생략됨
    void move(int x, int y);
    void attack(Fightable2 f);
}

class Fighter2 extends Unit2 implements Fightable2 {
    public void move(int x, int y) {
        System.out.println("[" + x + "," + y + "]으로 이동");
    }

    public void attack(Fightable2 f) {
        System.out.println(f + "을 공격");
    }

    Fightable2 getFightable2() {
        Fighter2 f = new Fighter2();
        return f;
        // 반환타입이 인터페이스이면 해당 인터페이스를 구현한 객체를 반환한다는 뜻
    }
}
