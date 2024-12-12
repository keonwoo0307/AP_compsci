/*
 *	Author:  jacob keonwoo cho
 *  Date: 12.7
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String sentence = sc.nextLine();
        String input = sc.nextLine();
		String result = "";
		while(true){
			if(input.indexOf(" ") == -1){
				result = input + " " + result;
				break;
			}
		int space = input.indexOf(" ");
		String word = input.substring(0,space);
		result = word + " " + result;
		input = input.substring(space+1);
		}
		System.out.println(result);
	}
}
