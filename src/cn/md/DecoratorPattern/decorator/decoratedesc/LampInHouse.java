package cn.md.DecoratorPattern.decorator.decoratedesc;

import cn.md.DecoratorPattern.component.NewHouse;
import cn.md.DecoratorPattern.decorator.HouseDecorator;

/** 
 * <Description> 卧室装个灯<br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2017年2月15日 <br>
 * @since V1.0<br>
 * @see cn.md.DecoratorPattern.decorator.decoratedesc <br>
 */
public class LampInHouse extends HouseDecorator {

	/**
	 * 构造
	 * @param house
	 */
	public LampInHouse(NewHouse house) {
		super(house);
	}

	/**
	 * Description: 装饰装的<br> 
	 * @author Jizuz<br>
	 */
	public void buyLamp() {
		System.out.println("装了个灯.");
	}
	
	/**
	 * Description: 重写sleep方法<br> 
	 * @author Jizuz<br>
	 */
	public void sleep() {
		buyLamp();
		super.sleep();
	}
}
