package cn.md.SingletonPattern.simplesingleton;

/**
 * <Description> 普通单例模式<br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月2日 <br>
 * @since V1.0<br>
 * @see cn.md.SingletonPattern.simplesingleton <br>
 */
public class SimpleSingleton {

	/**
	 * simpleSingleton
	 */
	private static SimpleSingleton simpleSingleton = null;
	
	/**
	 * private约束不产生第二个对象实例
	 */
	private SimpleSingleton() {
		
	}
	
	/**
	 * Description: 其他类获取实例方法<br> 
	 * @author Jizuz<br>
	 * @return SimpleSingleton<br>
	 */
	public static SimpleSingleton getInstance() {
		if (null == simpleSingleton) {
			simpleSingleton = new SimpleSingleton();
		}
		return simpleSingleton;
	}
	
	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	public static void singletonInfo() {
		System.out.println("The singleton only do the one thing !");
	}
}
