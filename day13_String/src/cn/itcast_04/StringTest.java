package cn.itcast_04;

public class StringTest {
		public static void main(String[] args) {
			
			String s = "HelloWorld987";
			
			int SmallCount = 0;
			int BigCount = 0;
			int NumCount = 0;
			
			for(int i = 0 ; i < s.length(); i++){
				char ch = s.charAt(i);
				if(ch >= 'a' && ch <='z'){
					SmallCount++;
				}else if( ch >= 'A' && ch <= 'Z'){
					BigCount++;
				}else if(ch >= '0' && ch <= '9'){
					NumCount++;
				}
			}
			
			System.out.println("大写字母个数：" + BigCount);
			System.out.println("小写字母个数：" + SmallCount);
			System.out.println("数字个数：" + NumCount);
		}
}
