package cn.md.AbstractFactoryPattern.human.extend;

import cn.md.AbstractFactoryPattern.human.impl.AbstractWhiteHuman;

/** 
 * <Description> 男性白种人<br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月9日 <br>
 * @since V1.0<br>
 * @see cn.md.AbstractFactoryPattern.human.extend <br>
 */
public class WhiteMaleHuman extends AbstractWhiteHuman {

	/**
	 * Description: 男白种人<br> 
	 * @author Jizuz<br> <br>
	 */
	public void sex() {
		System.out.println("该白种人的性别为男....");
	}

}
