package pratice;

public class noofwordsinstring {

	public static void main(String[] args) {
	
		
		String str="sai pattabhi ramayya";
		
		int count=0;
		
		String split[]=str.split(" ");
		
		
		for(int i=0;i<split.length;i++)
		{
			
			count++;
			
		}
		
		System.out.println(count);
		

	}

}
