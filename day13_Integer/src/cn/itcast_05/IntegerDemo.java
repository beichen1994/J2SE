package cn.itcast_05;
/**
 * 				�Զ�װ�䣺�ѻ�������ת��Ϊ��װ������
 * 				�Զ����䣺�Ѱ�װ������ת��Ϊ��������
 * 
 * 			
 *
 */

public class IntegerDemo {
	public static void main(String[] args) {
		
			Integer ii = 100;    //�Զ�װ��  Integer ii = Integer.valueOf(200);
			ii += 200;		     //�Զ����� �����Զ�װ�� ii = Integer.valueOf(ii.valueOf() + 200);
			System.out.println("ii : " + ii);	//System.out.println(new StringBulider("ii :").append(ii).toString );
			
			
	}
}
