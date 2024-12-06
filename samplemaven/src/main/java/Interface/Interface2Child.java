package Interface;

public class Interface2Child implements Interface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2Child obj=new Interface2Child();
		obj.display();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("hello world");
	}

}
