/*
 *	Author: jacob cho
 *  Date: 10 13 2024
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int number) {
        if (number<2){
        	return false;
        }
        int a=2;
        while (a*a<=number){ 
            if (number%a==0){
                return false;
            }
            a++;
        }
        return true;
    }

    public static void printPrimes(int max) {
        int num=2;
        while(num<max){
            if(checkPrime(num)){
                System.out.println(num);
            }
            num++;
        }
    }
}
