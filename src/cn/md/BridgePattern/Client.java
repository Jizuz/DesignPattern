package cn.md.BridgePattern;

import cn.md.BridgePattern.base.AnyCorporation;
import cn.md.BridgePattern.section.Car;
import cn.md.BridgePattern.section.Clothes;
import cn.md.BridgePattern.section.Phone;

/** 
 * <Description> <br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月30日 <br>
 * @since V1.0<br>
 * @see cn.md.BridgePattern <br>
 */
public class Client {

	/**
	 * Description: <br> 
	 * @author Jizuz<br>
	 * @param args <br>
	 */
	public static void main(String[] args) {
		
		// 服装公司
		AnyCorporation corpA = new AnyCorporation(new Clothes());
		corpA.makeMoney();
		
		// 汽车公司
		AnyCorporation corpB = new AnyCorporation(new Car());
		corpB.makeMoney();
		
		// 手机公司
		AnyCorporation corpC = new AnyCorporation(new Phone());
		corpC.makeMoney();
	}
}
