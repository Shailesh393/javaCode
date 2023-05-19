import java.util.Scanner;
class ExceptionHandling{
      public static  void main(String args[]){
        Scanner sc= new Scanner(System.in);
      	int a= 20, b=0;//Initialization
      	int arr[]={1,2,3,4,5};
      	String name= null;
        System.out.println("1.ArithmeticException\n"+ "2.ArrayOutOfBoundsException\n" +"3.NullPointer\n");
                int x= sc.nextInt();

        switch(x){
              case 1:
                      try {
                     	System.out.println(a/b);
                         }
                     catch(Exception e) {
                     	System.out.println(e);
                     	System.out.println(e.toString());                     	                        System.out.println(e.getMessage());
                     	 }
                     	 break;
               case 2:
                      try{
                      	System.out.println(arr[6]);
                         }      	 
                        catch(Exception p){
                      	System.out.println(p);
                      	}
                      	break;
                      
                case 3:
                      try{
                      	System.out.println(name.length());
                      }
                      catch(Exception t)
                       {
                      	System.out.println(t);
                        }
                    break;
                default: 
                      System.out.println("Invaild Input");

                     }     
      }
     }  