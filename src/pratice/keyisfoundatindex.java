package pratice;

public class keyisfoundatindex {
	
	
	static int index(int arr[],int key)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]==key)
			{
				
				return i;
			}
			
		}
		
		return -1;
		
	}
	
	
	public static void main(String[] args)
	{
		int arr[]= {12,56,45,98};
		
		int key=45;
		
		//index(arr[],key);
		
		
		System.out.println(key+"found at index"+index(arr,key));
		
		
		
	}
	
	
	
	
	
	

}
