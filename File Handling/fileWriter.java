import java.io.*;
public class fileWriter {
    public static void main(String[] args) {
        //The purpose of the FileWriter class is to simply write character based files.
        //The FileWriter class implements AutoClosable so we can use the try-with-resources type exception handling.
        //F  ileWriter class does not define or override any public methods, so it inherits all of its methods from its superclass OutputStreamWriter.

        try(FileWriter fw = new FileWriter("sadashis.txt")){
              fw.write("Hello world , my name is sadasish kumar.");
   }catch(IOException e){
       System.out.println(e.getMessage());

   }

   // if u want to append text line in end of line of file , then add true
   try(FileWriter fw = new FileWriter("sadashis.txt",true)){
    fw.write("I am from Jharkhand.");
}catch(IOException e){
System.out.println(e.getMessage());

}
    

    try(BufferedWriter bw = new BufferedWriter(new FileWriter("sadashis.txt",true))){
        bw.write("I hava completed my bachelor of engineering in tumjur.");
    }catch(IOException e){
    System.out.println(e.getMessage());
    
    }
        }
}
