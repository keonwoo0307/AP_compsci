/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
    	String role;
    	int strength;
    	int dexterity;
    	int intelligence;
    	int charisma;
    public myCharacter(String role, int strength, int dexterity, int intelligence, int charisma) {
        this.role= role;
        this.strength = strength;
        this.dexterity= dexterity;
        this.intelligence= intelligence;
    	this.charisma= charisma;
    }
	public void myToString() {
        System.out.println("your role is " + role);
        System.out.println("your strength is " + strength);
        System.out.println("your dexterity is " + dexterity);
        System.out.println("your intelligence is " + intelligence);
        System.out.println("your charisma is " + charisma);
    }
	}
}

