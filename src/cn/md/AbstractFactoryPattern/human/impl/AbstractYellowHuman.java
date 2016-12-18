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
public abstract class AbstractYellowHuman implements Human {

	/**
	 * Description: 黄色人种会笑<br> 
	 * @author Jizuz<br> <br>
	 */
	public void laugh() {
		System.out.println("黄色人种会幸福地大笑！");
	}

	/**
	 * Description: 黄色人种会哭<br> 
	 * @author Jizuz<br> <br>
	 */
	public void cry() {
		System.out.println("黄色人种会伤心的哭！");
	}

	/**
	 * Description: 黄色人种会说话<br> 
	 * @author Jizuz<br> <br>
	 */
	public void talk() {
		System.out.println("黄色人种会说话，一般说的都是双字节");
	}

}
