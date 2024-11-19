package inheritance;

public class HierarchialChildC extends HierarchialParentA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialChildC obj1=new HierarchialChildC();
		obj1.display();
		obj1.display2();
	}

	public void display2()
	{
		System.out.println("child class C");
	}
}
