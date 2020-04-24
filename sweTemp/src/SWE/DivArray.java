package SWE;

public class DivArray 
{

	public static void main(String[] args) 
	{
		int arr1[]= {1,1,-1,2};
		int arr2[]= {21,21,0,1,-1,42};
		int arr3[]= {21,-42,21,0};
		int arr4[]= {21,-42,0,21};
		System.out.println(canDivideArray(arr1));
		System.out.println(canDivideArray(arr2));
		System.out.println(canDivideArray(arr3));
		System.out.println(canDivideArray(arr4));
	}
	public static boolean canDivideArray(int [] arr) 
	{
		int sumL=0;
		int sumR=0;
		if(arr.length == 0 && arr.length%2 != 0)
		{
			
			return false;
		}
		else 
		{
			for(int i=0;i<arr.length;i++) 
			{
				if(i<(arr.length/2))
					sumL += arr[i]; 
				else
					sumR += arr[i];	
			}
			System.out.println(sumL + " " + sumR);
			if(sumL < 0)
				sumL += 1;
			if(sumR == sumL)
				return true;
			else
				return false;
		}
	} 
}
