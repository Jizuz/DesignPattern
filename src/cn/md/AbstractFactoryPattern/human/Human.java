package cn.md.AbstractFactoryPattern.human;

/** 
 * <Description> <br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月9日 <br>
 * @since V1.0<br>
 * @see cn.md.AbstractFactoryPattern.human <br>
 */
public interface Human {
	/**
	 * Description: 人类会笑<br> 
	 * @author Jizuz<br> <br>
	 */
	public void laugh();

	/**
	 * Description: 人类会哭<br> 
	 * @author Jizuz<br> <br>
	 */
	public void cry();

	/**
	 * Description: 人类会交谈<br> 
	 * @author Jizuz<br> <br>
	 */
	public void talk();

	/**
	 * Description: 人类有性别<br> 
	 * @author Jizuz<br> <br>
	 */
	public void sex();
}
