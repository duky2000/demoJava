package Array;

import java.util.Scanner;

public class TotalCross {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số dòng ");
        int row = scanner.nextInt();
        System.out.println("nhập số cột");
        int col = scanner.nextInt();
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("nhập dòng thứ " + i + " ; nhập số cột thứ " + j);
                arr[i][j] = scanner.nextInt();
            }
        }
        int total = 0;
        System.out.println("nhập số cột muốn tính ");
        int col2 = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            total += arr[i][i];
        }
        System.out.println("tổng số cột bạn chọn là " + total);
    }
}
