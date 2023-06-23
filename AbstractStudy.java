import java.util.*;
 abstract class Car // we cannot istancetiate an abstract class, which menas we cannot create objects of an abstract class 
{
int maxSpeed;
abstract void accelerate();//only declared but not implemented . It is without a body
//they are created to force the child classes implement them before using . we will use them after overriding
abstract void brake();

}
abstract class BMW extends Car
{
void accelerate()

{
System.out.println("BMW is accelerating");

}
}

class BMW1 extends BMW{
	void brake()
	{
		System.out.println("BMW is applying brake");
	}
}

public class AbstractStudy
{
public static void main(String args[])
{
//Car c =new Car(); // can'nt istancetiate a abstract class
//BMW bmw=new BMW();
//BMW.accelerate();
BMW1 b=new BMW1();
b.accelerate();
b.brake();


}
}
