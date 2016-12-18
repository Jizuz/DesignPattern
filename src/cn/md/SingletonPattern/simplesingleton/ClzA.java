package cn.md.SingletonPattern.simplesingleton;

/** 
 * <Description> <br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月2日 <br>
 * @since V1.0<br>
 * @see cn.md.SingletonPattern.simplesingleton <br>
 */
public class ClzA {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		SimpleSingleton spSingleton1 = SimpleSingleton.getInstance();
		spSingleton1.singletonInfo();
		
		SimpleSingleton spSingleton2 = SimpleSingleton.getInstance();
		spSingleton2.singletonInfo();
	}
}
