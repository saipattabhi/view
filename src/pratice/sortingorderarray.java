package pratice;

public class sortingorderarray {

	public static void main(String[] args) {
		
		
		int arr[]= {12,97,36,56,84,7,24};
		
		
		for(int i=0;i<arr.length;i++)
		{
			
			
			for(int j=i+1;j<arr.length;j++)
			{
				
				
				if(arr[i]>arr[j])
				{
					
					int temp=arr[j];
					
					arr[j]=arr[i];
					
					arr[i]=temp;
					
					
				}
				
				
		
			}
			
			System.out.println(arr[i]+"\t");
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
