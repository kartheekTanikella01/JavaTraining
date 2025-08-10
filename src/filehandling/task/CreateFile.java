package filehandling.task;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File file = new File("openText.txt");

        try {
            FileWriter fileWriter=new FileWriter(file);
            String data="Java I/O is powerfull. ";
            String appenddata="java is easy to learn. ";            fileWriter.write(data);
            fileWriter.append(appenddata);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

