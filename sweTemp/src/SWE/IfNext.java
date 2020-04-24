package SWE;
public class IfNext 
{

	public static void main(String[] args) 
	{
		int n = 24;
		skipIfNine(n);
		n = 28;
		skipIfNine(n);
		n = 35;
		skipIfNine(n);
		n = 36;
		skipIfNine(n);
		n = 78;
		skipIfNine(n);
		n = 8;
		skipIfNine(n);
	}
	public static void skipIfNine(int n) 
	{
		n+=1;
		if(n%9 == 0 || hasNine(n))
			System.out.println(n + " wird uebersprungen.");
		else
			System.out.println(n + " wird nicht uebersprungen.");
	}
	public static boolean hasNine(int n) 
	{
		String v = Integer.toString(n);
		return v.contains("9");
	}
}
