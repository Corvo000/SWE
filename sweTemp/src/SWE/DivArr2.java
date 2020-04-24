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
		int sum = _getSum(arr);
		if(sum%2 != 0)
			return false;
		int middle = _getPos(sum,arr); 
		return _erg(sum,middle,arr);
	}
	public static int _getSum(int [] arr) 
	{
		int n=0;
		for(int i=0;i<arr.length;i++)
			n += arr[i];
		return n;
	}
	public static boolean _erg(int sum ,int mid, int [] arr) 
	{
		for(int i = mid + 1 ;i<arr.length;i++)
			sum += arr[i];
		return (sum == sum/2);
	}
	public static int _getPos(int sum, int [] arr) 
	{
		int middle=0;
		for(int i=0;i<arr.length-1;i++) 
		{
			middle += arr[i];
			if(sum/2 == middle)
				return i;
		}
		return 0;
	}
}
