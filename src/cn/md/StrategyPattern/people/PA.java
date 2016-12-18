package cn.md.StrategyPattern.people;

import cn.md.StrategyPattern.Context;
import cn.md.StrategyPattern.dao.impl.Running;
import cn.md.StrategyPattern.dao.impl.Standing;
import cn.md.StrategyPattern.dao.impl.Walking;

/** 
 * <Description> <br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年11月30日 <br>
 * @since V1.0<br>
 * @see cn.md.StrategyPattern.people <br>
 */
public class PA {

	/**
	 * Description: <br> 
	 * @author Jizuz<br>
	 * @param args <br>
	 */
	public static void main(String[] args) {
		Context context;
		
		context= new Context(new Standing());
		context.operation();
		
		context= new Context(new Running());
		context.operation();
		
		context= new Context(new Walking());
		context.operation();
	}

}
