package cn.md.BridgePattern.base.sup;

import cn.md.BridgePattern.section.sup.Production;

/** 
 * <Description> 公司抽象类<br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月30日 <br>
 * @since V1.0<br>
 * @see cn.md.BridgePattern.base.sup <br>
 */
public abstract class Corporation {

	/**
	 * prod
	 */
	private Production prod;
	
	/**
	 * 构造
	 * @param prod
	 */
	public Corporation(Production prod) {
		this.prod = prod;
	}
	
	/**
	 * Description: 公司赚钱<br> 
	 * @author Jizuz<br> <br>
	 */
	public void makeMoney() {
		
		this.prod.product();
		
		this.prod.sell();
	}
}
