package sample;

public class For {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		//for( int ix=0; ix<5; ix++)
		//{
			//System.out.println(a[ix]);
		//}
		for (int element : a)
		{
			System.out.println(element);
		}
			
	}

}
