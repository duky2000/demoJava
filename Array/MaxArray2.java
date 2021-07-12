package Array;

import java.util.Scanner;

public class MaxArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số dòng");
        int row = scanner.nextInt();
        System.out.println("nhập số cột");
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("nhập các phần tử trong mảng 2 chiều");
        for (int i = 0 ; i <row;i++){
            for (int j= 0; j<col;j++){
                System.out.print("nhập dòng thứ "+i+" : "+" nhập cột thứ "+j+" : ");
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0;i<row;i++){
            for (int j = 0 ; j <col;j++){
                if (arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("phần tử lớn nhất trong mảng 2 chiều là : "+max);
    }
}
