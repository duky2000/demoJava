package IO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MaxFile {
    public static List<Integer> readFile() throws FileNotFoundException {
        List<Integer> numbers = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\DELL\\IdeaProjects\\JAVA\\src\\IO\\numbers.text");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return numbers;
    }
    public static void writeFile(String max){
        try {
            FileWriter writer = new FileWriter("C:\\Users\\DELL\\IdeaProjects\\JAVA\\src\\IO\\numbers.text",true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            System.out.println("giá trị lớn nhất là " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int fileMax( List<Integer> number){
        int max = number.get(0);
        for (int i = 0 ; i<number.size();i++){
            if (max<number.get(i)){
                max=number.get(i);
            }
        }
        return max;

    }

    public static void main(String[] args) throws FileNotFoundException {
        MaxFile maxFile = new MaxFile();
        List<Integer> list = maxFile.readFile();
        int maxValue = fileMax(list);
        MaxFile.writeFile("giá trị lớn nhất là " + maxValue);
    }
}
