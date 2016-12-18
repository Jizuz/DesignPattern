package cn.md.ProxyPattern.dao.impl;

import cn.md.ProxyPattern.dao.IBizMan;

/** 
 * <Description> <br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月1日 <br>
 * @since V1.0<br>
 * @see cn.md.ProxyPattern.dao.impl <br>
 */
public class Agent implements IBizMan {

	private IBizMan bizMan;
	
	public Agent() {
		this.bizMan = new Supplier();
	}
	
	public Agent(IBizMan bizMan) {
		this.bizMan = bizMan;
	}
	
	/**
	 * 
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	public void saleGoods() {
		this.bizMan.saleGoods();
	}

}
