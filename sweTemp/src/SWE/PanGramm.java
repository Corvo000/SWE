package SWE;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class PanGramm 
{
	public static void main(String []args) 
	{
		System.out.println(isAPanGramm("Hallo"));
		System.out.println(isAPanGramm("abcdefghijklmnopqrstuvwxy"));
		System.out.println(isAPanGramm("abcdefghijklmnopqrstuvwxyz"));
	}
	public static boolean isAPanGramm(String v) 
	{
		if(v==null)
			return false;
		v = v.toUpperCase();
		Stream<Character> alphaFilter = v.chars().filter(x -> (x >= 'A' && x <= 'Z')).mapToObj(c -> (char) c);	
		Map<Character,Boolean>alphaMap = alphaFilter.collect(Collectors.toMap(x -> x, y -> Boolean.TRUE,(p1,p2)-> p1));
		return alphaMap.size() == 26;
	}
}
