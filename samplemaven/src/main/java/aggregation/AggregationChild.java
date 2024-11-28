package aggregation;

public class AggregationChild {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		AggregationEx1 obj1=new AggregationEx1("AMMU",25);
		AggregationChild obj=new AggregationChild(01,"TVM",obj1);
		obj.display();
		

	}
	int rollno;
	String city;
	AggregationEx1 ref; //reference variable
	
	public AggregationChild(int rollno,String city,AggregationEx1 ref)
	{
		this.rollno=rollno;
		this.city=city;
		this.ref=ref;
	}
public void display()
{
	System.out.println(rollno+city);
	System.out.println(ref.name+ref.age);
}
}
