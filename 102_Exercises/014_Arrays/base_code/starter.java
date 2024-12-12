/*
 *	Author: jacob cho
 *  Date: 11.5.2024
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr1 = new int[1001];
		 int i = 0;
		 int t = 3;
		 while(i<1001){
		 	arr1[i] = t;
		 	t = t + 3;
		 	System.out.println(arr1[i]);
		 	i++;
		 }
		 int [] arr2 = new int[1001];
		 int e = 0;
		 int l = 1000;
		 while(e<1001){
		 	arr2[e] = l;
		 	l = l - 1;
		 	System.out.println(arr2[e]);
		 	e++;
		 }
	}
}
