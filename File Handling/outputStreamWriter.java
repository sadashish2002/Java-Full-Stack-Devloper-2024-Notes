import java.io.*;
public class outputStreamWriter {
    public static void main(String[] args) {
        //Used to write to character streams.
        //The OutputStreamWriter class implements AutoClosable 
        //so we can use the try-with-resources type exception handling.
        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)){
                 osw.write("Hello world");
                 osw.write('\n');

                 osw.write(98);
                 osw.write('\n');
                 osw.write(123);
                 osw.write('\n');
                 osw.write('A');
                 osw.write('\n');
                 char[] arr = "Sadashish kuamr".toCharArray();
                 osw.write(arr);
        }catch(IOException e){
            System.out.println(e.getMessage());

        }
    }
}
