package SWE;

import java.util.ArrayList;

public class FroehlicheZahl 
{

	public static void main(String[] args) 
	{
		for(int i=0;i<=104;i++)
			if(isHappy(i))
				System.out.println(i);
	}
	public static boolean isHappy(int n) 
	{

		ArrayList<Character> elements = new ArrayList<Character>();
		ArrayList<Integer> storage = new ArrayList<Integer>();
		int originalN = n;
		if(n == 1)
			return true;
//		System.out.println(n);
		//Auftrennen in einzelne Werte
		do
		{
			String v = Integer.toString(n);
			//Aufspalten der Zahl in einzelne Werte
			while(v.length() >0) 
			{
				elements.add(v.charAt(0));
				v = v.substring(1);
			}
			//Summen der Quadrate bilden
			int sum=0;
			for(int i=0;i<elements.size();i++)
			{
	//			System.out.println(elements.get(i));
				sum += (Integer.parseInt(String.valueOf(elements.get(i)))*Integer.parseInt(String.valueOf(elements.get(i))));
			}	
//			System.out.println(sum);
			if(sum == originalN)
				return false;
			elements.clear();
			for(int i=0;i<storage.size();i++)
			{
				if(sum == storage.get(i))
					return false;
			}
			storage.add(sum);
			n = sum;
			sum = 0;
		}
		while(n != 1);
			return true;
	}
}

/*
1, 7, 10, 13, 19, 23, 28, 31, 32, 44, 49, 68, 70, 79, 82, 86, 91, 94, 97, 100, 
103, 109, 129, 130, 133, 139, 167, 176, 188, 190, 192, 193, 203, 208, 219, 226, 
230, 236, 239, 262, 263, 280, 291, 293, 301, 302, 310, 313, 319, 320, 326, 329, 
331, 338, 356, 362, 365, 367, 368, 376, 379, 383, 386, 391, 392, 397, 404, 409, 
440, 446, 464, 469, 478, 487, 490, 496, 536, 556, 563, 565, 566, 608, 617, 622, 
623, 632, 635, 637, 638, 644, 649, 653, 655, 656, 665, 671, 673, 680, 683, 694, 
700, 709, 716, 736, 739, 748, 761, 763, 784, 790, 793, 802, 806, 818, 820, 833, 
836, 847, 860, 863, 874, 881, 888, 899, 901, 904, 907, 910, 912, 913, 921, 923, 
931, 932, 937, 940, 946, 964, 970, 973, 989, 998, 1000, 
 */

