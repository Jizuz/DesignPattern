package cn.md.DecoratorPattern.component;

/**
 * <Description> 居住新房子<br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2017年2月15日 <br>
 * @since V1.0<br>
 * @see cn.md.DecoratorPattern.component <br>
 */
public abstract class NewHouse {

	/**
	 * Description: 睡觉<br> 
	 * @author Jizuz<br>
	 */
	public abstract void sleep();
	
	/**
	 * Description: 吃饭<br> 
	 * @author Jizuz<br>
	 */
	public abstract void eat();
	
	/**
	 * Description: 上网<br> 
	 * @author Jizuz<br>
	 */
	public abstract void net(String name);
}
