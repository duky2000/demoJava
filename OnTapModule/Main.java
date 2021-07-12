package OnTapModule;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        while (true) {
            System.out.println("Quản Lý Sinh Viên");
            System.out.println("1.Hiển thị Sinh Viên");
            System.out.println("2.Thêm sinh viên");
            System.out.println("3.Sửa sinh viên ");
            System.out.println("4.Xóa sinh viên");
            System.out.println("5.Sắp xếp");
            System.out.println("6.Đọc");
            System.out.println("7.Ghi");
            System.out.println("8.Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                case 6:
                    QuanLySinhVien.doc();
                    break;
                case 2:
                    QuanLySinhVien.add();
                    QuanLySinhVien.ghi();
                    break;
                case 3:
                    QuanLySinhVien.edit();
                    QuanLySinhVien.ghi();
                    break;
                case 4:
                    QuanLySinhVien.delete();
                    QuanLySinhVien.ghi();
                    break;
                case 5:
                    QuanLySinhVien.sort();
                    QuanLySinhVien.ghi();
                    break;
                case 7:
                    QuanLySinhVien.ghi();
                    break;
                case 8:
                    System.exit(0);
            }
        }
    }
}
