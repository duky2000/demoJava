package IO;

import java.io.*;
import java.util.Scanner;

public class TotalFileText {
    public void readFileText() {

        try {
            File file= new File("C:\\Users\\DELL\\IdeaProjects\\JAVA\\src\\IO\\numbers.text");
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int total = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                total += Integer.parseInt(line);
            }
            br.close();
            System.out.println("tổng là "+ total);
        } catch (Exception e) {
            System.out.println("file không tồn tại");

        }
    }

    public static void main(String[] args) {

        TotalFileText  totalFileText = new TotalFileText();
        totalFileText.readFileText();
    }
}
