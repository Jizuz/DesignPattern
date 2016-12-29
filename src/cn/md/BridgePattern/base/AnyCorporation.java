package cn.md.BridgePattern.base;

import cn.md.BridgePattern.base.sup.Corporation;
import cn.md.BridgePattern.section.sup.Production;

/** 
 * <Description> <br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月30日 <br>
 * @since V1.0<br>
 * @see cn.md.BridgePattern.base <br>
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
