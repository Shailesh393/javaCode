//Swapping Operation with Local Variable
class Swap
{
   public static void main(String arg[])
   {
   // Using Local variable
      int a=10, b=20, temp;
     //Before Swapping
      System.out.println("Before Swapping : a= "+ a +" b= "+b);
       //Logic
        temp=a;
         a=b;
         b=temp;
    // After Swapping 
      System.out.println("After Swapping :a= "+a+" b= "+b);
    }
 }