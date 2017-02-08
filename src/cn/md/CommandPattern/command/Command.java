package cn.md.CommandPattern.command;

import cn.md.CommandPattern.receiver.groups.CodeGroup;
import cn.md.CommandPattern.receiver.groups.PageGroup;
import cn.md.CommandPattern.receiver.groups.RequirementGroup;

/** 
 * <Description> <br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2017年2月9日 <br>
 * @since V1.0<br>
 * @see cn.md.CommandPattern.command <br>
 */
public abstract class Command {

	protected RequirementGroup rg = new RequirementGroup();
	
	protected PageGroup pg = new PageGroup();
	
	protected CodeGroup cg = new CodeGroup();
	
	public abstract void execute();
}
