package pratice;

public class duplicatesstringarray {

	public static void main(String[] args) {
		
		String [] str= {"sai","babu","sai","amma"};
		
		
		for(int i=0;i<str.length;i++)
		{
			
			for(int j=i+1;j<str.length;j++)
			{
				
				
				if(str[i]==str[j])
				{
					
					System.out.print(str[i]);
					
				}
			}
			
			
		}
		
		
		
		
		

	}

}
