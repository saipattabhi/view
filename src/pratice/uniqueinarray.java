package pratice;

public class uniqueinarray {

	public static void main(String[] args) {
		
		
		int arr[]= {1,2,2,3,4,5};
		
		
		int flag;
		
		
		for(int i=0;i<arr.length;i++)
		{
			
			flag=0;
			
			for(int j=i+1;j<arr.length;j++)
			{
				
				
				if(arr[i]==arr[j])
				{
					
					flag=1;
					
				}
				
			}
			
			if(flag==0)
			{
				
				System.out.print(arr[i]);
				
			}
			
		}
		
		
		
		
		

	}

}
