package Array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập vào số lượng phần tử trong mảng");
//        int num = sc.nextInt();
//        int[] arr = new int[num];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("nhập phần tử thứ " + (i + 1) + " : ");
//            arr[i] = sc.nextInt();
//        }
//        System.out.println();
//        for (int j = 0; j < arr.length/2; j++) {
//            int temp = arr[j];
//            arr[j] = arr[num - 1];
//            arr[num - 1] = temp;
//        }
//        System.out.printf("mảng đã được đảo ngược : ");
//        for (int j = 0; j < arr.length; j++) {
//            System.out.print(arr[j] + "\t");
//        }
        int[] arr = {1,2,3,4};
        for (int i = 0 ; i <arr.length/2;i++){
            int a = arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]= a ;
        }
        for (int j = 0 ; j<arr.length;j++){
            System.out.print(arr[j]);
        }

    }
}
