/*
 *	Author: jacob cho
 *  Date:2024 10 06
 * 	Collaborator(s): n/a
*/

import java.util.Scanner;
import java.util.Random;
class starter {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int a = 100;
		System.out.println("it's jacobs slot machine"); 
		while (a>0){
			System.out.println("you $100");
			int b = scanner.nextInt();
			while (b <= 0 || b > a){
				System.out.println("please enter between 1 and 100");
				b = scanner.nextInt();
			}
			int num1 = random.nextInt(10);
			int num2 = random.nextInt(10);
			int num3 = random.nextInt(10);
			System.out.println("numbers are " + num1 + num2 + num3);
			 if (num1 == num2 && num2 == num3){
                System.out.println("JACKPOT"+ (b * 3));
                a += b * 3;
            }
            else if (num1 == num2 || num1 == num3 || num2 == num3) {
                System.out.println("You win $" + (b * 2));
                a += b * 2;
            } 
            else {
                System.out.println("You lose $" + b);
                a -= b;
            }
            if (a > 0) {
                System.out.println("play one more time? y/n");
                String c = scanner.next();
                if (c=="n") {
                    break;
                }
            }
        }
		}
	}

