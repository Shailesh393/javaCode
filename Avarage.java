//Avarage of number
import java.util.Scanner;
class Avarage 
     {
          public static void main(String arg[])
           {
              Scanner s= new Scanner(System.in); 
            System.out.println("Enter the numbers for Avarage: ");
            double a=s.nextDouble();
           double b= s.nextDouble();
            double c= s.nextDouble();
             double Avarage=(a+b+c)/3;
          System.out.println("Avarage of three numbers: " +Avarage);
           }
     }