import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class MyClass{
    public static void main(String[] args)  throws Exception{
        System.out.println("File ka ab khel hoga");
       /*  File file = new File("abc.txt");
        
        // file method
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.canRead());

        System.out.println(file.exists());
*/ 
      File file = new File("sadashis.txt");
        file.createNewFile();
       // we cant write or read file using OBJECT
       
       // To read a file use FileReader class

      /* FileReader fr = new FileReader(file);
       fr.read();
 */

       // To write in file user FileWriter class
      
      /* FileWriter fw = new FileWriter(file);
       fw.write("Hello I am Gopal gunda of this city"); */
       
       // its  in working condition
      // So we have to close the write process
      // then our content will display in sadashish.tct file
     
     /* fw.close(); */
      
      /*System.out.println(fr.read()); */
      // it will not read content of file 

      // so Buffer comes now in picture
      // Buffer has two method 
      // 1.) BufferedReader
      // 2.) BufferedWrited

      //write content to a file 
      FileWriter fw = new FileWriter(file);
      BufferedWriter bw = new BufferedWriter(fw);
      bw.write("Hii I am Vaishnavi singh ");
      // its in working process so closing is mandaotory
      bw.close();

      // now read a written file

      FileReader fr = new FileReader(file);
      BufferedReader br = new BufferedReader(fr);
      System.out.println(br.readLine());




    }
}