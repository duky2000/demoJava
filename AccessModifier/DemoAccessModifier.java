package AccessModifier;

public class DemoAccessModifier {
 private int number;
 private String name;
 private static String hi = "hello";
 DemoAccessModifier (int number,String name){
     this.number = number;
     this.name = name;
 }
 static void change(){
     hi = "xin chào";
 }
   void display(){
      System.out.println(number+" ; "+name+" ; "+hi);
 }
}
class test {
    public static void main(String[] args) {
        DemoAccessModifier d1 = new DemoAccessModifier(1,"trương");
        DemoAccessModifier d2 = new DemoAccessModifier(2,"du");
        DemoAccessModifier d3 = new DemoAccessModifier(3,"kỳ");
        d1.display();
        d2.display();
        d3.display();
    }
}




