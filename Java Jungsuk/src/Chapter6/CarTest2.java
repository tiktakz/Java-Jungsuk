package Chapter6;

class CarTest2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("blue");

        System.out.println("c1 spec : " + c1.color + ", " + c1.gearType + ", " + c1.door);
        System.out.println("c2 spec : " + c2.color + ", " + c2.gearType + ", " + c2.door);
    }
}