package SWE;
public class IfNext 
{

	public static void main(String[] args) 
	{
		for(int i=0;i<51;i++)
			if(!skipIfNine(i))
				System.out.println(i+1);
	}
	public static boolean skipIfNine(int n) 
	{
		n+=1;
		if(n%9 == 0 || hasNine(n))
			return true;
		else
			return false;
	}
	public static boolean hasNine(int n) 
	{
		String v = Integer.toString(n);
		return v.contains("9");
	}
}
