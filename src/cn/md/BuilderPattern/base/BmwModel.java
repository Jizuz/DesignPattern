package cn.md.BuilderPattern.base;

import cn.md.BuilderPattern.base.sup.CarModel;

/** 
 * <Description> <br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月29日 <br>
 * @since V1.0<br>
 * @see cn.md.BuilderPattern.base.sup <br>
 */
public class BmwModel extends CarModel {
	
	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	protected void start() {
		System.out.println("宝马车跑起来是这个样子的...");
	}

	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	protected void move() {
		System.out.println("宝马车的移动是这个声音的...");
	}

	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	protected void alarm() {
		System.out.println("宝马车的喇叭声音是这个样子的...");
	}

	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	protected void stop() {
		System.out.println("宝马车应该这样停车...");
	}
}
