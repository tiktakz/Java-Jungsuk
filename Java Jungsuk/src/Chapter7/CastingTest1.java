package Chapter7;

class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water(); // FireEngine 참조변수이고 FireEngine 인스턴스 사용가능
        car = (Car)fe; 
        // car.water(); ERROR - car은 Car타입인데 fe는 FireEngine이기에 FireEngine의 water() 사용불가
        fe2 = (FireEngine)car;
        fe2.water();
    } 
}

class Car {
    String color;
    int door;

    void drive() { System.out.println("Driving"); }
    void stop() { System.out.println("Stop"); }
}

class FireEngine extends Car {
    void water() { System.out.println("WATER"); }
}
