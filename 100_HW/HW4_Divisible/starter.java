/*
 *	Author:Jacob cho
 *  Date:2024 9 26
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int A = a%2;
		int B = b%2;
		if(A==1){
			System.out.println(a + " is odd");
		}
		else if(A==0){
			System.out.println(a + " is even");
		}
		if(B==1){
			System.out.println(b + " is odd");
		}
		else if(B==0){
			System.out.println(b + " is even");
		}
		if(a%3==0){
			System.out.println(a + " is divisible by 3");
		}
		else{
			System.out.println(a + " is not divisible by 3");
		}
		if(a%4==0){
			System.out.println(a + " is divisible by 4");
		}
		else{
			System.out.println(a + " is not divisible by 4");
		}
		if(a%5==0){
			System.out.println(a + " is divisible by 5");
		}
		else{
			System.out.println(a + " is not divisible by 5");
		}
		if(b%3==0){
			System.out.println(b + " is divisible by 3");
		}
		else{
			System.out.println(b + " is not divisible by 3");
		}
		if(b%4==0){
			System.out.println(b + " is divisible by 4");
		}
		else{
			System.out.println(b + " is not divisible by 4");
		}
		if(b%5==0){
			System.out.println(b + " is divisible by 5");
		}
		else{
			System.out.println(b + " is not divisible by 5");
		}
	}
}

//- Create a program that takes in two input integers. 
//- First check if each of these integers are odd or even. Output if each are or not.
//- Then check if they're divisible by 3, 4, and 5. Make sure ALL of these are checked.
//- Otherwise if it's not divisible by all 3, 4, or 5, output that it isn't! Only if all 3!