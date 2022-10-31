package Chapter7;

class RepairableTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        Dropship dropship = new Dropship();
        Marine marine = new Marine();
        SCV scv = new SCV();

        scv.repair(tank);
        scv.repair(dropship);
        // scv.repair(marine); marine은 Repairable을 구현하지 않기때문에 사용불가
        // 매개변수로 Repairable r을 받기 때문에 Repairable을 구현한 객체만 받는다
    }    
}

interface Repairable {}

class Unit3 {
    int hitPoint;
    final int MAX_HP;
    Unit3(int hp) {
        MAX_HP = hp;
    }
}

class GroundUnit extends Unit3 {
    GroundUnit(int hp) {
        super(hp);
    }
}

class AirUnit extends Unit3 {
    AirUnit(int hp) {
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairable {
    Tank() {
        super(150);
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "TANK";
    }
}

class Dropship extends AirUnit implements Repairable {
    Dropship() {
        super(125);
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "DROPSHIP";
    }
}

class Marine extends GroundUnit {
    Marine() {
        super(50);
        hitPoint = MAX_HP;
    }
}

class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Repairable r) {
        if (r instanceof Unit3) {
            Unit3 u = (Unit3)r;
            while (u.hitPoint != u.MAX_HP) {
                u.hitPoint++;
            }
            System.out.println(u.toString() + "수리 완료");
        }
    } 
}
