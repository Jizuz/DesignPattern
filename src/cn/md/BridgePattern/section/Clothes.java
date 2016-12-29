package cn.md.BridgePattern.section;

import cn.md.BridgePattern.section.sup.Production;

/** 
 * <Description> 产品(衣服)<br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月30日 <br>
 * @since V1.0<br>
 * @see cn.md.BridgePattern.section <br>
 */
public class Clothes extends Production {

	/**
	 * Description: 生产衣服<br> 
	 * @author Jizuz<br> <br>
	 */
	public void product() {
		System.out.println("生产衣服...");
	}

	/**
	 * Description: 销售衣服<br> 
	 * @author Jizuz<br> <br>
	 */
	public void sell() {
		System.out.println("销售衣服...");
	}

}
