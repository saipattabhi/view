package pratice;

import java.util.ArrayList;
import java.util.List;

public class suminstring {

	public static void main(String[] args) {
		
		
		String str="25YTR25HGFT25";
		
		
		List<Integer>al=new ArrayList<Integer>();
		
		String temp="";
		
		
		for(int i=0;i<str.length();i++)
		{
			
			if(Character.isDigit(str.charAt(i)))
			
			temp+=str.charAt(i);
			
		
			if(i==str.length()-1)
			{
				al.add(Integer.valueOf(temp));
				
				temp="";
				
				
				
			}
			
			else if(Character.isAlphabetic(str.charAt(i) ) && !("".equals(temp)))
			{
				
				al.add(Integer.valueOf(temp));
				
				temp="";
				
			}
			
			
		}
		
		int ans=0;
		
	     for(int sum:al)
	     {
	    	 
	    	 ans+=sum;
	    	 
	    	 
	     }
		
		
		System.out.println(ans);
		
		
		
		
		
		
		

	}

}
