package Array;

import java.util.Scanner;

public class ValueArray {
    public static void main(String[] args) {
        String[] arr = {"một","hai","ba","bốn"};
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào một chuỗi");
        String str = sc.nextLine();
       boolean string = STR(arr,str);
        System.out.println(string);
    }

    public static boolean STR(String[]arr,String str) {
        boolean check = false;
        for (int i = 0 ; i <arr.length;i++){
            if (arr[i].equals(str)){
                System.out.println("giá trị của phần tử là : "+str+" ở vị trí thứ : "+(i));
                check = true;
                break;
            }

        }  if (!check){
            System.out.println("giá trị của phần tử "+str+" không có tron mảng");
        }
        return check;
    }
}
