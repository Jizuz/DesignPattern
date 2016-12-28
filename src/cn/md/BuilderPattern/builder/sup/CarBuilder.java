package cn.md.BuilderPattern.builder.sup;

import java.util.ArrayList;

import cn.md.BuilderPattern.base.sup.CarModel;

/** 
 * <Description> <br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月29日 <br>
 * @since V1.0<br>
 * @see cn.md.BuilderPattern.builder.sup <br>
 */
public abstract class CarBuilder {

	/**
	 * Description: 建造一个顺序模型<br> 
	 * @author Jizuz<br>
	 * @param sequence <br>
	 */
	public abstract void setSequence(ArrayList<String> sequence);
	
	/**
	 * Description: 设置完顺序获取车辆模型<br> 
	 * @author Jizuz<br>
	 * @return <br>
	 */
	public abstract CarModel getCarModel();
}
