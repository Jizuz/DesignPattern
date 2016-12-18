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
public abstract class AbstractWhiteHuman implements Human {

	/**
	 * Description: 白色人种会笑<br> 
	 * @author Jizuz<br> <br>
	 */
	public void laugh() {
		System.out.println("白色人种会大笑，侵略的笑声！");
	}

	/**
	 * Description: 白色人种会哭<br> 
	 * @author Jizuz<br> <br>
	 */
	public void cry() {
		System.out.println("白色人种会哭！");
	}

	/**
	 * Description: 白色人种会说话<br> 
	 * @author Jizuz<br> <br>
	 */
	public void talk() {
		System.out.println("白色人种会说话，一般都是但是单字节！");
	}

}
