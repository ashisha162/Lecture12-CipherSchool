import java.util.*;

interface M
{
int x=10;
void fun();

}
interface N
{
int x=10;
void fun();

}

class C implements M,N
{
public void fun()
{
 System.out.println("Hello, I'm funtion C");
  System.out.println(M.x);
}
}

interface o extends M,N
{
	void fun();
}

class D implements o
{
	public void fun()
	{
		System.out.println("hello, Im funvtion in D");
	}
}

public class MultipleInheritance
{
public static void main(String args[])
{
C c = new C();
c.fun();
}
}