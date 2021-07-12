package baitapIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {


   static File file = new File("person.csv");
    public static void write(ArrayList<Person> list) throws Exception {


        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Person p : list) {
            bufferedWriter.write(p.show());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();

    }

    public static void read(ArrayList<Person> list) throws Exception {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        while ((line=bufferedReader.readLine())!=null){
            String [] str = line.split(",");
            list.add(new Person(str[0],(Integer.parseInt(str[1])),str[2],str[3] ));
        }
        bufferedReader.close();
    }

    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<>();
        person.add(new Person("a",18,"a","0987446"));
        person.add(new Person("b",18,"a","0987446"));
        person.add(new Person("c",18,"a","0987446"));
        person.add(new Person("d",18,"a","0987446"));
        ReadWriteFile readWriteFile = new ReadWriteFile();
        try {
            readWriteFile.write(person);
            readWriteFile.read(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Person p :person) {
            System.out.println(p.show());
        }
    }
}
