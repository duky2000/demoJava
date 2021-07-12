package OnTapModule;

import baitap3.AgeCodition;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLySinhVien {
    static ArrayList<SinhVien> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static File file = new File("C:\\Users\\DELL\\IdeaProjects\\JAVA\\src\\sinhvien.csv");

    public static void add() {

        int id =getId();
        System.out.println("nhập tên  : ");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi  : ");
        int age;
        while (true) {
            try {
                age = Integer.parseInt(scanner.nextLine());

                if (age < 18) {
                    throw new AgeCodition();
                } else {
                    break;
                }
            } catch (AgeCodition e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("nhập giới tính  : ");
        String gender = scanner.nextLine();
        System.out.println("nhập địa chỉ : ");
        String address = scanner.nextLine();
        System.out.println("nhập điểm trung bình : ");
        double point = Double.parseDouble(scanner.nextLine());
        list.add(new SinhVien(id, name, age, gender, address, point));
    }
    private static int getId(){
        while (true){
            try {
                System.out.println("nhập id ");
                int id = Integer.parseInt(scanner.nextLine());
                boolean check = true;
                if (check) {
                    return id;
                }else throw new Exception();
            }catch (Exception e) {
                System.out.println("id phải là số ");
            }
        }
    }
    public static void edit() {
        System.out.println("nhập id sinh viên cần sửa : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập mã sinh viên : ");
        int newId = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên  : ");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi  : ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập giới tính  : ");
        String gender = scanner.nextLine();
        System.out.println("nhập địa chỉ : ");
        String address = scanner.nextLine();
        System.out.println("nhập điểm trung bình : ");
        double point = Double.parseDouble(scanner.nextLine());
        SinhVien sinhVien = new SinhVien(newId, name, age, gender, address, point);
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                index = i;
                list.set(index, sinhVien);
                break;
            }

        }
        if (index == -1) {
            System.out.println("không có id như vậy ");
        }
    }

    public static void delete() {
        System.out.println("nhập tên sinh viên muốn xóa : ");
        String name = scanner.nextLine();
      int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                index= i;
                System.out.println("bạn có chắc muốn xóa không ? ");
                System.out.println("1. có");
                System.out.println("2. không");
                int check = Integer.parseInt(scanner.nextLine());
                if (check >=0) {
                    list.remove(index);

                }

            }
        }if (index==-1) {
            System.out.println("không có tên bạn muốn xóa");
        }


        }



    public static void sort() {
        list.sort(new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getId() - o2.getId();
            }
        });
    }
    // sắp xếp c2
    public static void sapXep(){
        list.sort(Comparator.comparing(SinhVien::getName));
    }

    public static void doc() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<SinhVien> listNew = (ArrayList<SinhVien>) objectInputStream.readObject();
        for (SinhVien sinhvien : listNew) {
            System.out.println(sinhvien.toString());
        }
        objectInputStream.close();

    }

    public static void ghi() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.close();
    }

}

