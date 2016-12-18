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
public class Supplier implements IBizMan {

	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	public void saleGoods() {
		System.out.println("供货商供应的商品。");
	}

}
