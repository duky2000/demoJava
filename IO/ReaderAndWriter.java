package IO;

import ArrLinkListJavaCollectionFrameWork.Main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReaderAndWriter {


    public static void writeFile() throws IOException {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\DELL\\IdeaProjects\\JAVA\\test.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            fileWriter.write("hello");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.close();
        }
    }

    public static void readFile() throws IOException {
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader("C:\\Users\\DELL\\IdeaProjects\\JAVA\\src\\IO\\numbers.text");
            bufferedReader = new BufferedReader(fileReader);
            String line = " ";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
        }

    }


    public static void main(String[] args) throws IOException {
        writeFile();
        readFile();

    }
}
