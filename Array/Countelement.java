package Array;

import java.util.Scanner;

public class Countelement {
    public static void main(String[] args) {
        String [] arr={"a","b","c","d","a"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào phần tử");
        String str2 = scanner.nextLine();
        int count = 0;
        for (int i = 0 ; i<arr.length;i++){
            if (arr[i].equals(str2)){
                count++;
            }
        }
        System.out.println("ký tự lặp lại trong chuỗi là "+count);

    }
}
