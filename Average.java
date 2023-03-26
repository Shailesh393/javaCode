//Average of number
import java.util.Scanner;
class Average 
     {
          public static void main(String arg[])
           {
              Scanner s= new Scanner(System.in); 
            System.out.println("Enter the numbers for Average: ");
            double a=s.nextDouble();
           double b= s.nextDouble();
            double c= s.nextDouble();
             double Average=(a+b+c)/3;
          System.out.println("Average of three numbers: " +Average);
           }
     }
