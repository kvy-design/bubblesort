import java.util.*;
class BubbleSort
{
	int j;
	int i ;
	boolean swp;
	public void bubblesort(int []a, int n)
	{
		for(i=0;i<n-1;i++)
		{
			swp=false;

			for(j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp;
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swp=true;
				}
			}
			
			if(swp==false)
			{
				break;
			}
		}
	}
	
			
		
}

class BubleDemo
{
	public static void main(String []a)
	{
		BubbleSort ob = new BubbleSort();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of an arr :");
		int l = s.nextInt();
		int []arr = new int[l];
		System.out.println("Enter the values of an array :");
		for(int i=0;i<l;i++)
		{
			 arr[i]=s.nextInt(); 
		}
		ob.bubblesort(arr,l);
		System.out.println("sorted arr ");
		for(int a1 : arr)
		{
			System.out.println(a1);
		}
		s.close();
	}
}