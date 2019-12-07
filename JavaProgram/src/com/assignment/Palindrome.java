package com.assignment;

public class Palindrome {

	public static void main(String[] args) {
//      String str1 = "Nitin";
//      String res = reverse( str);
      System.out.println(isPalindrome("Nitin"));
      
	}
	static boolean isPalindrome(String s) {
		int j=s.length() , i;
		s = s.toLowerCase();
		for( i = 1 ; i<j ; i++)
			
		{
			for( j = s.length() ; j<=s.length() ; j--)
			{
			if(s.charAt(i)!=s.charAt(j))
				return false;
			}
		}
		return true;
	}

}
