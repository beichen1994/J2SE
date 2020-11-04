package cn.itcast_05;

// 把泛型定义在方法上

public class ObjectTool {
	
	public <T> void show( T t){
		System.out.println(t);
	}

}
