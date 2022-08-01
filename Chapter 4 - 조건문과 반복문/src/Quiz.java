// 4장 연습문제
class Quiz2 {
    // [4-2]
    public static void main(String[] args) {
        // 1~20 정수 중 2 배수 3배수 아닌 수 합
        int sum = 0;
        for (int i=1; i<=20; i++) {
            if (i%2==0 || i%3 ==0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}

class Quiz3 {
    // [4-3]
    public static void main(String[] args) {
        // 1 + (1+2) + (1+2+3) + ... + (1+2+...+10)
        int sum = 0;
        for (int i=1; i<=10; i++){
            for (int j=1; j<=i; j++) {
                sum += j;
            }
        }
        System.out.println(sum);
    }
}

class Quiz4 {
    // [4-4]
    // 1 + (-2) + 3 + (-4)  ... 
    public static void main(String[] args) {
        int sum = 0;
        int change = 1;
        int num = 0;

        for (int i=1; true; i++, change = -change) {
            // change = -change 부호가 바뀜
            num = i * change;
            sum += num; // 부호에 따라 숫자 바꿔서 총합에 더함

            if (sum >= 100) {
                break;
            }
        }

        System.out.printf("총합은 %d%n : ", sum);
        System.out.printf("더한 숫자 %d: ", num);
    }
}

class Quiz6 {
    // [4-6]
    // 주사위 두개 합쳐서 6이 되는 수
    public static void main(String[] args) {
        for (int i=1; i<=6; i++) {
            for (int j=1; j<=6; j++) {
                if (i+j == 6) {
                    System.out.printf("%d + %d = %d%n", i,j,i+j);
                }
            }
        }
    }
}

class Quiz7 {
    public static void main(String[] args) {
        // Math.random() 은 0.0xxxx ~ 9,9xxx
        // 1~9 는 9를 곱하고 뒤에는 포함안하기 떄문에 +1
        // int형은 소수점 버리기 때문에 int형변환
        int value = (int)(Math.random()*9) + 1;
        System.out.println("value : " + value);
    }
}

class Quiz8 {
    // 2x + 4y = 10 만족하는 x, y 를 구해라
    public static void main(String[] args) {
        for (int i=0; i<=10; i++) {
            for (int j=0; j<=10; j++) {
                if ((2*i)+(4*j)==10) {
                    System.out.printf("x=%d, y=%d%n", i,j);
                }
            }
        }
    }
}

class Quiz9 {
    // ex) 12345 = 1+2+3+4+5 값
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;
        
        for (int i=0; i < str.length(); i++) {
            // 문자열 시작 0부터. 문자열을 숫자로 하려면 문자열 0 뺴주면 됨 
            sum += str.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}

class Quiz10 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        while (num > 0) {
            sum += num%10;
            num /= 10;
        }

        System.out.println("총합 : " + sum);
    }
}

class Quiz11 {
    // 피보나치 수열 문제
    public static void main(String[] args) {
        // 첫번째 숫자 = 1 , 두번째 숫자 = 1이 피보나치 기본 수열 시작
        int num1 = 1;
        int num2 = 1;
        int num3 = 0; // 3번째 값은 num1 + num2
        System.out.print(num1 + "," + num2);
        // 8번 더하라함
        for (int i=0; i<8; i++) {
            num3 = num1 + num2; // 3번째 값은 그 전의 두 수 합
            System.out.print("," + num3);
            num1 = num2; // 그 전 숫자 넣기 
            num2 = num3; // 그 전 숫자 넣기
        }
    }
}

class Quiz12 {
    // 구구단 출력
    // 다시풀기
    public static void main(String[] args) {
        for (int i=2; i<=7; i++) {
            for (int j=1; j<=3; j++) {
                System.out.printf("%d * %d = %d%n", i,j,i*j);
            }
        }
    }
}

class Quiz13 {
    // 숫자 판별
    public static void main(String[] args) {
        String value = "12o34";
        char ch = ' ';
        boolean isNumber = true;

        for (int i=0; i<value.length(); i++) {
            ch = value.charAt(i);
            
            // 문자열 0 ~ 9가 하나라도 있으면 숫자가 아님
            if (!('0'<=ch && ch <='9')) {
                isNumber = false;
                break;
            }
        }
        if (isNumber) {
            System.out.println(value + " 는 숫자입니다");
        } else {
            System.out.println(value + " 는 숫자가 아닙니다");
        }
    }
}

class Quiz14 {
    // 컴퓨터 숫자 맞추기
    public static void main(String[] args) {
        int answer = (int)(Math.random() * 100) + 1; // 1~100 난수 생성
        int input = 0; // 사용자 입력값
        int count = 0; // 사용자 입력횟수
        // Scanner 호출
        java.util.Scanner s = new java.util.Scanner(System.in);

        do {
            count ++;
            System.out.print("1과 100 사이의 숫자를 입력하세요 >> ");
            input = s.nextInt();
            // 입력값 확인
            if (answer == input) {
                System.out.println("정답 " + answer );
                System.out.println("시도횟수는 " + count);
                break;
            }
            // 큰 경우
            if (input > answer) {
                System.out.println("더 작은 수를 입력하세요");
            }
            // 작은 경우
            if (input < answer) {
                System.out.println("더 큰 수를 입력하세요");
            }

        } while (true);
    }
}

class Quiz15 {
    // 회문수 구하기
    // 거꾸로 체크
    public static void main(String[] args) {
        int number = 12321;
        int tmp = number;

        int result = 0;

        while (tmp != 0) {
            // 끝자리 더하는것과 비슷하게 10으로 나누면 마지막 숫자 가져옴
            // 마지막 숫자를 기존 값 * 10 한거에 더하면 거꾸로 가능
            result = (result * 10) + (tmp % 10);
            tmp /= 10;
        }

        if (number == result) 
            System.out.println(number + "는 회문수 입니다" + result);
        else 
            System.out.println(number + "는 회문수가 아닙니다");
        
    }
}