package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	int age;
	String breed;
	public Dog(String name){
		String dogName = name;
        int dogAge = 1;
        String dogBreed = "dog dog";
        name = dogName;
        age = dogAge;
        breed = dogBreed;
	}
	public String setName(String name){
        return name;
    }
    public int setAge(int age){
        return age;
    }
    public String setBreed(String breed){
        return breed;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getBreed(){
        return breed;
    }
    public boolean isSleeping(){
        Random random = new Random();
        return random.nextBoolean();
    }
    public void bark(){
        System.out.println(name+"barks!");
    }
}
