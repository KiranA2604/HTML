import java.util.Arrays;
import java.util.Scanner;

public class arrays14 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter elements");
		int a[]= new int[11];
		for(int j=0;j<a.length-1;j++)
		{
			a[j]=sc.nextInt();
		}
	
		int index=5,element=67;
		for(int i=a.length-1;i>index;i--) 
		{
			a[i]=a[i-1];
		}
		
		a[index]=element;
		for(int var: a) 
		{
			System.out.println(var);
		}
		
		}
	

}
