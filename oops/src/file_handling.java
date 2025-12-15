
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class file_handling {
    public static void main(String[] args) throws IOException {
        // creating single folder
       File f=new File("C:\\java learning\\sample");
       f.mkdir();
       // creating mutilple folder
       File f1= new File("C:\\java learning\\sample\\fold1\\fold2");
       f1.mkdirs();
       //file creating
       File f2= new File("C:\\java learning\\file.txt");
       f2.createNewFile();
       // file creating
       File f3= new File("C:\\java learning\\sample\\file.txt");
       f3.createNewFile();
       //writing content in the file
        FileWriter fw= new FileWriter("C:\\java learning\\sample\\file.txt");
        fw.write("hello world");
        fw.write("good even students");
        fw.close();
        // reding content in the file
        // reading file using file reader
        FileReader fr=new FileReader(f3);
        int a=0;
        while((a=fr.read())!=-1){
            char b= (char)a;
            System.out.print(b);
        }
        // reading file content using Scanner
        Scanner sc= new Scanner(f3);
        while(sc.hasNext()){
            System.out.println(sc.next());
        }

    }
}
