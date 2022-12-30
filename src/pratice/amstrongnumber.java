package pratice;

import java.util.Scanner;

public class amstrongnumber {

	public static void main(String[] args) {

		int num, number, temp, total = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number");

		num = sc.nextInt();

		sc.close();
		
		
		number=num;
		
		while(number!=0)
		{
			
			temp=number%10;
			
			total=total+temp*temp*temp;
			
			number/=10;
			
		}
		
		
		if(total==num)
		{
			
			System.out.println(num+"Amstrong");
		}
		else
		{
			
			System.out.println(num+" Not Amstrong");
		}
	}

}
