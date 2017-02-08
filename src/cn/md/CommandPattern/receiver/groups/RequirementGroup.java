package cn.md.CommandPattern.receiver.groups;

import cn.md.CommandPattern.receiver.Group;

/** 
 * <Description> 需求团队<br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2017年2月9日 <br>
 * @since V1.0<br>
 * @see cn.md.CommandPattern.receiver.groups <br>
 */
public class RequirementGroup extends Group {

	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	public void find() {
		System.out.println("客户找到需求组...");
	}

	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	public void add() {
		System.out.println("客户要求添加需求...");
	}

	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	public void mod() {
		System.out.println("客户要求修改需求...");
	}

	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	public void del() {
		System.out.println("客户要求删除需求...");
	}

	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	public void plan() {
		System.out.println("客户要求需求变更计划...");
	}

}
