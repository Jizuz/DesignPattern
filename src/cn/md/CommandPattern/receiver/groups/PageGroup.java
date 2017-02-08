package cn.md.CommandPattern.receiver.groups;

import cn.md.CommandPattern.receiver.Group;

/** 
 * <Description> 美工团队<br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2017年2月9日 <br>
 * @since V1.0<br>
 * @see cn.md.CommandPattern.receiver.groups <br>
 */
public class PageGroup extends Group {

	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	public void find() {
		System.out.println("找到美工组...");
	}

	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	public void add() {
		System.out.println("客户需要添加界面...");
	}

	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	public void mod() {
		System.out.println("客户需要修改界面...");
	}

	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	public void del() {
		System.out.println("客户需要删除界面...");
	}

	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	public void plan() {
		System.out.println("客户要求页面变更计划...");
	}

}
