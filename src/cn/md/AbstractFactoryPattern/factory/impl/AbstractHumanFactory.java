package cn.md.AbstractFactoryPattern.factory.impl;

import cn.md.AbstractFactoryPattern.factory.HumanEnum;
import cn.md.AbstractFactoryPattern.factory.HumanFactory;
import cn.md.AbstractFactoryPattern.human.Human;

/** 
 * <Description> 造人抽象工厂实现类<br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月9日 <br>
 * @since V1.0<br>
 * @see cn.md.AbstractFactoryPattern.factory.impl <br>
 */
public abstract class AbstractHumanFactory implements HumanFactory {

	/**
	 * Description: 造人<br> 
	 * @author Jizuz<br>
	 * @param humanEnum
	 * @return <br>
	 */
	protected Human createHuman(HumanEnum humanEnum) {
		Human human = null;
		
		// 如果传递进来不是一个Enum中具体的一个Element的话，则不处理
		if (!humanEnum.getValue().equals("")) {
			try {
				// 直接产生一个实例
				human = (Human) Class.forName(humanEnum.getValue()).newInstance();
			} catch (Exception e) {
				// 因为正常使用了enum，这个种异常情况不会产生了
				e.printStackTrace();
			}
		}
		return human;
	}
}
