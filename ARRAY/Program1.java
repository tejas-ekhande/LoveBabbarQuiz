// INTERCHANGE THE ALTERNATIVE ELEMENTS IN AN ARRAY

import java.util.*;
class Solution{
	public static void function(int arr[],int n){
		int size = n;
		for(int i=0 ; i<n ; i+=2){
			if(i+1 < size){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}

		for(int i=0 ; i<n ; i++){
			System.out.print(arr[i]+" ");
		}	
	}

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of An Array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter Elements in Array : ");
		for(int i=0 ; i<n ; i++){
			arr[i] = sc.nextInt();
		}

		function(arr,n);
	}
}
