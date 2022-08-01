class Ex5 {
    // ArrayEx5 P.196
    // 배열의 숫자 평균 구하기
    public static void main(String[] args) {
        int[] score = {100, 88, 100, 100, 90};
        int sum = 0;
        float average = 0f;

        for (int i=0; i<score.length; i++) {
            sum += score[i];
        }

        average = sum / (float)score.length;

        System.out.println("총 합 : " + sum);
        System.out.println("평균 : " + average);
    }
}

class Ex6 {
    // ArrayEx6 P.197
    // 배열안의 최솟값 최댓값 구하기
    public static void main(String[] args) {
        int[] score = {79, 81, 91, 33, 100, 55, 95};
        int max = score[0], min = score[0]; // 최대값과 최소값을 배열의 0번째 값으로 설정하고 비교 예정

        for (int i=0; i<score.length; i++) {
            // 배열 전체를 돌면서 크기를 비교해서 크면 max 값에 새로운 max값, 작으면 새로운 min 값을 대입
            if (score[i] > max) {
                max = score[i];
            }
            else if (score[i] < min) {
                min = score[i];
            }
        }

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}

class Ex7 {
    // ArrayEx7 P.197
    // Shuffle, 배열의 내용 섞기 
    public static void main(String[] args) {
        int[] numArr = new int[10]; // 크기가 10인 배열

        // numArr 배열에 0~9
        for (int i=0; i<numArr.length; i++) {
            numArr[i] = i;
            System.out.print(numArr[i]);
        }
        System.out.println();

        for (int i=0; i<100; i++) {
            int n = (int)(Math.random() * 10);
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }

        for (int i=0; i<numArr.length; i++) {
            System.out.print(numArr[i]);
        }
    }
}

class Ex8 {
    // ArrayEx8 P.199
    // 로또 번호 생성기
    public static void main(String[] args) {
        int[] ball = new int[45];

        for (int i=0; i<ball.length; i++) {
            ball[i] = i + 1; // 45 길이 배열에 1~45 모두 저장
        }
        
        int temp = 0; // 값 변경할때 쓰기 위한 변수
        int j = 0; // 임의의 값을 얻어서 저장하는 변수

        // 중복값이 나오면 안되니까 있는 번호들로만 사용하기 위함
        // 기존 번호는 임시변수에 넣고 다시 배열에 끼워넣기
        for (int i=0; i<6; i++) {
            j = (int)(Math.random() * 45); // 0~44
            temp = ball[i];
            ball[i] = ball[j];
            ball[j] = temp;
        }
        // i < ball.length  안하는 이유는 로또 6번호 추출이니까
        // 굳이 배열 전체를 출력할 필요는 없고 앞에 6개만 추출해도됨
        for (int i=0; i<6; i++) {
            System.out.printf("ball[%d] = %d%n", i,ball[i]);
        }
    }
}

class Ex9 {
    // ArrayEx9 P.200
    // 배열 채우기
    public static void main(String[] args) {
        // 1 연속적인 범위 숫자로 배열 채우기 ex) 0~9
        int[] firstArr = new int[5];
        for (int i=0; i<firstArr.length; i++) {
            firstArr[i] = (int)(Math.random() * 10);
            System.out.print(firstArr[i]);
        }

        // 불연속적 범위 ex) -4,-1,3,6,11
        // 새로운 배열 생성

        int[] arr = {-4, -1, 3, 6 , 11};
        int[] newArr = new int[10];

        for (int i=0; i<newArr.length; i++) {
            int tmp = (int)(Math.random() * arr.length); // arr의 개수 즉 5개 . 이 배열안에 있는 숫자로만 구성
            newArr[i] = arr[tmp]; // 해당 위치에 있는 숫자와 교환
        }

        System.out.println(java.util.Arrays.toString(newArr));
    }
}

class Ex10 {
    // ArrayEx10 P.201
    // 배열 오름차순, 내림차순 정렬
    // 버블 정렬
    public static void main(String[] args) {
        int[] arr = new int[10];
        // 랜덤으로 배열 하나 생성
        for (int i=0; i<arr.length; i++) {
            arr[i] = (int)(Math.random()*10);
            System.out.print(arr[i]);
        }
        System.out.println();

        for (int i=0; i<arr.length-1; i++) {
            boolean changed = false;

            for (int j=0; j<arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    changed = true;
                }
            }

            if (!changed) {
                break;
            }

            for (int k=0; k<arr.length; k++) {
                System.out.print(arr[k]);
            }
            System.out.println();
        }
    }
}

class Ex11 {
    // ArrayEx11 P.204
    // 빈도수 구하기
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for (int i=0; i<numArr.length; i++) {
            numArr[i] = (int)(Math.random() * 10);
            System.out.print(numArr[i]);
        }
        System.out.println();

        for (int i=0; i<numArr.length; i++) {
            counter[numArr[i]]++;
        }

        for (int i=0; i<numArr.length; i++) {
            System.out.println(i +"의 개수 : " + counter[i]);
        }
    }
}

class Ex12 {
    // ArrayEx14 P.210
    // char 배열과 String 배열
    // char배열에 기능을 추가 => String 클래스
    public static void main(String[] args) {
        String src = "ABCDE";

        for (int i=0; i<src.length(); i++) {
            char ch = src.charAt(i);
            System.out.println("src.charAt("+i+"):" + ch);
        }

        char[] chArr = src.toCharArray();
        System.out.println(chArr);
    }
}

class Ex18 {
    // ArrayEx18 P.217
    // 2차원 배열
    public static void main(String[] args) {
        int[][] score = {
            {100,100,100},
            {20, 20, 20,},
            {30, 30, 30},
            {40, 40, 40,}
        };

        int sum = 0;
        
        for (int i=0; i<score.length; i++) {
            for (int j=0; j<score[j].length; j++){
                System.out.printf("score[%d][%d] = %d%n ", i,j,score[i][j]);
            }
        }

        // 2차원 배열이므로 각 배열마다 하나의 임시 배열에 넣고 값 계산
        
        for (int[] tmp : score) {
            for (int i : tmp) {
                sum += i;
            }
        }

        System.out.println("sum = " + sum);
    }
}

class Ex19 {
    // ArrayEx19 P.218
    public static void main(String[] args) {
        int[][] score = {
            {100, 100, 100},
            {20, 20, 20},
            {30, 30, 30},
            {40, 40, 40},
            {50, 50, 50},
        };

        // 과목별 총점
        int korTotal = 0, engTotal = 0, mathTotal = 0;
        System.out.println("번호   국어   영어   수학   총점   평균  ");
        System.out.println("========================================");

        for (int i=0; i<score.length; i++) {
            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];
            System.out.printf("%3d%n", i+1);
        }
    }
}