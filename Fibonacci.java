package pro;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int i=0,n;
        System.out.println("Enter a number to get fibonacci series upto nth term");
        n=sc.nextInt();
        int a=0,b=1;
        System.out.println("Fibonacci series upto "+n+" is :-");
        while(i<=n)
        {
        	System.out.print(i+" ");
        	a=b;
        	b=i;
        	i=a+b;
        }
        
	}

}
