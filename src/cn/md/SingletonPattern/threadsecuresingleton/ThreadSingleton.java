package cn.md.SingletonPattern.threadsecuresingleton;

/** 
 * <Description> 直接new一个对象传递给类的成员变量singletonpattern，你要的时候getInstance()直接<br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月2日 <br>
 * @since V1.0<br>
 * @see cn.md.SingletonPattern.threadsecuresingleton <br>
 */
public class ThreadSingleton {
	
	/**
	 * threadSingleton
	 */
	private static final ThreadSingleton threadSingleton = new ThreadSingleton();
	
	/**
	 * 限制住不能直接产生一个实例
	 */
	private ThreadSingleton() {
		
	}
	
	/**
	 * Description: <br> 
	 * @author Jizuz<br>
	 * @return <br>
	 */
	public synchronized static ThreadSingleton getInstance() {
		return threadSingleton;
	}

	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	public static void tip() {
		System.out.println("Only one and can be security!");
	}
}
