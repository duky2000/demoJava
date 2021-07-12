package Array;

import java.util.Scanner;

public class MinArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10] ;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("nhập vào phần tử thứ "+i+" : ");
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int i = 0 ; i <arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("phần tử nhỏ nhất trong mảng là : "+min);
    }
}
