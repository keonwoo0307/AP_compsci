/*
   * Author: jacob keonwoo cho
   * Date: 12.8
   * Collaborator(s):
*/

import java.util.Scanner;

class starter {
	public static String toPigLatin(String word) {
        word = word.toLowerCase();
        String firstLetter = word.substring(0, 1);
        String restOfWord = word.substring(1);
        if ("aeiou".contains(firstLetter)) {
            return word + "way";
        }
        if (!"aeiou".contains(firstLetter)) {
            String secondLetter = word.length() > 1 ? word.substring(1, 2) : "";
            if (!"aeiou".contains(secondLetter)) {
                return word.substring(2) + word.substring(0, 2) + "ay";
            }
        }
        return restOfWord + firstLetter + "ay";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String word = scanner.nextLine();
        String pigLatin = toPigLatin(word);
        System.out.println("Pig Latin: " + pigLatin);
        scanner.close();
    }
}