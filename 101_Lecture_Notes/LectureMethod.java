/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        greeting("hideto");
        double num = raise(100, 15);
        num = raise(num, 15);
        num = raise(num, 15);
        num = raise(num, 15);
        num = raise(num, 15);
        num = raise(num, 15);
        num = raise(num, 15);
        num = raise(num, 15);
        num = raise(num, 15);
        System.out.println(num);
	}
	public static void printAnimal() {
	    System.out.println("    |\\__/,|   (`\\");
	    System.out.println("  _.|o o  |_   ) )");
	    System.out.println("-(((---(((--------");
	}
	public static void greeting(String name) {
	    System.out.println("Howdy"+ name);
	}
	public static double raise(double salary, int percent) {
	    double amount = salary + (salary * (percent/100.0));
	    return amount;
	}
}