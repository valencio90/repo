package string;

import java.util.*;

public class Concatenation {
	
	public String concatenate() {
		String s1,s2;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first string:");
		s1 = sc.nextLine();
		System.out.print("enter the second string:");
		s2 = sc.nextLine();
		
		String string = s1+" "+s2;
		
		return string;
	}

}
