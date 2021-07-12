package ArrLinkListJavaCollectionFrameWork;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
  static ArrayList<Product> list = new ArrayList<>();
  static Scanner scanner = new Scanner(System.in);

  public static void add(){
      System.out.println("nhập id : ");
      int id = Integer.parseInt(scanner.nextLine());
      System.out.println("nhập name : ");
     String name = scanner.nextLine();
      System.out.println("nhập address : ");
      int price = Integer.parseInt(scanner.nextLine());
      list.add(new Product(id,name,price));
  }
  public static void edit(){
      System.out.println("nhập id muốn sửa");
int id = Integer.parseInt(scanner.nextLine());
      System.out.println("nhập id mới : ");
      int newid = Integer.parseInt(scanner.nextLine());
      System.out.println("nhập name mới : ");
      String name = scanner.nextLine();
      System.out.println("nhập address mới : ");
      int price = Integer.parseInt(scanner.nextLine());
     Product product = new Product(newid,name,price);
             int index = -1;
     for (int i = 0 ;i<list.size();i++){
         if (list.get(i).getId()==id){
             index = i;
             break;
         }
     }
      if (index>=0){
          list.set(index,product);
      }

  }
  public static void remove(){
      System.out.println("nhập id muốn xóa ");
      int id = Integer.parseInt(scanner.nextLine());
      int index = -1;
      for (int i = 0 ;i<list.size();i++) {
          if (list.get(i).getId() == id) {
              index = i;
              break;
          }
      }
      if (index>=0){
          list.remove(index);
      }
      else {
          System.out.println("không có id để xóa");
      }
  }
  public static void search(){
      System.out.println("nhập id muốn tìm : ");
      int id = Integer.parseInt(scanner.nextLine());
      boolean check = false;
      for (Product p:list
           ) {
          if (p.getId()==id){
              System.out.println(" có id này ");
              check=true;
              break;
          }

      }
      if (!check){
          System.out.println("không có id này");
      }
  }
  public static void sort(){
      list.sort(new Comparator<Product>() {
          @Override
          public int compare(Product o1, Product o2) {
              return o1.getId()-o2.getId();
          }
      });
  }
  public static void display(){
      for (Product p:list
           ) {
          System.out.println(p);
      }
  }




}
