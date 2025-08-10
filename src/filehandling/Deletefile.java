package filehandling;


import java.io.File;

public class Deletefile {
    public static void main(String[] args) {
        File file=new File("openFile.txt");
        boolean file1=file.delete();
        if (file1){
            System.out.println("deleted");
        }else{
            System.out.println("not deleted");
        }

    }

}
