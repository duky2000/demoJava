package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedIOstream {
    public static void buffered(){
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            fileInputStream = new FileInputStream("test1.txt");
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            byte [] data = new byte [1024];// đọc dữ liệu theo mảng byte read( byte [] b ).
          int length =  bufferedInputStream.read(data);
            System.out.println(" độ dài của Length "+length);
            String str = new String(data);
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (fileInputStream!=null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if (bufferedInputStream!=null){
                try {
                  bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public static void main(String[] args) {
        buffered();
    }


}
