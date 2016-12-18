package cn.md.FacadePattern.dao.impl;

import cn.md.FacadePattern.dao.ILetterProcess;

/** 
 * <Description> 信件处理步骤实现<br> 
 * @author Jesus<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月12日 <br>
 * @since V1.0<br>
 * @see cn.md.FacadePattern.dao.impl <br>
 */
public class LetterProcess implements ILetterProcess {

	/**
	 * Description: 写信<br> 
	 * @author Jesus<br>
	 * @param context String<br>
	 */
	public void writeLetter(String context) {
		System.out.println("填写信的内容: \n" + context + ";");
	}

	/**
	 * Description: 写地址<br> 
	 * @author Jesus<br>
	 * @param address String<br>
	 */
	public void writeAddress(String address) {
		System.out.println("填写收件地址: \n" + address + ";");
	}

	/**
	 * Description: 检查信件<br> 
	 * @author Jesus<br>
	 */
	public void checkLetter() {
		System.out.println("检查信件;");		
	}

	/**
	 * Description: 信装进信封<br> 
	 * @author Jesus<br>
	 */
	public void letterIntoEnvelope() {
		System.out.println("信件装进信封;");
	}

	/**
	 * Description: 送信<br> 
	 * @author Jesus<br>
	 */
	public void sendLetter() {
		System.out.println("送信;");
	}

}
