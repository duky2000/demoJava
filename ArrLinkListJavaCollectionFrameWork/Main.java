package ArrLinkListJavaCollectionFrameWork;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("Quản Lý Product ");
            System.out.println("1. Thêm ");
            System.out.println("2. Sửa ");
            System.out.println("3. Xóa ");
            System.out.println("4. Hiển thị");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Sắp xếp ");
            System.out.println("7. Exit");
            System.out.println("chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                   ProductManager.add();
                    break;
                case 2:
                  ProductManager.edit();
                    break;
                case 3:
                    ProductManager.remove();
                    break;
                case 4:
                  ProductManager.display();
                    break;
                case 5:
                    ProductManager.search();
                    break;
                case 6:
                   ProductManager.sort();
                    break;
                case 7:
                    System.exit(0);

            }
        }
    }
}


