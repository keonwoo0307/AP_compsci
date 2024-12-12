/*
 *	Author: jacob cho
 *  Date: 10 04 2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new
		Scanner(System.in);
		int guess = (int)((Math.random()*1000)+1);
		while(true){
			System.out.println("Guess a number between 1 - 1000");
			int num = sc.nextInt();
			if(guess < num){
				System.out.println("The number is too high. Try again");
			}
			else if(guess > num){
				System.out.println("The number is too low. Try again");
			}
			else{
				System.out.println("Correct!");
			}
			break;
			}
		}
	}
