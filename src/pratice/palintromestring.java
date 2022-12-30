package pratice;

import java.util.Scanner;

public class palintromestring {

	public static void main(String[] args) {
		
	
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter String");
		
		
		String str=sc.next();
		
		sc.close();
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			
			rev=rev+str.charAt(i);
			
		}
		
		
		if(rev.equals(str))
		{
			
			System.out.println(str+ " Palintrome");
			
			
		}
		else
		{
			
			System.out.println(str+" Not Palintrome");
		}
		
		
		
		
		
		
		
		

	}

}
