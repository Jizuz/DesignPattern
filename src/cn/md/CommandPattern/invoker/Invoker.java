package cn.md.CommandPattern.invoker;

import cn.md.CommandPattern.command.Command;

/** 
 * <Description> <br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2017年2月9日 <br>
 * @since V1.0<br>
 * @see cn.md.CommandPattern.invoker <br>
 */
public class Invoker {

	/**
	 * command Command
	 */
	private Command command;
	
	/**
	 * Description: 设置命令<br> 
	 * @author Jizuz<br>
	 * @param command <br>
	 */
	public void setCommand(Command command) {
		this.command = command;
	}
	
	/**
	 * Description: 执行客户命令<br> 
	 * @author Jizuz<br>
	 */
	public void action() {
		command.execute();
	}
}
