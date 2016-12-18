package cn.md.StrategyPattern.dao;

/**
 * <Description> 定义：一系列的算法,把每一个算法封装起来, 并且使它们可相互替换<br> 
 * 优点：高内聚低耦合<br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年11月30日 <br>
 * @since V1.0<br>
 * @see cn.md.StrategyPattern <br>
 */
public interface IStrategy {

	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	public void operation();
}
