
import java.io.FileReader;
import java.io.Reader;

public class Ready_method {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("sadashis.txt");
        // check if stream or file is ready to read or not
        if(fr.ready()){
            System.out.println("Stream is ready to read");
            int ch = fr.read();
            System.out.println((char)ch);

        }
        else{
            System.out.println("Stream is not ready to read; considering buffering or blocking");

        }
    }
}