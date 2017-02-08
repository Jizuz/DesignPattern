package cn.md.CommandPattern.receiver.groups;

import cn.md.CommandPattern.receiver.Group;

/** 
 * <Description> 代码团队<br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2017年2月9日 <br>
 * @since V1.0<br>
 * @see cn.md.CommandPattern.receiver.groups <br>
 */
public class CodeGroup extends Group {

	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	public void find() {
		System.out.println("找到代码组...");
	}

	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	public void add() {
		System.out.println("客户需要添加功能...");
	}

	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	public void mod() {
		System.out.println("客户需要修改功能...");
	}

	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	public void del() {
		System.out.println("客户需要删除功能...");
	}

	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	public void plan() {
		System.out.println("客户要求代码变更计划...");
	}

}
