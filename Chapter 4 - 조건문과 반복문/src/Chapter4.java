import java.util.*;

public class Chapter4 {
    public static void main(String[] args) {
        int input;
        System.out.println("숫자를 하나 입력하세요");

        Scanner myScanner = new Scanner(System.in);
        String tmp = myScanner.nextLine();
        input = Integer.parseInt(tmp);

        if (input == 0) {
            System.out.printf("입력한 숫자는 : %d", input);
        }
        
        if (input != 0) {
            System.out.println("입력한 숫자는 0이 아니다");
            System.out.printf("입력한 숫자는 %d 입니다", input);
        }

    }
}

// 점수 및 학점 계산
class Grade {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';
        char opt = '0';

        System.out.println("점수를 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        System.out.printf("당신의 점수는 : %d ", score);

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94){
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score <84) {
                opt = '-';
            }
        } else {
            grade = 'C';
        }

        System.out.printf("당신의 학점은 %c%c 입니다", grade, opt);
    }
}

class game {
    public static void main(String[] args) {
        int user, com;
        System.out.println("가위(1), 바위(2), 보(3) 중 하나 선택하세요 ");
        Scanner scanner = new Scanner(System.in);

        user = scanner.nextInt();
        com = (int)(Math.random()*3) +1;
        System.out.println(com);

        switch (user - com){
            case -1: case 2: 
                System.out.println("User Lose");
                break;
            case 1: case -2:
                System.out.println("User Win");
                break;
            case 0:
                System.out.println("Game Tie");
                break;
        }
    }
}

class stars {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("출력할 라인의 수");
        Scanner scanner = new Scanner(System.in);

        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);

        for (int i=1; i<=num; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class googoodan {
    public static void main(String[] args) {
        for (int i=2; i<=9; i++) {
            for (int j=1; j<=9; j++) {
                System.out.printf("%d * %d = %d%n", i,j,i*j);
            }
        }
    }
}

class whilePractice {
    public static void main(String[] args) {
        int i=0;
        while (i<=9) {
            System.out.println("I am Nike");
            i++;
        }
    }
}

class sumNumber {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        System.out.println("Enter a Number >>");
        Scanner scanner = new Scanner(System.in);

        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);

        while (num != 0) {
            sum += num%10;
            System.out.printf("sum : %d num : %d%n", sum, num);
            num /= 10;
        }
        System.out.printf("Total Sum = %d", sum);
    }
}

class namingLoops {
    public static void main(String[] args) {
        Loop1 : for (int i=2; i<=9; i++) {
            for (int j=1; j<=9; j++) {
                if (j==5) {
                    //break Loop1;
                    //break;
                    //continue Loop1;
                    continue;
                }
                System.out.println(i + "*" + j + "=" + i*j);
                System.out.println();
            }
        }
    }
}

class selectMenu {
    public static void main(String[] args) {
        int menu = 0, num = 0;
        Scanner scanner = new Scanner(System.in);

        main : while (true) {
            System.out.println("(1) Square");
            System.out.println("(2) Square Root");
            System.out.println("(3) Log");
            System.out.println("(0) Exit");
    
            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);
    
            if (menu == 0) {
                System.out.println("Exit Program");
                break;
            } else if (!(1<= menu && menu <= 3)){
                System.out.println("Select Valid Menu (Exit: 0)");
                continue;
            }
            for (;;) {
                System.out.print("Enter a Number (Cancel:0 Exit: 99");
                tmp = scanner.nextLine();
                num = Integer.parseInt(tmp);

                if (num == 0) {
                    break;
                }

                if (num == 99) {
                    break main;
                }

                switch (menu) {
                    case 1:
                        System.out.println("Result = " + num * num);
                        break;
                    case 2:
                        System.out.println("Result = " + Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("Result = " + Math.log(num));
                        break;
                }
            }
        }
    }
}