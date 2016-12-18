package cn.md.MultitionPattern;

/** 
 * <Description> <br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月3日 <br>
 * @since V1.0<br>
 * @see cn.md.MultitionPattern <br>
 */
public class Task {

	/**
	 * Description: 使用多例模式<br> 
	 * @author Jizuz<br>
	 * @param args <br>
	 * @throws Exception <br>
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws Exception {
		int taskNum = 10;
		
		for (int i = 0; i < taskNum; i++) {
			Multition task = Multition.getMultiInstance(11);
			task.information();
		}
	}

}
