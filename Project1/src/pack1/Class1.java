package pack1;

public class Class1 
{
	int a,b,c;

	public Class1(int a, int b) 
	{
		super();
		this.a = a;
		this.b = b;
	}
	
	public void add()
	{
		c = a+b;
		System.out.println("Add  : " +  c);
	}
	
	public void sub()
	{
		c = a-b;
		System.out.println("Sub  : " +  c);
	}
	
	public static void main(String[] args) 
	{
		Class1 obj = new Class1(10,20);
		obj.add();
		obj.sub();
	}

}
