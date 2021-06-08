package demoJava;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần đọc");
        int number = scanner.nextInt();
        if (number < 10 && number >= 0) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("teen");
                default:
                    System.out.println("out of ability");
            }
        }if (number>=10&&number<20){
            switch (number){
                case 11:
                    System.out.println("oneteen");
                    break;
                case 12:
                    System.out.println("twoteen");
                    break;
                case 13:
                    System.out.println("threeteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fiveteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eightteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
                default:
                    System.out.println("out of ability");
            }
        }
    }
}

