package IO;

import java.io.*;

public class TestCopyFile {
    public static void copyFile() {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("test1.txt");
            fileOutputStream = new FileOutputStream("test1_cp.txt");
            int check;
            while ((check = fileInputStream.read()) != -1) {
                System.out.print((char) check);
                fileOutputStream.write(check);
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
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
    // Copy File bằng cách sử dụng FileReader và FileWriter.
    public static void copyReaderAndWriter(){
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader("test1.txt");
            fileWriter = new FileWriter("test2_cp.txt");
            int check;
            while ((check=fileReader.read())!=-1){
                System.out.print((char)check);
                fileWriter.write(check);
            }
            fileWriter.write("xin chào");// có thể ghi thêm chuỗi vào  file
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
            if (fileWriter!=null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public static void main(String[] args) {
        copyFile();
        System.out.println();
        copyReaderAndWriter();
    }
}
