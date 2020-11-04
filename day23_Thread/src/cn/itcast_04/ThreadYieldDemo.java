package cn.itcast_04;

public class ThreadYieldDemo {
	public static void main(String[] args) {
		ThreadYield ty1 = new ThreadYield();
		ThreadYield ty2 = new ThreadYield();
		
		ty1.setName("¡÷«‡œº");
		ty2.setName("÷‹–«≥€");
		
		ty1.start();
		ty2.start();
	}
	
}
