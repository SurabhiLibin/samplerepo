package review;

public class Constrtr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constrtr obj=new Constrtr("AMMU",01);
			obj.display();
		Constrtr obj1=new Constrtr("ANU",02);
		obj1.display();
	}
	String a;
	int b;
	String c="ABc";
	
	public Constrtr(String name,int rollno)
	{
		a=name;
		b=rollno;
		
	}
	
	public void display()
	{
		
		System.out.println(a +" " + b+" "+c);
		
	}
}
