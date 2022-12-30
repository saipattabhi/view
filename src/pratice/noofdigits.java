package pratice;

import java.util.Scanner;

public class noofdigits {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int no=sc.nextInt();
		
		sc.close();
		
		
		int a = 0;
		
		
		if(no<0)
		{
			
		no=no*-1;
		
			
			
		}
		
		else if(no==0)
		{
			
			
			no=1;
		}
		
		while(no>0)
		{
			no=no/10;
			
			a++;
			
		
		}
		
		
		System.out.println(a);
		
		
		
		
		
		
		

	}

}
