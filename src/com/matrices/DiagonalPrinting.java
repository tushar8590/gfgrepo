package com.matrices;

import java.util.Scanner;

public class DiagonalPrinting {

	public static void main(String[] args) {
		int i, j;
		System.out.println("Enter total rows and columns: ");
		Scanner s = new Scanner(System.in);
		int row = 3;
		int column = 3;
		int array[][] =   {{1, 2, 3},
		        		  {4, 5, 6},
		        		  {7 ,8, 9} };
		/*System.out.println("Enter matrix:");
	 	for(i = 0; i < row; i++)
	  	{
	   	    for(j = 0; j < column; j++)
	     	    {
	        	array[i][j] = s.nextInt();
	        	System.out.print(" ");
	            }
	  	}*/
		System.out.println("The above matrix  is ");
	  	for(i = 0; i < row; i++)
	    	{
	      	    for(j = 0; j < column; j++)
	            {
	          	System.out.print(array[i][j]+" ");
	            }
	            System.out.println(" ");
	        }

	  	// printing it diagonally
	  	i = 0; j= 0;
	  		for(int k = 0; k< row; k++){
	  			System.out.print(array[k][0]+" ");
	  			i = k - 1; j = 1;
	  			while(isValid(i, j, row, column)){
	  				System.out.print(array[i][j] + " ");
	  				i--; j++;
	  			}
	  			System.out.println(" ");
	  		}

	 		for(int k = 1; k < column; k++){
	  			System.out.print(array[row - 1][k]+" ");
	  			i = row -2; j = k + 1 ;
	  			while(isValid(i, j, row, column)){
	  				System.out.print(array[i][j] + " ");
	  				i--; j++;
	  			}
	  			System.out.println(" ");
	  		}
	}

	static boolean isValid(int i,int j, int row, int col){
		if(i<0 || i>= row || j<0 || j>= col)
			 return false;
		return true;
	}
}
