import java.io.*;
// import java.io.BufferedReader;
public class bufferedReader {
    public static void main(String[] args) {
        // BufferedReader is use to read line to text not single character
       
        // method to take input from keyboard
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter your text: ");
            System.out.println("You typed : "+ br.readLine());
        }catch(IOException e){
            System.out.println(e.getMessage());

        }

        // method to read file which is already created
        try(BufferedReader br = new BufferedReader(new FileReader("sadashis.txt"))){
            System.out.println("I am reading sadashis.txt file");
            while(br.ready()){
                System.out.println(br.readLine());
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
