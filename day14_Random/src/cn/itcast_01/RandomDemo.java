package cn.itcast_01;

import java.util.Random;

/**
 * 				Class Random
 * 			Random()
			Creates a new random number generator.
			
			Random(long seed)
			Creates a new random number generator using a single long seed.
			�������Ӻ�ÿ�ε����������ͬ
 			
 			int	nextInt()
				Returns the next pseudorandom, uniformly distributed int value from this random number generator's sequence.
				����  int ��Χ�ڵ������
			int	nextInt(int bound)
				Returns a pseudorandom, uniformly distributed int value between 0 (inclusive) and the specified value (exclusive), drawn from this random number generator's sequence.
				���� [0 , bound] ��Χ�ڵ������
 */			


public class RandomDemo {
	public static void main(String[] args) {
		Random r = new Random();
		
		for(int i = 0; i < 10; i++){
			int num = r.nextInt();
			System.out.println(num);
			
		}
		System.out.println("---------------------");
		for(int i2 =0; i2 < 10; i2++){
			int num2 = r.nextInt(100)+1;
			System.out.println(num2);
		}
	
	}

}
