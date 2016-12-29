package cn.md.BridgePattern.implementor;

import cn.md.BridgePattern.implementor.sup.Production;

/** 
 * <Description> 产品(手机)<br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月30日 <br>
 * @since V1.0<br>
 * @see cn.md.BridgePattern.implementor <br>
 */
public class Phone extends Production {

	/**
	 * Description: 生产手机<br> 
	 * @author Jizuz<br>
	 */
	public void product() {
		System.out.println("生产手机...");
	}

	/**
	 * Description: 销售手机<br> 
	 * @author Jizuz<br>
	 */
	public void sell() {
		System.out.println("销售手机...");
	}

}
