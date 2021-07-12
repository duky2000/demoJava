package Array;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
//        int[] arr = {2, 4, 6, 8, 3, 7};
//        int max = arr[0];
//        int x = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//                x = i;
//            }
//        }
//        System.out.println("số lớn nhất trong mảng là " + max + " ở vị trí thứ " + x);

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài của mảng");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhập phần tử thứ " + i);
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("giá trị lớn nhất trong mảng là : " + max + " ở vị trí thứ " + index);
    }
}
