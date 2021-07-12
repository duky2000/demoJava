package Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReveseStack {
    public static void reveseInteger(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);

        }
        int tmp = stack.size();
        for (int i = 0; i < tmp; i++) {
            arr[i] = stack.pop();

        }
        for (Integer x : arr
        ) {
            System.out.println(x);

        }

    }

    public static String[] reveseString(String string) {
        Stack<String> stack = new Stack<>();
        String[] str = string.split("");
        for (int i = 0; i < str.length; i++) {
            stack.push(str[i]);

        }
        int tmp = stack.size();
        for (int i = 0; i < tmp; i++) {
            str[i] = stack.pop();

        }
        return str;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        reveseInteger(arr);

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập");
        String str = scanner.nextLine();
        String[] string = reveseString(str);
        System.out.println(Arrays.toString(string));

    }

}
