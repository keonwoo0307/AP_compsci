/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose number(a Wizard, Warrior, or a Rogue)");
		System.out.println("1.Wizard");
		System.out.println("2.Warrior");
		System.out.println("3.Rogue");
		int a = sc.nextInt();
		if(a==1){
			System.out.println("You are a Wizard");
		}
		else if(a==2){
			System.out.println("You are Warrior");
		}
		else if(a==3){
			System.out.println("You are a Rogue");
		}
		else{
			System.out.println("You cant be "+ a );
		}
	}
}
