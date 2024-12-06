package collection;

import java.util.HashSet;
import java.util.Set;

public class SetOprns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> s=new HashSet<> ();
		s.add("RED");
		s.add("BLUE");
		s.add("GREEN");
		s.add("YELLOW");
		System.out.println(s);
		
		Set<String> s1=new HashSet<> ();
		s1.add("BLACK");
		s1.add("WHITE");
		
		s.addAll(s1);
		System.out.println(s);
		
		System.out.println(s.contains("BLUE"));
		
		System.out.println(s.containsAll(s1));
		System.out.println(s1.containsAll(s));
		System.out.println(s.isEmpty());
		
		
		System.out.println(s.size());
		s.removeAll(s1);
		System.out.println(s);
		
	
		

	}

}
