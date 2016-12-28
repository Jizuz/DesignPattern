package cn.md.BuilderPattern;

import cn.md.BuilderPattern.director.Director;

/** 
 * <Description> <br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月29日 <br>
 * @since V1.0<br>
 * @see cn.md.BuilderPattern <br>
 */
public class Client {

	/**
	 * Description: <br> 
	 * @author Jizuz<br>
	 * @param args <br>
	 */
	public static void main(String[] args) {
		Director director = new Director();
		
		for (int i = 0; i < 10; i++) {
			director.getABenzModel().run();
		}
		
		for (int j = 0; j < 5; j++) {
			director.getDBmwModel().run();
		}
	}

}
