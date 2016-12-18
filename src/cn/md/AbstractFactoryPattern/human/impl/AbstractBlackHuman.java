package cn.md.AbstractFactoryPattern.human.impl;

import cn.md.AbstractFactoryPattern.human.Human;

/** 
 * <Description> <br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月9日 <br>
 * @since V1.0<br>
 * @see cn.md.AbstractFactoryPattern.human.impl <br>
 */
public abstract class AbstractBlackHuman implements Human {

	/**
	 * Description: 黑人会笑<br> 
	 * @author Jizuz<br> <br>
	 */
	public void laugh() {
		System.out.println("黑人会笑");
	}

	/**
	 * Description: 黑人会哭<br> 
	 * @author Jizuz<br> <br>
	 */
	public void cry() {
		System.out.println("黑人会哭");
	}

	/**
	 * Description: 黑人可以说话<br> 
	 * @author Jizuz<br> <br>
	 */
	public void talk() {
		System.out.println("黑人可以说话，一般人听不懂");
	}

}
