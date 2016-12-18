package cn.md.SingletonPattern.threadsecuresingleton;

/** 
 * <Description> <br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月2日 <br>
 * @since V1.0<br>
 * @see cn.md.SingletonPattern.threadsecuresingleton <br>
 */
public class ClzB {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		ThreadSingleton tdSingleton1 = ThreadSingleton.getInstance();
		tdSingleton1.tip();
		
		ThreadSingleton tdSingleton2 = ThreadSingleton.getInstance();
		tdSingleton2.tip();
	}
}
