package pratice;

public class duplicateswordsinstring {

	public static void main(String[] args) {

		String str = "Test Engineer Test Manager Test Lead".toLowerCase();

		String[] word = str.split("\\s");

		int count = 0;

		for (int i = 0; i < word.length; i++) {
			count=1;

			for (int j = i + 1; j < word.length; j++) {

				if (word[i].equals(word[j])) {

					word[j] = "";

					count++;
				}

			}
			if (count > 1 && word[i] != "") {

				System.out.print("Duplicate word" + word[i] + " count" + count);

			}

		}

	}

}
