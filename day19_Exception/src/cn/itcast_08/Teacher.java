package cn.itcast_08;

public class Teacher {
	public void check(int score) throws MyException{
		if(score > 100 || score < 0){
			throw new MyException("����������1-100֮��");
		}else{
			System.out.println("����û������");
		}	
	}
}
 