interface Shape
{
double pi=3.14;//public ,static ,final by iteself 
double getSquare(double r);  //public and abstract
}

class Circle implements Shape
{
public double getSquare(double r)
{
return r*r;
}
void fun()
{
System.out.println("Hey,I m implented an interface shape");

}
}

//object can't be created out of the interface








public class  InterfaceStudy
{
public static void main(String args[])
{
 Circle c =new Circle();
 System.out.println(c.getSquare(5));
 c.fun();
}
}

