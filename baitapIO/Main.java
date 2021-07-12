package baitapIO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<>();
        person.add(new Person("a", 18, "a", "0987446"));
        person.add(new Person("b", 18, "a", "0987446"));
        person.add(new Person("c", 18, "a", "0987446"));
        DocGhiFileNhiPhan docGhiFileNhiPhan = new DocGhiFileNhiPhan();
        docGhiFileNhiPhan.ghiFile(person);
        docGhiFileNhiPhan.docFile();


    }
}
