import java.io.*;
public class inputStreamReader {
    public static void main(String[] args) {
        //inputstreamReader is Primarily it is used to convert byte streams to character streams.
        // bytestream is likely to take input from keyboard
        // so to read character from bytestream 
        try(InputStreamReader isr = new InputStreamReader(System.in)){ // read character from keyboard we need to use InputStreamReader
             System.out.println("Enter some letter to take from keyboard: ");
             int letter = isr.read();
             while(isr.ready()){
                System.out.print((char)letter+ " ");
                letter = isr.read();
             }
 
        }catch(IOException e){
            System.out.println(e.getMessage());

        }
    }
}
