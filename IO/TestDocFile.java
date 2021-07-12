package IO;

import java.io.*;

public class TestDocFile {

    // đọc file bằng InputStream.

    public static void ReadInPutStream() {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("test1.txt");
            int check;
            while ((check = fileInputStream.read()) != -1) {
                System.out.print((char) check);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    // đọc bằng FileReader(file này chỉ đc sử dụng trong phần file text).

    public static void readerFile()  {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("test1.txt");
            int check;
            while ((check=fileReader.read())!=-1){
                System.out.print((char)check);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (fileReader!=null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public static void main(String[] args) {
        ReadInPutStream();
        System.out.println();
        readerFile();
    }
}
