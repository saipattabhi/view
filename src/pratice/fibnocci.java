package pratice;

import java.util.Scanner;

public class fibnocci {

	public static void main(String[] args) {
		
		int n,a=0,b=1,c=1;
		
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter number");
		
		
		 n= sc.nextInt();
		 
		 sc.close();
		 
		 for(int i=0;i<=n;i++)
		 {
			 
			 System.out.println(c);
			 
			 c=a+b;
			 
			 a=b;
			 
			 b=c;
			 
			 
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
