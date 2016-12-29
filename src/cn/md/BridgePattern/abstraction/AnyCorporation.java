package cn.md.BridgePattern.abstraction;

import cn.md.BridgePattern.abstraction.sup.Corporation;
import cn.md.BridgePattern.implementor.sup.Production;

/** 
 * <Description> 任何一家公司<br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月30日 <br>
 * @since V1.0<br>
 * @see cn.md.BridgePattern.abstraction <br>
 */
public class AnyCorporation extends Corporation {

	public AnyCorporation(Production prod) {
		super(prod);
	}

	public void makeMoney() {
		super.makeMoney();
		System.out.println("公司开始赚钱！");
	}
}
