package pro;

import java.util.Scanner;

public class Mirrorinverse {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int p[]= {3,4,5,0,1,2};
		int count=0;
		for(int i=0;i<p.length;i++)
		{
			if(p[p[i]]==i)
			{
				count++;
			}
		}
		if(count!=0)
		{
			System.out.println("The array is mirror inverse");
		}
		else
		{
			System.out.println("The array is not mirror inverse");
		}
		
	}
	public static boolean isMirrorInverse(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[arr[i]]!=i)
			{
				return false;
			}
		}
		return true;
	}

}
