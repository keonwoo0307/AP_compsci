/*
 *	Author:j.c
 *  Date:10 27
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dog Dog1 =new Dog("doggie");
        Dog1.setAge(5);
        Dog Dog2 =new Dog("duuuugie");
        if(Dog1.isSleeping()) {
            System.out.println(Dog1.getName()+ "is asleep.");
        } 
        else{
            Dog1.bark();
            if(Dog2.isSleeping()) {
                Dog2.bark();
            } 
            else{
                Dog2.bark();
            }
        }
	}
}
