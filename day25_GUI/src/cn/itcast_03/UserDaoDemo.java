package cn.itcast_03;

/**\
 * 问题：
 *    接口（方法比较多） -- 实现类（仅仅使用一个，也把其他的方法实现）
 * @author 
 * 解决：
 * 	接口（方法比较多）--适配器类（实现接口，仅仅空实现）-- 实现类（用哪个实现那个）
 */
public class UserDaoDemo {
	public static void main(String[] args) {
		UserDao ud = new UserDaoImpl();
		ud.add();
		
		UserDao ud2 = new UserDaoImpl2();
		ud2.add();
	}
}
