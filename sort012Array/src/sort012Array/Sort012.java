package sort012Array;

import java.util.Scanner;

public class Sort012 {
	
	public static void sorting012(int arr[], int size) {
		int low = 0;
		int hi = size-1;
		int mid = 0;
		while(mid<hi) {
			if(arr[mid]==0) {
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				mid++;
				low++;
			}	
			else if(arr[mid]==1) {
				mid++;
			}
			else {
				int temp = arr[mid];
				arr[mid] = arr[hi];
				arr[hi] = temp;
				hi--;
			}
		}
		System.out.println("sorted array is");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int arr[] =new int[size];
		System.out.println("enter each element(0,1,2) of array and press enter");
		for(int i=0; i<size; i++) {
			arr[i] =sc.nextInt();
		}
		boolean b = true;
		for(int i=0; i<size; i++) {
			if(arr[i]!=0 && arr[i]!=1 && arr[i]!=2) {
				b = false;
				System.out.println("value entered is other than (0,1,2)");
				break;
			}
		}
		if(b!=false) {
			System.out.println("provided array");
			for(int i=0; i<size; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			Sort012.sorting012(arr,size);
		}
		sc.close();
	}
}
