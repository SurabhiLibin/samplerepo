package superkeyword;

public class SuperVariableChild extends SuperVariable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperVariableChild obj=new SuperVariableChild();
		obj.display();

	}
	String colour="blue";
	
	public void display()
	{
		System.out.println(colour);
		System.out.println(super.colour);
	}

}
