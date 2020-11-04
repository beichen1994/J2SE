package cn.itcast_08;

/**
 *  		 Class Scanner 
 *  	Scanner(String source)
		Constructs a new Scanner that produces values scanned from the specified string.
 	
 	int	nextInt()
  		Scans the next token of the input as an int.
 */
import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ���ɼ�");
		int score = sc.nextInt();
		
		Teacher t = new Teacher();
		try {
			t.check(score);
		} catch (MyException e) {
			
			e.printStackTrace();
		}
	}

}
