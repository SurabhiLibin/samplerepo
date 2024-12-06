package exceptionhandling;

public class ArithHand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		
		try
		{
			int c=a/b;
		}
		catch(ArithmeticException var)
		{
			 b=2;
			int d=a/b;
			System.out.println(d);
			System.out.println(var);
		}
		
		finally
		{
			System.out.println("finally block");
		}

	}

}
