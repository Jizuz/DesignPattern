package cn.md.CommandPattern;

import cn.md.CommandPattern.command.Command;
import cn.md.CommandPattern.command.commands.AddRequirementCommand;
import cn.md.CommandPattern.command.commands.ModPageCommand;
import cn.md.CommandPattern.invoker.Invoker;

/** 
 * <Description> <br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2017年2月9日 <br>
 * @since V1.0<br>
 * @see cn.md.CommandPattern <br>
 */
public class Client {

	/**
	 * Description: <br> 
	 * @author Jizuz<br>
	 * @param args <br>
	 */
	public static void main(String[] args) {
		Invoker invoker = new Invoker();

		Command command1 = new AddRequirementCommand();
		invoker.setCommand(command1);
		invoker.action();
		
		Command command2 = new ModPageCommand();
		invoker.setCommand(command2);
		invoker.action();
	}

}
