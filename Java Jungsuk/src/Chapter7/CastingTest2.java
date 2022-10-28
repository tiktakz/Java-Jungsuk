package Chapter7;

class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        car.drive();
        car2 = (Car)fe;
        fe2 = (FireEngine)car2;  // ClassCastException 발생
        /* car 은 Car객체를 가르키고 있음. 
         */
        car2.drive();
    }    
}
