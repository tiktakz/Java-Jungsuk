import java.util.*;

class MultiArrEx1 {
    // MultiArrEx1 P.220
    // 좌표에 X 표시하기
    public static void main(String[] args) {
        final int SIZE = 10;
        int x = 0, y = 0;

        char[][] board = new char[SIZE][SIZE];
        byte[][] shipBoard = {
            {0,0,0,0,0,0,1,0,0},
            {1,1,1,1,0,0,1,0,0},
            {0,0,0,0,0,0,1,0,0},
            {0,0,0,0,0,0,1,0,0},
            {0,0,0,0,0,0,1,0,0},
            {1,1,0,1,0,0,0,0,0},
            {0,0,0,1,0,0,0,0,0},
            {0,0,0,1,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,0},
        };

        for (int i=1; i<SIZE; i++) {
            board[0][i] = board[i][0] = (char)(i+'0');
        }
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf("좌표를 입력(종료00) : ");
            String input = scanner.nextLine();

            if (input.length() == 2) {
                x = input.charAt(0) - '0';
                y = input.charAt(1) - '0';

                if (x==0 && y==0) {
                    break;
                }
            }

            if (input.length() != 2 || x<=0 || y<=0 || y>=SIZE || x>=SIZE) {
                System.out.println("잘못 입력");
                continue;
            }

            if (shipBoard[x-1][y-1] == 1) {
                board[x][y] = 'O';
            } else {
                board[x][y] = 'X';
            }

            for (int i=0; i<SIZE; i++) {
                System.out.println(board[i]);
            }
            System.out.println();
        }

    }
}

class MultiArrEx2 {
    // MultiArrEx2 P.223
    // 빙고
    public static void main(String[] args) {
        final int SIZE = 5;
        int x = 0, y = 0, num = 0;
        
        // 빙고판 생성
        int[][] bingo = new int[SIZE][SIZE];
        Scanner scanner = new Scanner(System.in);

        // 빙고판 SIZE * SIZE 생성 (10*10)
        for (int i=0; i<SIZE; i++) {
            for (int j=0; j<SIZE; j++) {
                bingo[i][j] = i*SIZE + j + 1;
                //System.out.print(bingo[i][j]);
            }
        }

        // 보드를 섞기
        for (int i=0; i<SIZE; i++) {
            for (int j=0; j<SIZE; j++) {
                x = (int)(Math.random() * SIZE);
                y = (int)(Math.random() * SIZE);
                
                int tmp = bingo[i][j];
                bingo[i][j] = bingo[x][y];
                bingo[x][y] = tmp;
            }
        }

        do {
            for (int i=0; i<SIZE; i++) {
                for (int j=0; j<SIZE; j++) {
                    System.out.printf("%2d ", bingo[i][j]);
                }
                System.out.println();
            }
            System.out.println();

            System.out.printf("1~%d 사이의 숫자를 입력해주세요. 종료는 0 ", SIZE*SIZE);
            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp);

            outer : 
            for (int i=0; i<SIZE; i++) {
                for (int j=0; j<SIZE; j++) {
                    if (bingo[i][j] == num) {
                        bingo[i][j] = 0;
                        break outer;
                    }
                }
            }
        } while (num!=0);

    }
}

class MultiArrEx3 {
    // MultiArrEx3 P.227
    // 단어 맞추기
    public static void main(String[] args) {
        String[][] words = {
            {"chair", "의자"},
            {"computer", "컴퓨터"},
            {"integer", "정수"},
        };

        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은", i, words[i][0]);
            String tmp = scanner.nextLine();

            if (tmp.equals(words[i][1])) {
                System.out.printf("정답입니다.%n%n");
            } else {
                System.out.printf("틀렸습니다. 정답은 %s %n%n", words[i][1]);
            }
        }
    }
}