class Data {
    int x;
}

class PrimitiveParam {
    public static void main(String[] args) {
        // P.264 기본형 매개변수, 참조형 매개변수
        // 기본형은 값을 읽기만 가능하다
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println("After Change(d.x)");
        System.out.println("main() : x = " + d.x);
    }
    static void change(int x) {
        x = 1000;
        System.out.println("change() : x = " + x); 
    }
}

class Reference {
    public static void main(String[] args) {
        // P.264 기본형 매개변수, 참조형 매개변수
        // 참조형은은 값을 읽기 + 변경도 가능
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);
        System.out.println("After Change(d.x)");
        System.out.println("main() : x = " + d.x);
    }
    static void change(Data d) {
        d.x = 1000;
        System.out.println("change() : x = " + d.x); 
    }
}

class ReferenceParamEx3 {
    // P. 267 6-12
    public static void main(String[] args) {
        int[] arr = {7,3,2,1,6,5,4};

        // 메소드 리스트
        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println("sum = " + sumArr(arr));        
    }

    static void printArr(int[] arr) {
        System.out.print("[");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] +", ");
        }
        System.out.println("]");
    }

    static int sumArr(int[] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static void sortArr(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}

class ReturnTest {
    // return 값이 없어도 값을 변경
    // return 값은 하나지만 배열을 사용하면 여러개 값을 반환받는 효과
    public static void main(String[] args) {
        ReturnTest r = new ReturnTest();

        int result = r.add(3,5);
        System.out.println(result);

        int[] result2 = {0};
        r.add(3,5,result2);
        System.out.println(result2[0]);
    }

    int add(int a, int b) {
        return a+b;
    }

    void add(int a, int b, int[] result) {
        result[0] = a+b;
    }
}

class FactorialTest {
    // 팩토리얼 함수 P.271 , 재귀함수 연습
    public static void main(String[] args) {
        int result = factorial(4);
        System.out.println(result);
    }

    static int factorial(int n) {
        // 유혀성검사 추가 
        int result = 0;
        if (n<=0 || n>12) {
            return 1;
        }
        if (n==1) {
            result = 1;
        }
        else {
            result = n * factorial(n-1); // 자기보다 1작은 숫자 곱해야됨
        }
        
        return result;
    }
}

class MyMath2 {
    // P.279
    long a, b;
    // 인스턴스 변수인 a,b만을 사용하는 메소드
    long add() {return a+b;}
    long subtract() {return a-b;}
    long multiply() {return a*b;}
    long divide() {return a/b;}

    // 클래스 메소드 (매개변수 없이 a+b 만으로도 작업 가능)
    static long add(long a, long b) {return a+b;}
    static long subtract(long a, long b) {return a-b;}
    static long multiply(long a, long b) {return a*b;}
    static double divide(double a, double b) {return a/b;}
}

class MyMathTest2 {
    public static void main(String[] args) {
        // 클래스메소드인 add는 인스턴스 생성 없이 사용가능
        System.out.println(MyMath2.add(200L, 100L));

        // 인스턴스 메소드는 객체를 생성하고 해야함
        MyMath2 mm = new MyMath2();
        mm.a = 200L;
        mm.b = 100L;
        System.out.println(mm.add());
        
        // 즉 인스턴스 변수를 사용하지 않아도 되는 경우에는 static 메소드를 사용하는 것이 효율적이다.
    }
}

class OverloadingTest {
    // P.286 오버로딩 테스트
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();
        System.out.println("mm.add(3,3) 결과:" + mm.add(3,3));

        int [] a = {100,200,300};
        System.out.println("mm.add(a) 결과 : " + mm.add(a));
    }
}

class MyMath3 {
    // Overloading Test 를 위한 클래스
    int add(int a, int b) {
        System.out.print("int add(int a, int b) - ");
        return a+b;
    }

    long add(int a, long b) {
        System.out.print("long add(int a, long b) - ");
        return a+b;
    }

    long add(long a, int b) {
        System.out.print("long add(long a, int b) - ");
        return a+b;
    }

    long add(long a, long b){
        System.out.print("long add(long a, long b) - ");
        return a+b;
    }

    int add(int[] a) {
        System.out.print("int add(int [] a) - ");
        int result = 0;
        for (int i=0; i<a.length; i++) {
            result += a[i];
        }
        return result;
    }
}