//Area of Rectangle
import java.util.Scanner;
class AreaofRectangle
    {
     public static void main(String arg[])
    {
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the Lenght of Rectangle");
      double lenght= s.nextDouble();
      System.out.println("Enter the Width of Rectangle");
       double width= s.nextDouble();
     // Operation
      double area= lenght*width;
     System.out.println("Area of Rectangle is: "+ area);
    }
  }