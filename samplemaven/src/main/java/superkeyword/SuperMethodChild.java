package superkeyword;

public class SuperMethodChild extends SuperMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMethodChild obj=new SuperMethodChild();
		obj.display1();

	}
public void display1()
{
	System.out.println("this is the child class");
	super.display();
}
}
