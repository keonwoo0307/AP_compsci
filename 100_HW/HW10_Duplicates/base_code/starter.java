/*
 *	Author: jacob cho
 *  Date: 1111
 * 	Collaborator(s): 
*/

import java.util.*;
import java.util.Random;

class starter {
	public static void main(String args[]){
        Random rand = new Random();
        int[] array = new int[20];
        for(int i=0;i < array.length;i++){
            array[i] = rand.nextInt(10)+1;
        }
        int targetNumber = rand.nextInt(10) + 1;
        System.out.print("array: ");
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println(   );
        System.out.println("target num: " + targetNumber);
        int duplicateCount = 0;
        System.out.println("duplicate: ");
        for(int i = 0; i < array.length; i++){
            if (array[i] == targetNumber){
                System.out.print(i + " ");
                duplicateCount++;
            }
        }
        System.out.println("num: " + duplicateCount);
        for(int i=0; i < array.length-1;i++){
            if(array[i] == array[i + 1]){
                System.out.println("duplicate : " +i+"and " + (i + 1) + "value: "+ array[i]);
            }
        }
    }
}