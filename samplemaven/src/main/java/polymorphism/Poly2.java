package polymorphism;

public class Poly2 extends Poly1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly2 obj=new Poly2();
		obj.display(10,20);

	}
	public void display(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		super.display(20,30);
	}

}
