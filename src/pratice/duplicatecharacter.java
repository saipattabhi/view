package pratice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicatecharacter {

	static void duplicatecharacter(String inputstring) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		char[] characterstring = inputstring.toCharArray();

		for (Character c : characterstring) {

			if (map.containsKey(c)) {

				map.put(c, map.get(c) + 1);

			} else {

				map.put(c, 1);
			}

		}

		Set<Character> charset = map.keySet();

		for (Character ch : charset) {
			if (map.get(ch) > 1) {

				System.out.println(ch + ":" + map.get(ch));

			}

		}

	}
	
	public static void main(String[] args)
	{
		
		duplicatecharacter("Java2EE");
	}
	

}
