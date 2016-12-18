package cn.md.AbstractFactoryPattern.factory.extend;

import cn.md.AbstractFactoryPattern.factory.HumanEnum;
import cn.md.AbstractFactoryPattern.factory.impl.AbstractHumanFactory;
import cn.md.AbstractFactoryPattern.human.Human;

/** 
 * <Description> 女性创建工厂<br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月9日 <br>
 * @since V1.0<br>
 * @see cn.md.AbstractFactoryPattern.factory.extend <br>
 */
public class FemaleHumanFactory extends AbstractHumanFactory {

	/**
	 * Description: 创建女性黄种人<br> 
	 * @author Jizuz<br>
	 * @return Human<br>
	 */
	public Human createYellowHuman() {
		return super.createHuman(HumanEnum.YellowFemaleHuman);
	}

	/**
	 * Description: 创建女性白种人<br> 
	 * @author Jizuz<br>
	 * @return Human<br>
	 */
	public Human createWhiteHuman() {
		return super.createHuman(HumanEnum.WhiteFemaleHuman);
	}

	/**
	 * Description: 创建女性黑种人<br> 
	 * @author Jizuz<br>
	 * @return Human<br>
	 */
	public Human createBlackHuman() {
		return super.createHuman(HumanEnum.BlackFemaleHuman);
	}

}
