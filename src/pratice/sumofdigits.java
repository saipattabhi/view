package pratice;

import java.util.Scanner;

public class sumofdigits {

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		
		
		int num=sc.nextInt();
		
		
		sc.close();
		
		int sum=0;
		
		while(num>0)
		{
			
			
			
			sum+=num%10;
			
			num/=10;
			
			
		}
		
		
		System.out.println(sum);
		
		
		
		
		
		
		
		
		

	}

}
