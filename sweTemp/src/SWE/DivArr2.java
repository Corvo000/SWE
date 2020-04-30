package SWE;

public class DivArr2 
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
		if(arr == null || arr.length <= 1) 
			return false;
		int tmp =0;
		int sum =0;
		for(int i=0;i<arr.length;i++) 
		{
			sum += arr[i];
		}
		for(int i=0;i<arr.length;i++) 
		{
			tmp += arr[i];
			if(tmp == sum/2)
				return true;
		}
		return false;
	} 
}
