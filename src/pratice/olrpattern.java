package pratice;

import java.util.Scanner;

public class olrpattern {

	public static void main(String[] args) {
	
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int n=sc.nextInt();
		
		sc.close();
		
		
		for(int i=0;i<=n;i++)
		{
			
			for(int j=1;j<=n;j++)
			{
				
				System.out.print(j);
				
			}
			
			System.out.println();
			
		}
		
		
		
		

	}

}
