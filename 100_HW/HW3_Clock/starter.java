/*
 *	Author:jacob cho
 *  Date:9 22 2024
 *	Collaborator(s): n/a
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the day");
		System.out.println("0 Sun");
		System.out.println("1 Mon");
		System.out.println("2 Tue");
		System.out.println("3 Wed");
		System.out.println("4 Thu");
		System.out.println("5 Fri");
		System.out.println("6 Sat");
		int a = sc.nextInt();
		if(a==0){
			System.out.println("wake up at 10:00am");
		}
		else if(a==1){
			System.out.println("wake up at 7:00am");
		}
		else if(a==2){
			System.out.println("wake up at 7:00am");
		}
		else if(a==3){
			System.out.println("wake up at 7:00am");
		}
		else if(a==4){
			System.out.println("wake up at 7:00am");
		}
		else if(a==5){
			System.out.println("wake up at 7:00am");
		}
		else if(a==6){
			System.out.println("wake up at 10:00am");
		}
	}
}
