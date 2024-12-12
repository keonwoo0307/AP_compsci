/*
	Author jacob keonwoo cho
	Date: 12.05
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter: ");
		String sentence = sc.nextLine();
		
		while(true){
			if(sentence.indexOf(" ") == -1){
				System.out.print(spongeCase(sentence) + " ");
				break;
			}
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0, space);
			System.out.println(spongeCase(word) + " ");
		}
		
		String word = sc.nextLine();
		String result = "";
		for(int i = 0; i < word.length(); i++){
			String letter = word.substring(i, i+1);
			if(i % 2 == 0){
				letter = letter.toLowerCase();
			}
			else{
				letter = letter.toUpperCase();
			}
			result = result + letter;
		}
	}
	public static String spongeCase(String word){
		String result = "";
		for(int i = 0; i < word.length(); i++){
			String letter = word.substring(i, i+1);
			if(i % 2 == 0){
				letter = letter.toLowerCase();
			}
			else{
				letter = letter.toUpperCase();
			}
			result = result + letter;
		}
		return result;
	}
}
/* word = word.toUpperCase();
		System.out.print(word);
		int alp = word.length()-1;
		int a = 1;
		while(alp > 1){
			if(a % 2 == 0){
				String x = word.substring(a,a+2);
				x = x.toLowerCase();
				alp = alp-1;
				a = a + 1;
			}
			else{
				String x = word.substring(a,a+2);
				x = x.toLowerCase();
				alp = alp-1;
				a = a + 1;
			}
		} 
		String upper = word.toUpperCase();
		String lower = word.toLowerCase();
		String newword = new String("");
		
		*/