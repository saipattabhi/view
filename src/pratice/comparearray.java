package pratice;

public class comparearray {

	public static void main(String[] args) {
		
		int a1[]= {1,2,3,4,5};
		
		int a2[]= {1,2,3,4,5,6,8};
		
		boolean status=true;
		
		if(a1.length==a2.length)
		{
			
			for(int i=0;i<a1.length;i++)
			{
				
				
				if(a1[i]!=a2[i])
				{
					
					status=false;
					
				}
			}
			
			
		}
		
		else
		{
			
			status=false;
		}
		
		
		if(status)
		{
			
			System.out.println("Equal");
		}
		
		else
		{
			System.out.println("Not Equal");
			
		}
		

	}

}
