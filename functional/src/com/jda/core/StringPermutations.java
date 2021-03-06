package com.jda.core;
import java.util.ArrayList;
import com.jda.utility.FunctionalUtility;
public class StringPermutations
{
	static ArrayList<String> recursiveString = new ArrayList<String>();
	public static String swap(String str, int strtPos ,int endPos)
	{
	char[] ch =str.toCharArray();
     char tmp=ch[strtPos];
	 ch[strtPos]=ch[endPos];
	 ch[endPos]=tmp;
	 return String.valueOf(ch);
	}
	public static void recursivePermutation(String tmpString , int strt, int len)
	{
	if(strt==len)
	{
		recursiveString.add(tmpString);
		return;
	}
	for(int i=strt;i<len;i++)
	{
	tmpString = swap(tmpString,i,strt);
	recursivePermutation(tmpString,strt+1,len);
	tmpString= swap(tmpString,i,strt);
	}
	}
	public static ArrayList<String> recursive(String tmpString , int strt, int len)
	{
	  recursivePermutation(tmpString , strt , len);	
	  return recursiveString;
	}
	public static void main(String[] args)
	{
	 System.out.println("Enter the String ");
	 String originalString = FunctionalUtility.getString();
	 int len = originalString.length(), totPermutation=1;
	 recursive(originalString , 0 , len);
	 for(int i=2 ; i<=len ;i++)
     totPermutation*=i;
	 System.out.println("Permutation string of "+ originalString + " is " + totPermutation);
	 for(int i=0; i<recursiveString.size();i++)
	System.out.println(recursiveString.get(i));
	}
}