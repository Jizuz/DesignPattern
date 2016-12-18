package cn.md.AbstractFactoryPattern.factory;

import cn.md.AbstractFactoryPattern.human.Human;

/** 
 * <Description> 造人的工厂接口<br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月9日 <br>
 * @since V1.0<br>
 * @see cn.md.AbstractFactoryPattern.factory <br>
 */
public interface HumanFactory {

	//制造黄色人种
	public Human createYellowHuman();
	
	//制造白色人种
	public Human createWhiteHuman();
	
	//制造黑色人种
	public Human createBlackHuman();
	
}
