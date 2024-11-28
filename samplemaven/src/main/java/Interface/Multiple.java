package Interface;

public class Multiple implements Printable,Showable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple obj=new Multiple();
		obj.show();
		obj.print();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("PARENT 1");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("PARENT 2");
		
	}

}
