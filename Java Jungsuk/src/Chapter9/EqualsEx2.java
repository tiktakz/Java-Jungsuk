package Chapter9;

class Person {
    long id;

    public boolean equals (Object obj) {
        if (obj instanceof Person) {
            return id == ((Person)obj).id;
        }
        else {
            return false;
        }
    }
    Person(long id) {
        this.id = id;
    }
}

class EqualsEx2 {
    public static void main(String[] args) {
        Person p1 = new Person(980721111111L);
        Person p2 = new Person(980721111111L);

        if (p1 == p2) {
            System.out.println("p1 p2 는 같은 사람");
        }
        else {
            System.out.println("p1 p2 는 다른 사람");
        }

        if (p1.equals(p2)) {
            System.out.println("p1 p2 는 같은 사람");
        }
        else {
            System.out.println("p1 p2 는 다른 사람");            
        }
    }
}
