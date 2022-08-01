import java.util.*;

// 배열 QUIZ

class Quiz3 {
    // 5-3 배열의 모든 수 더하기
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        System.out.println(sum);
    }
}

class Quiz4 {
    // 5-4 총합과 평균
    public static void main(String[] args) {
        int[][] arr = {
            {5,5,5,5,5},
            {10,10,10,10,10},
            {20,20,20,20,20},
            {30,30,30,30,30}
        };

        int sum = 0;
        float avg = 0;

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        // 배열 개수 * 한 배열의 개수 = 전체 개수
        avg = sum/(float)(arr.length * arr[0].length);

        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + avg);
    }
}

class Quiz5 {
    // 5-5 3자리 숫자 만들기
    public static void main(String[] args) {
        int[] ballArr = {1,2,3,4,5,6,7,8,9};
        int[] ball3 = new int[3];

        for (int x=0; x<20; x++) {
            int j = (int)(Math.random() * ballArr.length);
            int i = (int)(Math.random() * ballArr.length);
            int tmp = 0;

            tmp = ballArr[x];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }

        System.arraycopy(ballArr, 0, ball3, 0,3);

        for (int k=0; k<ball3.length; k++) {
            System.out.print(ball3[k]);
        }


    }
}

class Quiz6 {
    // 5-6 거스름돈을 몇개의 동전으로 
    public static void main(String[] args) {
        int[] coinUnit = {500, 100, 50, 10};

        int money = 2680;
        System.out.println("money= " + money);

        for (int i=0; i<coinUnit.length; i++) {
            System.out.println(coinUnit[i] + "원 : " + money/coinUnit[i] + "개");
            money %= coinUnit[i];
        }
    }
}

class Quiz7 {
    // 5-6 확장 / 돈 입력받고 동전 지불 및 남은 동전 확인
    // 다시 해보기
    public static void main(String[] args) {
        int[] coinUnit = {500, 100, 50, 10}; // 동전 종류
        int[] coin = {5, 5, 5, 5}; // 동전의 개수

        System.out.println("금액을 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();

        for (int i=0; i<coinUnit.length; i++) {
            int coinNum = 0;

            coinNum = money / coinUnit[i];

            if (coin[i] >= coinNum) {
                coin[i] -= coinNum;
            } else {
                coinNum = coin[i];
                coin[i] = 0;
            }

            money -= coinNum * coinUnit[i];
            
            System.out.println(coinUnit[i]+"원 : " + coinNum);
        }

        System.out.println("=남은 동전의 개수=");

        for (int i=0; i<coinUnit.length; i++) {
            System.out.println(coinUnit[i] + "원 : " + coin[i]);
        }

    }
}

class Quiz8 {
    // 5-8 배열원소의 숫자만큼 별찍기
    public static void main(String[] args) {
        int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
        int[] counter = new int[4];

        for (int i=0; i<answer.length; i++) {
            // answer 배열은 1~4 이지만 counter배열(크기 4)에 저장하기 위해서는 1빼야됨
            // 그러면 1,2,3,4 각각의 개수가 counter 변수에 담김
            counter[answer[i]-1]++;
        }

        for (int i=0; i<counter.length; i++) {
            System.out.print(counter[i]);
            for (int j=0; j<counter[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Quiz9 {
    // 5-9 
}