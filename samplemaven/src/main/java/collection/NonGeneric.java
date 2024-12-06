package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l=new ArrayList();
		
		l.add(5);
		l.add("apple");
		l.add(2.5);
		l.add("red");
		l.add(9);
		System.out.println(l);
		
		l.set(4,10);
		System.out.println(l);
		
		l.remove(2);
		System.out.println(l);
		
		System.out.println(l.get(2));
		System.out.println(l.contains(10));
		System.out.println(l.isEmpty());

	}

}
