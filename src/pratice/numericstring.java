package pratice;

public class numericstring {

	public static void main(String[] args) {
		
		
		String str="F67HJB7";
		
		int value=0;
		
		
		for(char c: str.toCharArray())
		{
			
			if(Character.isDigit(c))
			{
				
			value+=Character.getNumericValue(c);
				
			}
			
			
		}
		
		
		System.out.println(value);
		
		
		

	}

}
