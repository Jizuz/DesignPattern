package cn.md.BridgePattern.implementor.sup;

/** 
 * <Description> <br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月30日 <br>
 * @since V1.0<br>
 * @see cn.md.BridgePattern.implementor.sup <br>
 */
public abstract class Production {

	/**
	 * Description: 生产产品<br> 
	 * @author Jizuz<br>
	 */
	public abstract void product();
	
	/**
	 * Description: 销售产品<br> 
	 * @author Jizuz<br>
	 */
	public abstract void sell();
}
