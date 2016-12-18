package cn.md.FacadePattern.dao;

/** 
 * <Description> 信件处理步骤接口<br> 
 * @author Jesus<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月12日 <br>
 * @since V1.0<br>
 * @see cn.md.FacadePattern.dao <br>
 */
public interface ILetterProcess {

	/**
	 * Description: 写信<br> 
	 * @author Jesus<br>
	 * @param context String<br>
	 */
	public void writeLetter(String context);
	
	/**
	 * Description: 写地址<br> 
	 * @author Jesus<br>
	 * @param address String<br>
	 */
	public void writeAddress(String address);
	
	/**
	 * Description: 检查信件<br> 
	 * @author Jesus<br>
	 */
	public void checkLetter();
	
	/**
	 * Description: 信装进信封<br> 
	 * @author Jesus<br>
	 */
	public void letterIntoEnvelope();
	
	/**
	 * Description: 送信<br> 
	 * @author Jesus<br>
	 */
	public void sendLetter();
}
