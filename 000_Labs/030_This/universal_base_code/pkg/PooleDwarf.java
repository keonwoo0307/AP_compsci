/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class PooleDwarf {
	private String name;
	private int age;

	public PooleDwarf() {		
		name = new String("");
		age = 0;
	}

	public PooleDwarf(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void setName(String nane){
		this.name = name;
	}
	
	public void setAge(String age){
		this.age = age;
	}

	public boolean isSameName(String name){
		if(name.equals(name)){
			return name;
		}
	}
}

