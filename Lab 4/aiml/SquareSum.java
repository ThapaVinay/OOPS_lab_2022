package com.aiml;
import java.util.Scanner;
public class SquareSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int sum =0;
		System.out.println("Enter the array :");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
			sum = sum + (arr[i]*arr[i]);
		}
		sc.close();
		System.out.println("The sum is :" + sum);	
	}
}
