package IO;

import java.io.*;

public class TaoFile {

    public static void cpFile() throws IOException {
        FileWriter fileWriter = null;
        try {
            File file = new File("test1.txt");

                System.out.println("file mới đã đc khởi tạo");
                file.createNewFile();
             fileWriter = new FileWriter(file);
            fileWriter.write("- sáu");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            fileWriter.close();
        }
    }

    public static void main(String[] args) throws IOException {
        cpFile();

    }
}
