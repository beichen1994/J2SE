package cn.itcast_01;

/**
 * 				 		Class Math
 * 		Fields:
 * 			static double	E
							The double value that is closer than any other to e, the base of the natural logarithms.
							
			static double	PI
							The double value that is closer than any other to pi, the ratio of the circumference of a circle to its diameter.
							
			
			static int	abs(int a)
						Returns the absolute value of an int value.
						
			static double ceil(double a)
						  Returns the smallest (closest to negative infinity) double value that is greater than or equal to the argument and is equal to a mathematical integer.
						  向上取整
						  
			static double  floor(double a)
						   Returns the largest (closest to positive infinity) double value that is less than or equal to the argument and is equal to a mathematical integer.
						   向下取整
						   
			static int	max(int a, int b)
						Returns the greater of two int value
						
			static int	min(int a, int b)
						Returns the smaller of two int values.
						
			static double  pow(double a, double b)
						   Returns the value of the first argument raised to the power of the second argument.
						   a的b次幂
						   
			static double  random()
					       Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
					       随机数[0.0  1.0]
					       
			static long	round(double a)
						Returns the closest long to the argument, with ties rounding to positive infinity.
						四舍五入
						
			static double sqrt(double a)
						  Returns the correctly rounded positive square root of a double value.
						  正平方根
 *
 */
public class MathDemo {
	public static void main(String[] args) {
		System.out.println("E : " + Math.E);
		System.out.println("PI : " + Math.PI);
		System.out.println("---------------------------");
		
		System.out.println("abs: " + Math.abs(10));
		System.out.println("abs: " + Math.abs(-10));
		System.out.println("-----------------------------");
		
		System.out.println("ceil: " + Math.ceil(12.34));
		System.out.println("ceil: " + Math.ceil(14.34));
		System.out.println("------------------------------");
		
		System.out.println("floor: " + Math.floor(12.34));
		System.out.println("floor: " + Math.floor(14.34));
		System.out.println("------------------------------");
		
		System.out.println("max: " + Math.max(4, 6));
		System.out.println("max: " + Math.max(Math.max(3, 5), 98));
		System.out.println("-----------------------------------------");
		
		System.out.println("pow: " + Math.pow(2, 5));
		System.out.println("--------------------------------------------");
		
		System.out.println("random: " + Math.random());
		System.out.println("random: "+ ((int)Math.random()*100 + 1));
		System.out.println("----------------------------------------------");
		
		System.out.println("round: " + Math.round(12.43));
		System.out.println("---------------------------------------");
		
		System.out.println("sqrt: " + Math.sqrt(4));
		System.out.println("---------------------------------------------");
		
	}

}
