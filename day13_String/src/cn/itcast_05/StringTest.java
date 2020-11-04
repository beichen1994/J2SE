package cn.itcast_05;

//把一个字符串的首字母大写，其他字母小写
public class StringTest {
	public static void main(String[] args) {
		String s = "slEeP";
		
		String s1 = s.substring(0,1);
		String s2 = s.substring(1);
		
		String s3 = s1.toUpperCase();
		String s4 = s2.toLowerCase();
		
		String s5 = s3.concat(s4);
		System.out.println(s5);
		System.out.println("---------------------------------------------------");
		
		System.out.println(s.substring(0,1).toUpperCase().concat(s.substring(1).toLowerCase()));
	}
	

}
