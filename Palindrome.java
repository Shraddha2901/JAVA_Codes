package pro;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter string");
		str=sc.nextLine();
		String reverse="";
		int i=0;
		int strlen=str.length();
		for(i=(strlen-1);i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		if(str.toLowerCase().equals(reverse.toLowerCase()))
		{
			System.out.println(str+" is palindrome");
		}
		else
		{
			System.out.println(str+" is not paindrome");
		}
	}

}
