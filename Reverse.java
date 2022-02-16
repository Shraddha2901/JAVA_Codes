package pro;

import java.util.Scanner;

public class Reverse {
      public static void main(String args[])
      {
    	  Scanner sc=new Scanner(System.in);
    	  String str;
    	  System.out.println("Enter string");
    	  str=sc.nextLine();
    	  char arr[]=str.toCharArray();
    	  System.out.println("Reverse string of "+str+" is");
    	  for(int i=(str.length()-1);i>=0;i--)
    	  {
    		  System.out.print(arr[i]);
    	  }
      }
}
