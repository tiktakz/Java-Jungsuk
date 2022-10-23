package Chapter6;

public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = {3,2,1,6,5,4};

        printArr(arr);
        sortArr(arr);
        printArr(arr);
    }

    static void printArr(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    // sortArr은 매개변수로 참조형을 받기 때문에 원래 배열의 arr에 영향을 주어
    // 기존의 arr배열은 정렬된 형태로 바뀌게 된다.
    static void sortArr(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}
