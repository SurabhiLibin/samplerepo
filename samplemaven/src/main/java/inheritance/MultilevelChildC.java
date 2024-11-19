package inheritance;

public class MultilevelChildC extends MultilevelChildB{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelChildC obj=new MultilevelChildC();
		obj.display();
		obj.display1();
		obj.display2();

	}
public void display2()
{
	System.out.println("child class C");
}
}
