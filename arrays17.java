public class arrays17 {

	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5,6,7,8,};
		int low=0,high=a.length-1;
		int search = 4;
		int mid=0;
		int temp=0;
		
		while(low<=high) 
		{
			mid=(low+high)/2;
			if(a[mid]==search) 
			{
				System.out.println("found at "+mid);
				temp=1;
				break;
			}
			else if(a[mid]<search) 
			{
				low = mid+1;
			}
			else if(a[mid]>search) 
			{
				high=mid-1;
			}
		}
		if(temp==0) 
		{
			System.out.println(" not found ");
	
		}
		for(int j=3;j<a.length-1;j++) 
		{
			a[j]=a[j+1];
			
		}
		
	   
		for(int var: a) 
		{
			System.out.println(var);
		}
		

	}

}
