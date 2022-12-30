package pratice;

public class altenativeswapreverse {

	public static void main(String[] args) {


		String[] str="sai pattabhi".split("\\s+");
		
		String rev="";
		
		
		for(int i=str.length-1;i>=0;i--)
		{
			
			rev+=str[i];
			
			
		}
		
		
		System.out.println(rev);

	}

}
