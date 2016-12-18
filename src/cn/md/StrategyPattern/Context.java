package cn.md.StrategyPattern;

import cn.md.StrategyPattern.dao.IStrategy;

/** 
 * <Description> <br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年11月30日 <br>
 * @since V1.0<br>
 * @see cn.md.StrategyPattern <br>
 */
public class Context {

	/**
	 * strategy
	 */
	private IStrategy strategy;
	
	/**
	 * 构造
	 * @param strategy
	 */
	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	public void operation() {
		this.strategy.operation();
	}

}