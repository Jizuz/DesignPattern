package cn.md.AbstractFactoryPattern.factory.extend;

import cn.md.AbstractFactoryPattern.factory.HumanEnum;
import cn.md.AbstractFactoryPattern.factory.impl.AbstractHumanFactory;
import cn.md.AbstractFactoryPattern.human.Human;

/** 
 * <Description> 男性创建工厂<br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月9日 <br>
 * @since V1.0<br>
 * @see cn.md.AbstractFactoryPattern.factory.extend <br>
 */
public class MaleHumanFactory extends AbstractHumanFactory {

	/**
	 * Description: 创建男性黄种人<br> 
	 * @author Jizuz<br>
	 * @return Human<br>
	 */
	public Human createYellowHuman() {
		return super.createHuman(HumanEnum.YellowMaleHuman);
	}

	/**
	 * Description: 创建男性白种人<br> 
	 * @author Jizuz<br>
	 * @return Human<br>
	 */
	public Human createWhiteHuman() {
		return super.createHuman(HumanEnum.WhiteMaleHuman);
	}

	/**
	 * Description: 创建男性<br> 
	 * @author Jizuz<br>
	 * @return Human<br>
	 */
	public Human createBlackHuman() {
		return super.createHuman(HumanEnum.BlackMaleHuman);
	}

}
