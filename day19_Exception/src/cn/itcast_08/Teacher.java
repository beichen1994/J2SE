package cn.itcast_08;

public class Teacher {
	public void check(int score) throws MyException{
		if(score > 100 || score < 0){
			throw new MyException("分数必须在1-100之间");
		}else{
			System.out.println("分数没有问题");
		}	
	}
}
 