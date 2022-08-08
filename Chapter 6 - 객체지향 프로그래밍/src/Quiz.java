// 객체지향 연습문제 풀이

// 6-1 
class SutdaCard {
    int num;
    boolean isKwang;

    // 기본 생성자
    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    String info() {
        return num + (isKwang? "K" : "");
    }
}

// 6-2
class SutdaCardTest {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());
        // 결과 3, 1K
    }
}

// 6-3 , 6-4
class Student {
    String name; // 학생이름
    int ban; // 반 번호
    int no; // 학생 번호
    int kor;
    int eng;
    int math;

    // 메소드
    int getTotal() {
        return kor + eng + math;
    }
    
    float getAverage() {
        // return (kor + eng + math) / 3;
        return getTotal() / 3;
    }

    String info() {
        return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", " + getAverage();
    }

    // 생성자
    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    Student() {

    }
}

// 6-4
class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름 " + s.name);
        System.out.println("총점 " + s.getTotal());
        System.out.println("평균 " + s.getAverage());
    }
}

// 6-5 
class Quiz6_5 {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 1,1,100,60,76);

        System.out.println(s.info());
    }
}

// 6-6 
/*  
class Quiz6_6 {
    static double getDistance(int x, int y, int x1, int y1) {
        return Math.sqrt((x-x1) * (x-x1) + (y-y1) * (y-y1));
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1,1,2,2));
    }
}
*/

// 6-7
class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(int x1, int y1) {
        return Math.sqrt((x-x1) * (x-x1) + (y-y1) * (y-y1));
    }
}

class Quiz6_7 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1,1);
        System.out.println(p.getDistance(2,2));
    }
}

class Quiz6_20 {
    // 객체없이 메소드 사용할 것이기 때문에 클래스 메소드 static
    public static int[] shuffle(int[] arr){
        if (arr == null || arr.length == 0) {
            return arr;
        }

        for (int i=0; i<arr.length * 2; i++) {
            int j = (int)(Math.random() * arr.length);
            int k = (int)(Math.random() * arr.length);
            int tmp = arr[j];
            arr[j] = arr[k];
            arr[k] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int [] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));

        int [] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}

class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff() {
        isPowerOn = !isPowerOn;
    }

    void volumeUp() {
        if (volume < MAX_VOLUME) {
            volume++;
        }
    }

    void volumeDown() {
        if (volume > MIN_VOLUME) {
            volume--;
        }
    }

    void channelUp() {
        channel++;
        if (channel == MAX_CHANNEL) {
            channel = MIN_CHANNEL;
        }
    }

    void channelDown() {
        channel--;
        if (channel == MIN_CHANNEL) {
            channel = MAX_CHANNEL;
        }
    }
}


class Quiz6_21 {
    // MyTv class 사용
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.channel = 100;
        t.volume = 0;
        System.out.println("CH: " + t.channel + ", VOL: " + t.volume);

        t.channelDown();
        t.volumeDown();
        System.out.println("CH: " + t.channel + ", VOL: " + t.volume);

        t.volume = 100;
        t.channelUp();
        t.volumeUp();
        System.out.println("CH: " + t.channel + ", VOL: " + t.volume);
    }
}
 
class Quiz6_22 {
    // method
    public static boolean isNumber(String str) {
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));

        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }
}

class Quiz6_23 {
    // method
    public static int max(int[] arr) {
        if (arr==null || arr.length == 0) {
            return -999999;
        }

        int max = arr[0];

        for (int i=0; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        return max;
    }
    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값: " + max(data));
        System.out.println("최대값: " + max(null));
        System.out.println("최대값: " + max(new int[] {})); // 크기 0인 배열
    }
}

class Quiz6_24 {
    // method
    public static int abs(int value) {
        if (value >= 0) {
            return value;
        } else {
            return -value;
        }
    }
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값: " + abs(value));
        value = -10;
        System.out.println(value + "의 절대값: " + abs(value));
    }
}