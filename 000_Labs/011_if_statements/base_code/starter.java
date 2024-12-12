/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose one of the following destinations");
		System.out.println("1. KOREA");
		System.out.println("2. JAPAN");
		System.out.println("3. CHINA");
		int a = sc.nextInt();
		if(a==1){
			System.out.println("Ok lets go to KOREA");
		}
		else if(a==2){
			System.out.println("Ok lets go to JAPAN");
		}
		else if(a==3){
			System.out.println("Ok lets go to CHINA");
		}
		else{
			System.out.println("HELL NO we cant go there...");
		}
	}
}