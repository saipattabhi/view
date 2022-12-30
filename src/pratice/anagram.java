package pratice;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		
		
		isanagram("head","toss");
	}

	
	static void isanagram(String s1,String s2)
	{
		
		
	char[] ca1 = s1.toLowerCase().toCharArray();
	
	
	char[] ca2 = s2.toLowerCase().toCharArray();
	
	
	
	Arrays.sort(ca1);
	
	Arrays.sort(ca2);
	
	boolean status=true;
	
	
	status=Arrays.equals(ca1, ca2);
	
	
	
	if(status)
	{
		
		System.out.println(s1+" and"+s2 +" Anagrams");
		
		
	}
	else
		
	{
		
		System.out.println(s1+ "and"+" Not Anagrams");
		
	}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
