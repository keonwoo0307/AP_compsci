/*
 *	Author: jacob cho
 *  Date: 2023 10 10
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		 public static int pow(int x, int y) {
        	if(y==0){
            	return 1;
        	}
        	if(y<0){
            	return 0;
        	}
        	return x*pow(x,y-1);
    	}
    }