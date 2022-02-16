package pro;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
      int mat[][]=new int[10][10];
      int transe[][]=new int[10][10];
      int i,j,row,col;
      System.out.println("Enter number of row and column");
      row=sc.nextInt();
      col=sc.nextInt();
      System.out.println("Enter elements of matrix");
      for(i=0;i<row;i++)
      {
    	  for(j=0;j<col;j++)
    	  {
    		  mat[i][j]=sc.nextInt();
    	  }
      }
      System.out.println("The above matrix before transpose");
      for(i=0;i<row;i++)
      {
    	  for(j=0;j<col;j++)
    	  {
    		 System.out.print(mat[i][j]+" ");
    	  }
    	  System.out.println();
      }
      System.out.println("The above matrix after transpose");
      for(i=0;i<col;i++)
      {
    	  for(j=0;j<row;j++)
    	  {
    		 System.out.print(mat[j][i]+" ");
    	  }
    	  System.out.println();
      }

	}

}
