package Chapter6;

class Car {
    String color;
    String gearType;
    int door;

    Car() {
        // 생성자에서 다른 생성자를 호출하려면 제일 첫줄에서 this로 호출해야함.
        // 기본 생성자 호출하면 Car(String color, String gearType, int door) 생성자 호출
        this("default white", "default auto", 4);
    } 

    Car(String color) {
        // 생성자로 색만 들어옴
        this(color, "default auto", 4);
    }

    Car(String color, String gearType, int door) { // 매개변수가 있는 생성자
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    Car(Car c) {
        // Car클래스의 참조변수 c를 매개변수로 받음
        // 인스턴스의 복사가 가능하다
        this(c.color, c.gearType, c.door);

    }
}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "black";
        c1.gearType = "manual";
        c1.door = 2;

        Car c2 = new Car("white", "auto", 4);

        Car c3 = new Car("blue");

        // 매개변수 있는 생성자를 사용하여 인스턴스 변수들을 초기화시키면
        // 코드들이 간결해지고 직관적임
        System.out.println("c1 spec : " + c1.color + ", " + c1.gearType + ", " + c1.door);
        System.out.println("c2 spec : " + c2.color + ", " + c2.gearType + ", " + c2.door);
        System.out.println("c3 spec : " + c3.color + ", " + c3.gearType + ", " + c3.door);

        System.out.println();
        System.out.println("인스턴스 복사");

        Car c4 = new Car();
        Car c5 = new Car(c4);
        System.out.println("c4 spec : " + c4.color + ", " + c4.gearType + ", " + c4.door);
        System.out.println("c5 spec : " + c5.color + ", " + c5.gearType + ", " + c5.door);
        System.out.println("c5의 default white색을 purple 변경");
        c5.color = "purple";
        System.out.println("c4 spec : " + c4.color + ", " + c4.gearType + ", " + c4.door);
        System.out.println("c5 spec : " + c5.color + ", " + c5.gearType + ", " + c5.door);

        // 복사된 인스턴스는 같은 상태이지만 다른 메모리에 있기 때문에 서로 영향을 주지 않음
    }
}