import java.io.*;
public class File_Creation {
    public static void main(String[] args) {
           //file creation
        try{
            File file = new File("gopu.txt");
            file.createNewFile();

           
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        //write in the file 
       
        try{
            FileWriter fw = new FileWriter("gopu.txt");
            fw.write("Eso Panch Namokkaro, Savva Pâvappanâsano, Mangalanam Cha Savvesim, Padhamam Havai Mangalam.");
            fw.close();
           
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        // Read from file

        try(BufferedReader br = new BufferedReader(new FileReader("gopu.txt"))){
             System.out.println(br.readLine());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

            //DELETE A FILE 
            try{
                File file = new File("random.txt");
                file.createNewFile();
               
                if(file.delete()){
                    System.out.println(file.getName()+"File has been deleted: ");
                }
               
            }catch(IOException e){
                System.out.println(e.getMessage());
            }

    

    }
}
