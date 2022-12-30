package pratice;

import java.util.ArrayList;
import java.util.List;

public class groupofevenandodd {

	public static void main(String[] args) {

		String str = "I Am An Automation Engineer";

		String split[] = str.split(" ");

		List<String> evenstr = new ArrayList<String>();

		List<String> oddstr = new ArrayList<String>();

		for (int i = 0; i < split.length; i++) {
			

			if (i % 2 == 0) {

				System.out.println("#############" + evenstr.add(split[i]));

			}

			else {

				System.out.println("%%%%%%%%%%" + oddstr.add(split[i]));
			}

		}
		
		
		for(int j=0;j<evenstr.size();j++)
		{
			
			String capt = evenstr.get(j).charAt(0)+evenstr.get(j).substring(1)+" ";
			
			
			System.out.println(capt);
			
			
		}
		
		for(int k=0;k<oddstr.size();k++)
		{
			
			String suri = oddstr.get(k).charAt(0)+oddstr.get(k).substring(1)+" ";
			
			System.out.println(suri);
			
		}
		
		
		
		
		
		

	}

}
