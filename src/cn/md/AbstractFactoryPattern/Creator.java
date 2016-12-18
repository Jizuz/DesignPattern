package cn.md.AbstractFactoryPattern;

import cn.md.AbstractFactoryPattern.factory.HumanFactory;
import cn.md.AbstractFactoryPattern.factory.extend.FemaleHumanFactory;
import cn.md.AbstractFactoryPattern.factory.extend.MaleHumanFactory;
import cn.md.AbstractFactoryPattern.human.Human;

/** 
 * <Description> <br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月9日 <br>
 * @since V1.0<br>
 * @see cn.md.AbstractFactoryPattern <br>
 */
public class Creator {

	/**
	 * Description: <br> 
	 * @author Jizuz<br>
	 * @param args <br>
	 */
	public static void main(String[] args) {
		//第一条生产线，男性生产线
		HumanFactory maleHumanFactory = new MaleHumanFactory();
		
		//第二条生产线，女性生产线
		HumanFactory femaleHumanFactory = new FemaleHumanFactory();
		
		Human maleYellowHuman = maleHumanFactory.createYellowHuman();
		maleYellowHuman.laugh();
		maleYellowHuman.sex();
		
		Human femaleWhiteHuman = femaleHumanFactory.createWhiteHuman();
		femaleWhiteHuman.cry();
		femaleWhiteHuman.sex();
	}

}
