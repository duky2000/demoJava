package AccessModifier;

import java.util.Scanner;

public class Manager {
    private int id;
    private String name;
    private String gender;
    private int age;

    public Manager() {
    }

    public Manager(int id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Manager(int id, String name, int age, int phone, String email) {
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Manager { id : " + id + " ; name : " + name + " ; gender : " + gender + " ; age : " + age + " } ";
    }
    public static Manager[] create(Manager[] arr) { //2
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập Id : ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("nhập name : ");
        String name = sc.nextLine();
        System.out.print("giới tính : ");
        String gender = sc.nextLine();
        System.out.print("nhập tuổi : ");
        int age = Integer.parseInt(sc.nextLine());
        Manager newManager = new Manager(id, name, gender, age);
        Manager[] arrNew = new Manager[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        arrNew[arrNew.length - 1] = newManager; //3
        return arrNew;
    }
    public static Manager[] edit(Manager[] arr) {
        // [
        // {id: 1, ten : ten1, tuoi: 20, gt: nam}
        // {id: 2, ten : ten2, tuoi: 20, gt: nam}
        // {id: 3, ten : ten3, tuoi: 20, gt: nam}
        //]
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập Id của manager muốn sửa: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("nhập name sửa: ");
        String name = sc.nextLine();
        System.out.print("giới tính sửa: ");
        String gender = sc.nextLine();
        System.out.print("nhập tuổi sửa: ");
        int age = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < arr.length; i++) {
            // tim manager co id ben tren
            // thay doi name, gender, age
            //arr[i].setName(name)
            if (arr[i].getId() == id){
                arr[i].setName(name);
                arr[i].setGender(gender);
                arr[i].setAge(age);
            }
        }
        return arr;
    }
    public static Manager[] delete(Manager[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập Id của manager muốn xóa: ");
        int id = Integer.parseInt(sc.nextLine()); // 3
        Manager[] arrNew = new Manager[arr.length - 1];
        for (int i = 0; i < arrNew.length; i++) {
            //neu i nho id thi van add vao mang moi bt
            //neu lon hon thi add vao mang moi phan tu mang cu voi chi so la +1
            // [m1, m2, m3, m4,m5] -> [m1, m2,
            if (arr[i].getId()<id){
                arrNew[i]=arr[i];
            }else {
                arrNew[i]=arr[i+1];
            }
        }
        return arrNew;
    }
}


