package Array;

import java.util.Scanner;

public class CountArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[30];
       for (int i = 0;i<arr.length;i++){
           System.out.print("nhập vào số điểm của sinh viên thứ "+(i+1)+" : ");
           arr[i]= scanner.nextInt();
       }
       int count = 0;
       for (int i = 0 ; i<arr.length;i++){
           if (arr[i]>=5&&arr[i]<=10){
               count++;
           }
       }
        System.out.println("số các sinh viên vượt qua kì thi là : "+count+" người");
    }
}
