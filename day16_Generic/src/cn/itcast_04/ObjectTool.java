package cn.itcast_04;

//把泛型定义在类上

public class ObjectTool<T> {
	private T obj;
	
	public void setObj(T obj){
		this.obj = obj;
	}
	
	public T getObj(){
		return obj;
	}
}
