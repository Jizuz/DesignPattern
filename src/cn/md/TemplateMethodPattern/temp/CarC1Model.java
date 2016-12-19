package cn.md.TemplateMethodPattern.temp;

import cn.md.TemplateMethodPattern.temp.sup.CarModel;

/** 
 * <Description> C1实现汽车模型<br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月19日 <br>
 * @since V1.0<br>
 * @see cn.md.TemplateMethodPattern.temp.sup <br>
 */
public class CarC1Model extends CarModel {

	/**
	 * Description: C1实现启动<br> 
	 * @author Jizuz<br> <br>
	 */
	protected void start() {
		System.out.println("汽车C1启动...");
	}

	/**
	 * Description: C1实现移动<br> 
	 * @author Jizuz<br> <br>
	 */
	protected void move() {
		System.out.println("汽车C1移动...");
	}

	/**
	 * Description: C1实现鸣喇叭<br> 
	 * @author Jizuz<br> <br>
	 */
	protected void alarm() {
		System.out.println("汽车C1鸣喇叭...");
	}

	/**
	 * Description: C1实现停车<br> 
	 * @author Jizuz<br> <br>
	 */
	protected void stop() {
		System.out.println("汽车C1停车...");
	}

	/**
	 * Description: C1默认鸣喇叭<br> 
	 * @author Jizuz<br>
	 * @return <br>
	 */
	public boolean isAlarm() {
		return true;
	}
}
