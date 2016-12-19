package cn.md.TemplateMethodPattern;

import cn.md.TemplateMethodPattern.temp.CarC1Model;
import cn.md.TemplateMethodPattern.temp.CarC2Model;
import cn.md.TemplateMethodPattern.temp.sup.CarModel;

/** 
 * <Description> <br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月20日 <br>
 * @since V1.0<br>
 * @see cn.md.TemplateMethodPattern <br>
 */
public class Client {

	/**
	 * Description: <br> 
	 * @author Jizuz<br>
	 * @param args <br>
	 */
	public static void main(String[] args) {
		CarModel c1 = new CarC1Model();
		c1.run();
		
		CarC2Model c2 = new CarC2Model();
		c2.setAlarm(true);
		c2.run();
	}

}
