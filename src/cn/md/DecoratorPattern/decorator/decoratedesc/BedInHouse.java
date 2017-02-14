package cn.md.DecoratorPattern.decorator.decoratedesc;

import cn.md.DecoratorPattern.component.NewHouse;
import cn.md.DecoratorPattern.decorator.HouseDecorator;

/** 
 * <Description> 卧室买张床<br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2017年2月15日 <br>
 * @since V1.0<br>
 * @see cn.md.DecoratorPattern.decorator.decoratedesc <br>
 */
public class BedInHouse extends HouseDecorator {

	/**
	 * 构造
	 * @param house
	 */
	public BedInHouse(NewHouse house) {
		super(house);
	}

	/**
	 * Description: 买床<br> 
	 * @author Jizuz<br>
	 */
	public void buyBed() {
		System.out.println("买了张床.");
	}
	
	/**
	 * Description: 重写sleep()方法<br> 
	 * @author Jizuz<br>
	 */
	public void sleep() {
		buyBed();
		super.sleep();
	}
}
