package cn.itcast_05;
/**
 * 				自动装箱：把基本类型转换为包装类类型
 * 				自动拆箱：把包装类类型转换为基本类型
 * 
 * 			
 *
 */

public class IntegerDemo {
	public static void main(String[] args) {
		
			Integer ii = 100;    //自动装箱  Integer ii = Integer.valueOf(200);
			ii += 200;		     //自动拆箱 ，再自动装箱 ii = Integer.valueOf(ii.valueOf() + 200);
			System.out.println("ii : " + ii);	//System.out.println(new StringBulider("ii :").append(ii).toString );
			
			
	}
}
