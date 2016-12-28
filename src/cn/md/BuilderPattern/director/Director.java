package cn.md.BuilderPattern.director;

import java.util.ArrayList;

import cn.md.BuilderPattern.base.BenzModel;
import cn.md.BuilderPattern.base.BmwModel;
import cn.md.BuilderPattern.builder.BenzBuilder;
import cn.md.BuilderPattern.builder.BmwBuilder;

/** 
 * <Description> 导演类:组装各种可能情况<br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月29日 <br>
 * @since V1.0<br>
 * @see cn.md.BuilderPattern.director <br>
 */
public class Director {
	
	/**
	 * sequence
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private ArrayList<String> sequence = new ArrayList();
	
	/**
	 * benzBuilder
	 */
	private BenzBuilder benzBuilder = new BenzBuilder();
	
	/**
	 * bmwBuilder
	 */
	private BmwBuilder bmwBuilder = new BmwBuilder();
	
	/**
	 * Description: A型奔驰车<br> 
	 * @author Jizuz<br>
	 * @return BenzModel<br>
	 */
	public BenzModel getABenzModel(){
		// 清理场景
		this.sequence.clear();
		// ABenzModel的执行顺序
		this.sequence.add("start");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(this.sequence);
		
		return (BenzModel) benzBuilder.getCarModel();
	}
	
	/**
	 * Description: B型奔驰车<br> 
	 * @author Jizuz<br>
	 * @return BenzModel<br>
	 */
	public BenzModel getBBenzModel(){
		this.sequence.clear();
		
		this.sequence.add("engine boom");
		this.sequence.add("start");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(this.sequence);
		
		return (BenzModel) benzBuilder.getCarModel();
	}
	
	/**
	 * Description: C型宝马车<br> 
	 * @author Jizuz<br>
	 * @return BenzModel<br>
	 */
	public BmwModel getCBmwModel(){
		this.sequence.clear();
		
		this.sequence.add("alarm");
		this.sequence.add("start");
		this.sequence.add("stop");
		this.bmwBuilder.setSequence(this.sequence);
		
		return (BmwModel) bmwBuilder.getCarModel();
	}
	
	/**
	 * Description: D型宝马车<br> 
	 * @author Jizuz<br>
	 * @return BenzModel<br>
	 */
	public BmwModel getDBmwModel(){
		this.sequence.clear();
		
		this.sequence.add("start");
		this.bmwBuilder.setSequence(this.sequence);
		
		return (BmwModel) bmwBuilder.getCarModel();
	}
}
