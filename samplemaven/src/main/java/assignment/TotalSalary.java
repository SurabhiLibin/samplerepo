package assignment;

public class TotalSalary extends Allowances{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TotalSalary obj=new TotalSalary();
		obj.getdata(30000,2000,1000);
		obj.allow();
		obj.salaryslip();

	}
	
	public void salaryslip()

	{
		int total=basicpay+hra-pf-ded+bonus;
		System.out.println("SALARY SLIP");
		System.out.println("basicpay=" + basicpay);
		System.out.println("ded=" + ded);
		System.out.println("hra="+hra);
		System.out.println("pf=" + pf);
		System.out.println("bonus="+ bonus);
		System.out.println("TOTAL SALARY=" + total);
	}
}
