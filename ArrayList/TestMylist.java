package ArrayList;
import java.util.*;
public class TestMylist {
    public static void main(String[] args) {
        MyList<Object> myList = new MyList<Object>();
        myList.add("a");
        myList.add("b");
        myList.add("c");
        myList.add("d");

        System.out.println("element 0 là : " + myList.get(0));
       for(int i=0;i<myList.size;i++){
           System.out.println(myList.get(i));
       }
        System.out.println(myList.contains("b"));
        System.out.println(myList.indexOf("a"));
        myList.remove(2);
        for(int i=0;i<myList.size;i++){
            System.out.println(myList.get(i));
        }




    }
}
