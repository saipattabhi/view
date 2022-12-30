package pratice;

import java.util.Scanner;

public class palintrome {

	static int reversenumber(int num) {

		int rev = 0;

		while (num != 0) {

			rev = rev * 10 + num % 10;

			num /= 10;

		}

		return rev;

	}

	static boolean ispalintrome(int num) {

		int revnum = reversenumber(num);

		if (revnum == num) {

			return true;

		} else {

			return false;

		}
	}

	static void reverseandadd(int number) {

		if (ispalintrome(number)) {

			System.out.println(number + " palintrome number");

		}

		else {
			while (!ispalintrome(number)) {

				int rev = reversenumber(number);

				int sum = number + rev;

				System.out.println(number + " " + rev + "=" + sum);

				number = sum;

			}

		}

	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int input=sc.nextInt();
		
		sc.close();
		
		reverseandadd(input);
		
		
	}

}
