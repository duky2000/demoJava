package Array;

import java.util.Scanner;

public class PushArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 8, 9, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập phần tử muốn thêm trong mảng ");
        int element = scanner.nextInt();
        System.out.println("nhập vị trí muốn thêm trong mảng ");
        int index = scanner.nextInt();
        int[] result = Push(arr, index,element);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ; ");
        }

    }

    public static int[] Push(int[] arr, int index, int element) {
        int[] arr1 = new int[arr.length + 1];
        for (int i = arr.length; i > index; i--) {
                arr1[i] = arr[i-1];
        }
        arr1[index] = element;
        for (int i = 0; i < index; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }
}
