package SWE;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class PanGramm 
{
	public static void main(String []args) 
	{
		System.out.println(isAPanGrammByStream("Hallo"));
		System.out.println(isAPanGrammByStream("abcdefghijklmnopqrstuvwxy"));
		System.out.println(isAPanGrammByStream("abcdefghijklmnopqrstuvwxyz"));
		System.out.println();
		System.out.println(isAPanGramm("Hallo"));
		System.out.println(isAPanGramm("abcdefghijklmnopqrstuvwxy"));
		System.out.println(isAPanGramm("abcdefghijklmnopqrstuvwxyz"));
	}
	public static boolean isAPanGrammByStream(String v) 
	{
		if(v==null)
			return false;
		v = v.toUpperCase();
		Stream<Character> alphaFilter = v.chars().filter(x -> (x >= 'A' && x <= 'Z')).mapToObj(c -> (char) c);	
		Map<Character,Boolean>alphaMap = alphaFilter.collect(Collectors.toMap(x -> x, y -> Boolean.TRUE,(p1,p2)-> p1));
		return alphaMap.size() == 26;
	}
	public static boolean isAPanGramm(String v) 
	{
		if(v == null)
			return false;
		v = v.toUpperCase();
		boolean [] alpha = new boolean[26];
		int index = 0;
		for(int i=0;i<v.length();i++) 
		{
			if(v.charAt(i) >= 'A' && v.charAt(i) <= 'Z')
				index = v.charAt(i) - 'A';
			alpha[index] = true;	
		}
		for(int i=0;i<26;i++) 
		{
			if(!alpha[i])
				return false;
		}
		return true;
	}
}

