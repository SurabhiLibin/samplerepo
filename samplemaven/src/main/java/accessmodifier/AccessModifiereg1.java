package accessmodifier;

public class AccessModifiereg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiereg1 obj=new AccessModifiereg1();
		obj.display();
		obj.display1();
		obj.display3();
		obj.display4();

	}
public void display()
{
	System.out.println("public access modifier");
}
private void display1()
{
	System.out.println("private access modifier");
}
protected void display3()
{System.out.println("protected access modifier");
	}
void display4()
{
	System.out.println("default modifier");
}
}
