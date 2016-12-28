package cn.md.BuilderPattern.builder;

import java.util.ArrayList;

import cn.md.BuilderPattern.base.BenzModel;
import cn.md.BuilderPattern.base.sup.CarModel;
import cn.md.BuilderPattern.builder.sup.CarBuilder;

/** 
 * <Description> <br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月29日 <br>
 * @since V1.0<br>
 * @see cn.md.BuilderPattern.builder <br>
 */
public class BenzBuilder extends CarBuilder {
	
	/**
	 * benz
	 */
	private BenzModel benz = new BenzModel();

	/**
	 * Description: <br> 
	 * @author Jizuz<br>
	 * @param sequence <br>
	 */
	public void setSequence(ArrayList<String> sequence) {
		this.benz.setSequence(sequence);
	}

	/**
	 * Description: <br> 
	 * @author Jizuz<br>
	 * @return CarModel<br>
	 */
	public CarModel getCarModel() {
		return benz;
	}

}
