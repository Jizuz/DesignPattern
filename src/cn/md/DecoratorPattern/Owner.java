package cn.md.DecoratorPattern;

import cn.md.DecoratorPattern.component.NewHouse;
import cn.md.DecoratorPattern.component.compdesc.InHouse;
import cn.md.DecoratorPattern.decorator.decoratedesc.BedInHouse;
import cn.md.DecoratorPattern.decorator.decoratedesc.LampInHouse;

/** 
 * <Description> <br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2017年2月15日 <br>
 * @since V1.0<br>
 * @see cn.md.DecoratorPattern <br>
 */
public class Owner {

	/**
	 * Description: <br> 
	 * @author Jizuz<br>
	 * @param args <br>
	 */
	public static void main(String[] args) {
		
		NewHouse house;
				
		house = new InHouse();
		
		house.eat();
		
		house = new BedInHouse(house);
				
		house = new LampInHouse(house);
		
		house.sleep();
		
		house.net("Jizuz");

	}

}
