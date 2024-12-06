package assignment;

public class AggregAssignMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggregAssign obj1=new AggregAssign("AMMU",01);
		AggregAssignMain obj=new AggregAssignMain("Obsqura Zone, TVM",obj1);
		obj.display();
		

	}
	
	String address;
	AggregAssign ref;

	public AggregAssignMain(String address,AggregAssign ref)
	{
		this.address=address;
		this.ref=ref;
	}
	
	public void display() 
	{
	System.out.println(ref.name+"," + ref.rollno +","+ address);	
	}
	
}
