package cn.itcast_01;

import java.util.ArrayList;

// JDK5�������ԣ� �Զ���װ�� ����  ��ǿfor  ��̬���� �ɱ���� ö��

/**
 * 				for(��������  ����  �� ����򼯺�){
 * 					  ����
 * 				}
 *
 */

public class ForDemo {
	
	public static void main(String[] args) {
		
		int [] arr ={1,2,3,4,5};
		for(int i =0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		
		
		for(int i : arr){
			System.out.println(i);
		}
		
		System.out.println("-----------------------------------");
		
		String [] arr2 = {"Ben","Miachel","Moffies"};
		for(int i =0; i< arr2.length; i++){
			System.out.println(arr2[i]);
		}
		
		for(String s : arr2){
			System.out.println(s);
		}
		
		
		System.out.println("---------------------------------");
		
		ArrayList<String> arr3 = new ArrayList<String>();
		arr3.add("hello");
		arr3.add("world");
		arr3.add("java");
		
		for(String s : arr3){
			System.out.println(s);
		}
		
		
		
		
		
		
	}

}
