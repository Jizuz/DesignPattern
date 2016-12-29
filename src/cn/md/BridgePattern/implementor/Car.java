package cn.md.BridgePattern.implementor;

import cn.md.BridgePattern.implementor.sup.Production;

/** 
 * <Description> 产品(汽车)<br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月30日 <br>
 * @since V1.0<br>
 * @see cn.md.BridgePattern.implementor <br>
 */
public class Car extends Production {

	/**
	 * Description: 生产汽车<br> 
	 * @author Jizuz<br> <br>
	 */
	public void product() {
		System.out.println("生产汽车...");
	}

	/**
	 * Description: 销售汽车<br> 
	 * @author Jizuz<br> <br>
	 */
	public void sell() {
		System.out.println("销售汽车...");
	}

}
