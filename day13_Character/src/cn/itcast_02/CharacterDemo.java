package cn.itcast_02;

/**
 * 				Class Character
 * 		static boolean	isUpperCase(char ch)
						Determines if the specified character is an uppercase character.
						
		static boolean	isLowerCase(char ch)
						Determines if the specified character is a lowercase character.
 *
 *		static boolean	isDigit(char ch)
						Determines if the specified character is a digit.
						
		static char	toUpperCase(char ch)
					Converts the character argument to uppercase using case mapping information from the UnicodeData file
					
		static char	toLowerCase(char ch)
					Converts the character argument to lowercase using case mapping information from the UnicodeData file.
 */
public class CharacterDemo {
	public static void main(String[] args) {
		System.out.println("isUpperCase : " + Character.isUpperCase('A'));
		System.out.println("isUpperCase	: " + Character.isUpperCase('a'));
		System.out.println("isUpperCase : " + Character.isUpperCase('0'));
		System.out.println("-------------------------------------------------");
		
		System.out.println("isLowerCase : " + Character.isLowerCase('A'));
		System.out.println("isLowerCase	: " + Character.isLowerCase('a'));
		System.out.println("isLowerCase : " + Character.isLowerCase('0'));
		System.out.println("-------------------------------------------------");
		
		System.out.println("isDigit : " + Character.isDigit('A'));
		System.out.println("isDigit	: " + Character.isDigit('a'));
		System.out.println("isDigit : " + Character.isDigit('0'));
		System.out.println("-------------------------------------------------");
		
		System.out.println("toUpperCase : " + Character.toUpperCase('A'));
		System.out.println("toUpperCase : " + Character.toUpperCase('a'));
		System.out.println("-------------------------------------------------");
		
		System.out.println("toLowerCase : " + Character.toLowerCase('A'));
		System.out.println("toLowerCase : " + Character.toLowerCase('a'));
		System.out.println("---------------------------------------------------");
	}

}
