class A{
     int a= 120;
}
class B extends A{
int b=210;
}
class C extends B{
int c=327;
}
class d extends C{
int d=342;
}
class MLInherit {
public static void main(String args[]){
double Avg, sum=0;
d obj= new d();
sum= obj.a+ obj.b+ obj.c+ obj.d;
Avg= sum/4;
System.out.println(Avg);
} 
}

//out put: 249.75
