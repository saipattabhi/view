package pratice;

import java.util.Scanner;

public class floyds {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number");

		int n = sc.nextInt();

		sc.close();

		int value = 1;
		
		
		for(int i=0;i<=n;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(value+"\t");
				
				value++;
				
				
			}
			
			System.out.println();
			
		}
		
		

	}

}
