package filehandling.task;

import java.io.*;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("openText.txt");
        FileReader reader=new FileReader(file);
        try{
            BufferedReader bufferedReader=new BufferedReader(reader);
            System.out.println(bufferedReader.readLine());
            bufferedReader.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
