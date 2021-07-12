package Array;

public class MinArray {
    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {22, 3, 5, 11, 7};
        System.out.println("giá trị nhỏ nhất trong mảng là "+minValue(arr));
    }
}
