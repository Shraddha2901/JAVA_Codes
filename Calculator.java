package pro;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter first integer");
		a=sc.nextInt();
		System.out.println("Enter second integer");
		b=sc.nextInt();
		int x;
		int var;
		do
		{
		
			System.out.println("Enter choice");
			System.out.println("1-Addition,2-Subtraction,3-Multiplication,4-Division");
			x=sc.nextInt();
		  switch(x)
		  {
		    case 1:c=a+b;
		           	System.out.println("Addition of "+a+" + "+b+" ="+c);
		           	break;
		    case 2:c=a-b;
           	       System.out.println("Subtraction of "+a+" - "+b+" = "+c);
           	       break;
		    case 3:c=a*b;
           	       System.out.println("Multiplication of "+a+" * "+b+" = "+c);
           	       break;
		    case 4:c=a/b;
           	       System.out.println("Division of "+a+" / "+b+" ="+c);
           	       break;
           	
		          
		  }
		  System.out.println("If you want to stop enter -1");
		  var=sc.nextInt();
		}while(var!=-1);
		

	}

}
