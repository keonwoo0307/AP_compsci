/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("give 2 int variables");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a == b){
			System.out.println("equal");
		}
		else{
			System.out.println("different");
		}
	}
}
