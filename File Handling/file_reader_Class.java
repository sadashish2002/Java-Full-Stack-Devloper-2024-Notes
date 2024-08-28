import java.io.FileReader;
import java.io.IOException;
public class file_reader_Class {
    public static void main(String[] args) {
        
      try(FileReader fr = new FileReader("sadashis.txt")){
            int letter = fr.read(); // it give integer value
            while(fr.ready()){
                System.out.print((char) letter+ " ");
                letter = fr.read();
            }
      }catch(IOException e){
        System.out.println(e.getMessage());
      }
    }
}
