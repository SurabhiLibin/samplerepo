package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<String> d=new ArrayList<String>();
	d.add("RED");
	d.add("BLUE");
	d.add("BLACK");
	d.add("RED");
	d.add("WHITE");
	d.add("YELLOW");
	System.out.println(d);
     
	System.out.println(d.indexOf("RED"));
	System.out.println(d.lastIndexOf("RED"));
	
	d.remove(4);
	System.out.println(d);
	d.set(3,"BROWN");
	System.out.println(d);
    System.out.println(d.get(2));
    System.out.println(d.contains("RED"));
    System.out.println(d.contains("PURPLE"));
    System.out.println(d.isEmpty());
	}

}
