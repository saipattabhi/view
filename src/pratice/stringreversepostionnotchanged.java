package pratice;

public class stringreversepostionnotchanged {

	public static void main(String[] args) {

		String str = "sai pattabhi";

		String[] word = str.split(" ");

		String rev = "";

		String revword = "";

		String ans = "";

		for (int i = 0; i < word.length; i++) {

			revword = word[i];

			for (int j = revword.length() - 1; j >= 0; j--) {

				ans += revword.charAt(j) + " ";

			}

			rev = ans + " ";

		}

		System.out.println(rev);

	}

}
