package pratice;

public class rotaedversion {

	public static void main(String[] args) {
		
		String s1="HelloWorldOfJava";
		
		String s2="WorldOfJavaHello";
		
		
		if(s1.length()!=s2.length())
		{
			System.out.println("s2 is not rotated version of s1");
			
		}
		
		
		
		
		
		
	String	s3=s1+s2;
	
	
	if(s3.contains(s2))
	{
		
		System.out.println("s2 is rotated version of s1");
		
	}
		
	else
	{
		
		System.out.println("s2 Not rotated version of s1");
		
	}
		
		
		
		
		

	}

}
