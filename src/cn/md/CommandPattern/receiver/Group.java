package cn.md.CommandPattern.receiver;

/** 
 * <Description> <br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2017年2月9日 <br>
 * @since V1.0<br>
 * @see cn.md.CommandPattern.receiver <br>
 */
public abstract class Group {

	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	public abstract void find();
	
	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	public abstract void add();
	
	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	public abstract void mod();
	
	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	public abstract void del();
	
	/**
	 * Description: <br> 
	 * @author Jizuz<br> <br>
	 */
	public abstract void plan();
}
