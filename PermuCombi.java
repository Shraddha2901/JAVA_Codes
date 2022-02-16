package pro;

import java.util.Scanner;

public class PermuCombi {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,r;
		System.out.println("Enter value of n");
		n=sc.nextInt();
		System.out.println("Enter value of r");
		r=sc.nextInt();
		System.out.println("Combination  is "+(fact(n)/(fact(n-r)*fact(r))));
		System.out.println("Permutation is "+(fact(n)/(fact(n-r))));
		
	}
	public static int fact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

}
