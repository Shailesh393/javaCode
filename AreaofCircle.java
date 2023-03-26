// Area of Circle 
    import java.util.Scanner;
   class AreaofCircle
        {
          public static void main(String arg[])
            {
           Scanner s = new Scanner(System.in);
           System.out.println("Enter the radius of Circle:");
           double r= s.nextDouble();
         //Operation logic
          double area= (22*r*r)/7;
          System.out.println("Area of Circle is:  " + area);
          }
     }   
