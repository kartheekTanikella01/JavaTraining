package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FIlewriterDemo {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter fileWriter=new FileWriter("openFile.txt");
            fileWriter.write("hi this is the open text ");
            fileWriter.close();
            System.out.println("succesfully writtten to file");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
