package cn.itcast_02;

import java.util.Scanner;

/**
 * 			Class Scanner
 * 		boolean	hasNextInt()
				Returns true if the next token in this scanner's input can be interpreted as an int value in the default radix using the nextInt() method.
			
		boolean	hasNextByte()
				Returns true if the next token in this scanner's input can be interpreted as a byte value in the default radix using the nextByte() method.
				
		boolean	hasNextLine()
				Returns true if there is another line in the input of this scanner.
				
			int	nextInt()
				Scans the next token of the input as an int.
			
			byte nextByte()
				 Scans the next token of the input as a byte.
			
			String	nextLine()
					Advances this scanner past the current line and returns the input that was skipped.
 *
 */
public class ScannerDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt()){
			int x = sc.nextInt();
			System.out.println("x:" + x);
		}else{
			System.out.println("您输入的数据有误");
		}
		
	}

}
