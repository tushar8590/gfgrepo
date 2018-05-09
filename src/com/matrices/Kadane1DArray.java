package com.matrices;

import java.util.Scanner;

public class Kadane1DArray {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
	        int N = s.nextInt();

	        
	        int arr[]  = new int[N];
	        for (int i = 0; i < N; i++) {
	            arr[i] = s.nextInt();
	        }
	        System.out.println(kadane(arr, N));
	}

	private static int kadane(int a[],int n){
		int curr_max = a[0];
		int max_so_far = a[0];
		for(int i = 0;i<n;i++){
			curr_max = max(a[i],curr_max + a[i]);
			max_so_far = max(curr_max,max_so_far);
		}
		return max_so_far;
		
	}
	private static int max(int a , int b){
		if(a > b)
			return a;
		else 
			return b;
	}
}
