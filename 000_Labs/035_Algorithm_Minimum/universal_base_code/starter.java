/*
 *	Author:  jacob cho
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]){
		Random rand = new Random();
        int arraySize = rand.nextInt(150)+51;
        int[] randomArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            randomArray[i] = rand.nextInt(100) + 1;
        }
        int minValue = randomArray[0];
		for (int num : randomArray){
    		if (num < minValue){
        		minValue = num;
    		}
		}
		int maxValue = randomArray[0];
		for (int num : randomArray){
    		if (num > maxValue){
    		    maxValue = num;
    		}
		}
		double sum=0;
		for (int num : randomArray){
		    sum += num;
		}
		double averageValue = sum/arraySize;
        System.out.println("element num: "+ arraySize);
        System.out.println("minimum: "+ minValue);
        System.out.println("maximum: "+ maxValue);
        System.out.println("average: "+ averageValue);
    }
}
