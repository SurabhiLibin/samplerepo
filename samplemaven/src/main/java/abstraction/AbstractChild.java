package abstraction;

public class AbstractChild extends Abstraction1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChild obj=new AbstractChild();
		obj.sum();
		obj.display();
	}

	
	@Override
	public void sum() {
		// TODO Auto-generated method stub
		int c=5+6;
		System.out.println(c);
	}

}
