package pratice;

import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter number of rows");
		
		
		int num=sc.nextInt();
		
		sc.close();
		int r=1;
		
		
		for(int i=num;i>=0;i--)
		{
			
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(" ");
				
			}
			for(int j=1;j<=r;j++)
			{
				
				System.out.print(" *");
				
			}
			
			r++;
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		

	}

}
