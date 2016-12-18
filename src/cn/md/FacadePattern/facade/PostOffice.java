package cn.md.FacadePattern.facade;

import cn.md.FacadePattern.dao.ILetterProcess;
import cn.md.FacadePattern.dao.impl.LetterProcess;

/** 
 * <Description> 邮局<br> 
 * @author Jesus<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月12日 <br>
 * @since V1.0<br>
 * @see cn.md.FacadePattern.facade <br>
 */
public class PostOffice {

	/**
	 * letterUnionProcess 邮局信件统一处理
	 */
	ILetterProcess letterUnionProcess = new LetterProcess();
	
	/**
	 * Description: 邮局一体化处理送信<br> 
	 * @author Jesus<br>
	 * @param context String<br>
	 * @param address String<br>
	 */
	public void postSendLetter(String context, String address) {
		/**
		 * 写信
		 */
		letterUnionProcess.writeLetter(context);
		
		/**
		 * 写地址
		 */
		letterUnionProcess.writeAddress(address);
		
		/**
		 * 检查信件
		 */
		letterUnionProcess.checkLetter();
		
		/**
		 * 装信件
		 */
		letterUnionProcess.letterIntoEnvelope();
		
		/**
		 * 送信
		 */
		letterUnionProcess.sendLetter();
	}
}
