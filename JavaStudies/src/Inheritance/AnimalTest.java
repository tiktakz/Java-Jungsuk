package Inheritance;

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.moveAnimal(new Human());
        test.moveAnimal(new Tiger());
        test.moveAnimal(new Eagle());
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다");
    }
}

class Human extends Animal {
    public void move() {
        System.out.println("사람은 두발로 움직입니다");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("호랑이가 네발로 뜁니다");
    }
}

class Eagle extends Animal {
    public void move() {
        System.out.println("독수리는 하늘을 납니다");
    }
}

