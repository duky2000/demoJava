package Thread;

public class TestSNT {
    public static  void main(String[] args) {
        SoNguyenTo1 soNguyenTo1 = new SoNguyenTo1();
        Thread thread1 = new Thread(soNguyenTo1);
        thread1.start();
        SoNGuyenTo2 soNguyenTo2 = new SoNGuyenTo2();
        Thread thread2 = new Thread( soNguyenTo2);
        thread2.start();
    }
}
