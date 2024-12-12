/*
 *	Author:  jacob keonwoo cho
 *  Date: 11.17
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Warrior[] Warr = new Warrior[100];
		Wizard[] Wiz = new Wizard[100];
		for(int i = 0; i < Warr.length; i++){
			Warr[i] = new Warrior();
		}
		for(int i = 0; i < Wiz.length; i++){
			Wiz[i] = new Wizard();
		}
		int DeadWarr = 0;
		int DeadWiz = 0;
		while (DeadWarr<100 && DeadWiz<100){
			Wiz[DeadWiz].attack(Warr[DeadWarr]);
			if(Warr[DeadWarr].isDead()){
				DeadWarr++;
			}
			if(DeadWarr>100 || DeadWiz>100){
				break;
			}
			Warr[DeadWarr].attack(Wiz[DeadWiz]);
			if(Wiz[DeadWiz].isDead()){
				DeadWiz++;
			}
			if(DeadWarr>100 || DeadWiz>100){
				break;
			}
		}
		if(DeadWiz > DeadWarr){
			System.out.println("Worrior won with "+ (100-DeadWarr));
		}
		else{
			System.out.println("Wizard won with "+ (100-DeadWiz));
		}
	}
}
