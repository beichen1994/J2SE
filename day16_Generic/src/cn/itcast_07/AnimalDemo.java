package cn.itcast_07;

import java.util.ArrayList;
import java.util.Collection;

/**
	泛型通配符<?>
	
	<? extends E>    E及其子类
	
	
	<? super E>     E及其父类
	
*/


public class AnimalDemo {
	public static void main(String[] args) {
		
		Collection<?> c1 = new ArrayList<Object>();
		Collection<?> c2 = new ArrayList<Animal>();
		Collection<?> c3 = new ArrayList<Cat>();
		Collection<?> c4 = new ArrayList<Dog>();
		
	    //Collection<? extends Animal> c5 = new ArrayList<Object>();
		Collection<? extends Animal> c6 = new ArrayList<Animal>();
		Collection<? extends Animal> c7 = new ArrayList<Dog>();
		
		Collection<? super Animal> c9 = new ArrayList<Object>();
		Collection<? super Animal> c10 = new ArrayList<Animal>();
		//Collection<? super Animal> c11= new ArrayList<Dog>();
		//Collection<? super Animal> c12= new ArrayList<Cat>();
		
		
		
	}

}
