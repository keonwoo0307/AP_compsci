/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("Your name is " + name);
		System.out.println("What is your title?");
		String title = sc.nextLine();
		System.out.println("Your title is "+ title);
		System.out.println("Choose one of three character(a Wizard, Warrior, or a Rogue)");
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
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		System.out.print("Strength (1-10):");
		int s = sc.nextInt();
		int S = 20-s;
		System.out.println("You have "+ S + " left to spend." );
		if(s>10){
			System.out.println("skill input is greater than 10");
		}
		System.out.print("Dexterity (1-10):");
		int d = sc.nextInt();
		int D = S-d;
		System.out.println("You have "+ D + " left to spend.");
		if(d>10){
			System.out.println("skill input is greater than 10");
		}
		System.out.print("Intelligence (1-10):");
		int i = sc.nextInt();
		int I = D-i;
		System.out.println("You have "+ I + " left to spend.");
		if(I>10){
			System.out.println("You have so many points left...");
		}
		if(i>10){
			System.out.println("skill input is greater than 10");
		}
		System.out.print("Charisma (1-10):");
		int c = sc.nextInt();
		System.out.println(c);
		System.out.println("--------------------------------------------------");
		System.out.println("You are " + name +", " + title +  " of CVHS.");
		System.out.println("You're a " + a  + "(1.Wizard, 2.Warrior, 3.Rogue)with the following stats!");
		System.out.println("Strength - "+ s);
		System.out.println("Dexterity - "+ d);
		System.out.println("Intelligence - "+ i);
		System.out.println("Charisma - "+ c);
		System.out.println("Good luck on your quest "+ name);
	}
}
