package cn.itcast_03;

/**\
 * ���⣺
 *    �ӿڣ������Ƚ϶ࣩ -- ʵ���ࣨ����ʹ��һ����Ҳ�������ķ���ʵ�֣�
 * @author 
 * �����
 * 	�ӿڣ������Ƚ϶ࣩ--�������ࣨʵ�ֽӿڣ�������ʵ�֣�-- ʵ���ࣨ���ĸ�ʵ���Ǹ���
 */
public class UserDaoDemo {
	public static void main(String[] args) {
		UserDao ud = new UserDaoImpl();
		ud.add();
		
		UserDao ud2 = new UserDaoImpl2();
		ud2.add();
	}
}
