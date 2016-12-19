package cn.md.TemplateMethodPattern.temp;

import cn.md.TemplateMethodPattern.temp.sup.CarModel;

/** 
 * <Description> C2实现汽车模型<br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月20日 <br>
 * @since V1.0<br>
 * @see cn.md.TemplateMethodPattern.temp <br>
 */
public class CarC2Model extends CarModel {
	
	/**
	 * alarmFlag 默认鸣喇叭
	 */
	private boolean alarmFlag = true;

	/**
	 * Description: C2实现启动<br> 
	 * @author Jizuz<br> <br>
	 */
	protected void start() {
		System.out.println("汽车C2启动...");
	}

	/**
	 * Description: C2实现移动<br> 
	 * @author Jizuz<br> <br>
	 */
	protected void move() {
		System.out.println("汽车C2移动...");
	}

	/**
	 * Description: C2实现鸣喇叭<br> 
	 * @author Jizuz<br> <br>
	 */
	protected void alarm() {
		System.out.println("汽车C2鸣喇叭...");
	}

	/**
	 * Description: C2实现停车<br> 
	 * @author Jizuz<br> <br>
	 */
	protected void stop() {
		System.out.println("汽车C2停车...");
	}

	/**
	 * Description: 重写父类方法isAlarm,boolean值根据用户设置<br> 
	 * @author Jizuz<br>
	 * @return boolean<br>
	 */
	public boolean isAlarm() {
		return this.alarmFlag;
	}
	
	/**
	 * Description: 设置boolean值<br> 
	 * @author Jizuz<br>
	 * @param flag <br>
	 */
	public void setAlarm(boolean flag) {
		this.alarmFlag = flag;
	}
}
