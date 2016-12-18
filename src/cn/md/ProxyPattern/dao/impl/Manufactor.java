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
public class Manufactor implements IBizMan {

	public void saleGoods() {
		System.out.println("厂家直接提供的商品。");
	}

}
