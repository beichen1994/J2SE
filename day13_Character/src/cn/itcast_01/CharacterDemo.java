package cn.itcast_01;

/**
 * 					Class Character
 * 			Character(char value)
			Constructs a newly allocated Character object that represents the specified char value.
			
			
 *
 */
public class CharacterDemo {
	public static void main(String[] args) {
		Character ch = new Character((char)97);
		System.out.println("ch: " + ch);
		
		Character ch2 = new Character('a');
		System.out.println("ch2: " + ch2);
	}

}
