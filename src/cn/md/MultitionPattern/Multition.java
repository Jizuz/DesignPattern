package cn.md.MultitionPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/** 
 * <Description> (有上限)多例模式<br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月3日 <br>
 * @since V1.0<br>
 * @see cn.md.MultitionPattern <br>
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class Multition {

	/**
	 * maxNumOfServer 服务器最大数<br>
	 */
	private static int maxNumOfServer = 3;
	
	/**
	 * countNumOfServer 当前服务器编号<br>
	 */
	private static int countNumOfServer = 0;
	
	/**
	 * servInfoList<br>
	 */
	private static List servInfoList = new ArrayList(maxNumOfServer);
	
	/**
	 * servList<br>
	 */
	private static List servList = new ArrayList(maxNumOfServer);
	
	/**
	 * map 存储指定服务器编号数据<br>
	 */
	private static Map<String, String> map = new HashMap<String, String>();
	
	/**
	 * 构造多例<br>
	 */
	private Multition() {
		
	}
	
	/**
	 * 构造多例，带参数<br>
	 * @param servInfo<br>
	 */
	private Multition(String servInfo) {
		servInfoList.add(servInfo);
	}
	
	/**
	 * 产生所有的服务器<br>
	 */
	static {
		for (int i = 0; i < maxNumOfServer; i++) {
			servList.add(new Multition("使用第" + (i + 1) + "个服务器;"));
		}
	}
	
	/**
	 * Description: 获取实例<br> 
	 * @author Jizuz<br>
	 * @return Multition<br>
	 */
	public static Multition getMultiInstance() {
		Random random = new Random();
		countNumOfServer = random.nextInt(maxNumOfServer);
		return (Multition) servList.get(countNumOfServer);
	}
	
	/**
	 * Description: 指定实例编号产生实例<br> 
	 * @author Jizuz<br>
	 * @param num int<br>
	 * @return Multition<br>
	 * @throws Exception 
	 */
	public static Multition getMultiInstance(int num) throws Exception {
		if (num < 3 && num > -1) {
			map.put("number", String.valueOf(num));
			return (Multition) servList.get(num);
		} else {
			throw new Exception("The designated number is out of permitted range!");
		}
	}
	
	/**
	 * Description: 服务器信息<br> 
	 * @author Jizuz<br>
	 */
	public static void information() {
		String val = map.get("number");
		if (val != null && val.length() > 0) {
			System.out.println(servInfoList.get(Integer.parseInt(val)));
		} else {
			System.out.println(servInfoList.get(countNumOfServer));
		}
	}
}
