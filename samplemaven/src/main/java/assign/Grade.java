package assign;

public class Grade {
	int maths;
	int eng;
	int mal;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grade obj=new Grade(55,89,92);
		Grade obj1=new Grade(85,82,90);
		System.out.println("grade of student 1=" + obj.getGrades());
        System.out.println("grade of student 2="+obj1.getGrades());
	}
	
	
	
	public Grade(int maths,int eng,int mal)
	{
		this.maths=maths;
		this.eng=eng;
		this.mal=mal;
	}
	
	public int totalmarks()
	{
		return maths+eng+mal;
		
	}
	
	public double percentage()
	{
		double percent=totalmarks()*100/300;
		return percent;
	}
	public char getGrades()
	{
	char result;
	if (percentage()>90)
	{
		result='A';
	}
	else if(percentage()>80 && percentage()<=90)
	{
		result='B';
	}
	else if(percentage()>70 && percentage()<=80)
	{
		result='C';
	}
	else
	{
		result='D';
	}
	return result;
	}
}
