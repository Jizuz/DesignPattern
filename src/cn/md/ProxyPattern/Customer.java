package cn.md.ProxyPattern;

import cn.md.ProxyPattern.dao.impl.Agent;
import cn.md.ProxyPattern.dao.impl.Manufactor;

/** 
 * <Description> <br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月1日 <br>
 * @since V1.0<br>
 * @see cn.md.ProxyPattern.dao <br>
 */
public class Customer {
	
	public static void main(String[] args) {
		Agent agency1 = new Agent();
		agency1.saleGoods();

		Agent agency2 = new Agent(new Manufactor());
		agency2.saleGoods();
	}

}
