package assignment;

public class Offseason extends Onseason{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Offseason obj=new Offseason();
		obj.discount(3000);
		

	}
	
	public void discount(int totalprice)
	{
		int d=totalprice*15/100;
		System.out.println(d);
		super.discount(2000);
	}

}
