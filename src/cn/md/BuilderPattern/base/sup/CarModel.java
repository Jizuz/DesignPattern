package cn.md.BuilderPattern.base.sup;

import java.util.ArrayList;

/** 
 * <Description> <br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月29日 <br>
 * @since V1.0<br>
 * @see cn.md.BuilderPattern.base.sup <br>
 */
public abstract class CarModel {
	
	/**
	 * sequence 顺序序列
	 */
	private ArrayList<String> sequence = new ArrayList<String>();
	
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
		for (int i = 0; i < sequence.size(); i++) {
			String actionName = sequence.get(i);
			
			if (actionName.equalsIgnoreCase("start")) {
				this.start();
			}
			else if (actionName.equalsIgnoreCase("stop")) {
				this.stop();
			}
			else if (actionName.equalsIgnoreCase("alarm")) {
				this.alarm();
			}
			else if (actionName.equalsIgnoreCase("move")) {
				this.move();
			}
		}
	}
	
	/**
	 * Description: 获取顺序序列<br> 
	 * @author Jizuz<br>
	 * @param sequence <br>
	 */
	final public void setSequence(ArrayList<String> sequence) {
		this.sequence = sequence;
	}
}
