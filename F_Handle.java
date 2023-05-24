// Importing File Class
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
class F_Handle{
    public static void main(String[] args) throws IOException
    {
         
        // File Creation
        File fp = new File("c://Users//91639//Desktop//JavaCode// f_Pal.txt");
       
         fp.createNewFile();
         if(fp.exists())
         {
          System.out.println("Your file created");
          System.out.println(fp.canRead());
          System.out.println(fp.canWrite());
        }
          else{
            System.out.println("File already exists");
             }
     
    //Write in File
     FileWriter myWriter = new FileWriter(fp);
      myWriter.write("Hello My name is Shailesh pal \n"+"Nice to see you \n"+"How are you?");
      myWriter.close();
      System.out.println(" succesfully written.");
      

     
     // Read to the File
        Scanner myReader = new Scanner(fp);
       while (myReader.hasNextLine()) 
       {
         String data = myReader.nextLine();
         System.out.println(data);
       }
          myReader.close();
    }
}