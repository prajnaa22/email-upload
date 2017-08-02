package sample;

public class methodes {

	public static void main(String[] args) {
		myMethod("java");
		myMethod("c");
		int sum=Add(20,10);	
		// performing other operations
		int multiple = sum*20;
		System.out.println(multiple);
	}
	//passing values to the method
	public static void myMethod(String name)
	{
	System.out.println("print" +name);	
	}
	public static int Add(int a, int b)
	{
		//System.out.println(a+b);
		return (a+b);
	}

}
