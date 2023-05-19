import java.util.Scanner;
class S_Handle2{
public static void main(String args[]){
    System.out.println("Enter a String \n");
Scanner obj= new Scanner(System.in);
String str= obj.nextLine();
System.out.println("Methods of String :");
System.out.println("1.length\n"+ "2.Uppercase\n" +"3.Lowercase\n" +"4.Trim\n" +"5.CharacterAtIndex\n" +"6.Indexof\n"+ "7.Substring\n");
int c;
c= obj.nextInt();
switch(c){
      case 1:
          System.out.println(str.length());
          break;
      case 2:
          System.out.println(str.toUpperCase());
          break;
       case 3:
          System.out.println(str.toLowerCase());
          break;
       case 4:
          System.out.println(str.trim());
          break;
       case 5:
          System.out.println(str.charAt(4));
          break;
       case 6:
          System.out.println(str.indexOf('a'));
          break;
       case 7:
          System.out.println(str.substring(4));
         break;
}
    
}
}
         