package Array;

import java.util.Scanner;

public class AddupArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số phần tử trong mảng 1 : ");
        int prompt1 = sc.nextInt();
        int[] arr1 = new int[prompt1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("nhập phần tử thứ " + i + " : ");
            arr1[i] = sc.nextInt();
        }
        System.out.print("nhập số phần tử trong mảng 2 : ");
        int prompt2 = sc.nextInt();
        int[] arr2 = new int[prompt2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("nhập phần tử thứ " + i + " : ");
            arr2[i] = sc.nextInt();
        }
        int prompt3 = prompt1 + prompt2;
        int[] arr3 = new int[prompt3];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[prompt1 + i] = arr2[i];
        }


        for (int x : arr3) {
            System.out.print(x + ";");
        }
    }
}
