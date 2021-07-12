package Array;

import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập phần tử muốn xóa trong mảng ");
        int index = scanner.nextInt();
        int[] result = Delete(arr, index);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ; ");
        }
    }

    public static int[] Delete(int[] arr, int index) {
        int[] arr1 = new int[arr.length - 1];
        for (int i = 0; i < arr1.length; i++) {
            if (i < index) {
                arr1[i] = arr[i];
            } else {
                arr1[i] = arr[i + 1];
            }
        }
        return arr1;
    }
}
