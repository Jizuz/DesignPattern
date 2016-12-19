package cn.md.TemplateMethodPattern.temp.sup;

/** 
 * <Description> 模板方法模式：通过汇总或排序基本方法（在静态类中实现的方法）而产生的结果集<br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月19日 <br>
 * @since V1.0<br>
 * @see cn.md.TemplateMethodPattern.temp.sup <br>
 */
public abstract class CarModel {
	
	/**
	 * Description: 启动(静态)<br> 
	 * @author Jizuz<br> <br>
	 */
	protected abstract void start();
	
	/**
	 * Description: 移动(静态)<br> 
	 * @author Jizuz<br> <br>
	 */
	protected abstract void move();
	
	/**
	 * Description: 鸣喇叭(静态)<br> 
	 * @author Jizuz<br> <br>
	 */
	protected abstract void alarm();
	
	/**
	 * Description: 停车(静态)<br> 
	 * @author Jizuz<br> <br>
	 */
	protected abstract void stop();
	
	/**
	 * Description: 是否鸣喇叭<br> 
	 * @author Jizuz<br>
	 * @return <br>
	 */
	public boolean isAlarm() {
		return false;
	}

	/**
	 * Description: 运行<br> 
	 * @author Jizuz<br> <br>
	 */
	final public void run() {
		
		this.start();
		
		this.move();
		
		if (isAlarm()) {
			this.alarm();
		}
		
		this.stop();
	}
}
