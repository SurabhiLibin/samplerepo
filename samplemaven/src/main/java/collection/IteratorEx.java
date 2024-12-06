package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> d=new ArrayList<String> ();
		
		d.add("blue");
		d.add("green");
		d.add("white");
		d.add("black");
		d.add("blue");
		d.add("red");
		System.out.println(d);
		
		Iterator it=d.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		System.out.println(d);

	}

}
