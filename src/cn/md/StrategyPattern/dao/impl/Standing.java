package cn.md.StrategyPattern.dao.impl;

import cn.md.StrategyPattern.dao.IStrategy;

/** 
 * <Description> <br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年11月30日 <br>
 * @since V1.0<br>
 * @see cn.md.StrategyPattern.impl <br>
 */
public class Standing implements IStrategy {

	/**
	 * Description: <br> 
	 * @author XXX<br> <br>
	 */
	public void operation() {
		System.out.println("is Standing !");
	}

}
