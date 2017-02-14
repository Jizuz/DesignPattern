package cn.md.DecoratorPattern.decorator;

import cn.md.DecoratorPattern.component.NewHouse;

/** 
 * <Description> <br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2017年2月15日 <br>
 * @since V1.0<br>
 * @see cn.md.DecoratorPattern.decorator <br>
 */
public abstract class HouseDecorator extends NewHouse {

	/**
	 * NewHouse
	 */
	private NewHouse house;
	
	/**
	 * 构造函数
	 * @param house
	 */
	public HouseDecorator(NewHouse house) {
		this.house = house;
	}
	
	/**
	 * Description: <br> 
	 * @author Jizuz<br>
	 */
	public void sleep() {
		this.house.sleep();
	}

	/**
	 * Description: <br> 
	 * @author Jizuz<br>
	 */
	public void eat() {
		this.house.eat();
	}

	/**
	 * Description: <br> 
	 * @author Jizuz<br>
	 */
	public void net(String name) {
		this.house.net(name);
	}

}
