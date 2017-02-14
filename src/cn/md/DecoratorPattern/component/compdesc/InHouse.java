package cn.md.DecoratorPattern.component.compdesc;

import cn.md.DecoratorPattern.component.NewHouse;

/** 
 * <Description> <br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2017年2月15日 <br>
 * @since V1.0<br>
 * @see cn.md.DecoratorPattern.component.compdesc <br>
 */
public class InHouse extends NewHouse {

	/**
	 * Description: <br> 
	 * @author Jizuz<br>
	 */
	public void sleep() {
		System.out.println("卧室睡觉.");
	}

	/**
	 * Description: <br> 
	 * @author Jizuz<br>
	 */
	public void eat() {
		System.out.println("厨房吃饭.");
	}

	/**
	 * Description: <br> 
	 * @author Jizuz<br>
	 * @param name <br>
	 */
	public void net(String name) {
		System.out.println("使用" + name + "的网络.");
	}

}
