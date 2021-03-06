package cn.md.CommandPattern.command.commands;

import cn.md.CommandPattern.command.Command;

/** 
 * <Description> <br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2017年2月9日 <br>
 * @since V1.0<br>
 * @see cn.md.CommandPattern.command.commands <br>
 */
public class ModPageCommand extends Command {

	/**
	 * Description: 执行修改页面的命令<br> 
	 * @author Jizuz<br>
	 */
	public void execute() {
		
		super.pg.find();
		
		super.pg.mod();
		
		super.pg.plan();
	}

}
