package cn.md.FacadePattern;

import cn.md.FacadePattern.facade.PostOffice;

/** 
 * <Description> <br> 
 * @author Jesus<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月12日 <br>
 * @since V1.0<br>
 * @see cn.md.FacadePattern <br>
 */
public class Client {
	
	/**
	 * Description: <br> 
	 * @author Jesus<br>
	 * @param args <br>
	 */
	public static void main(String args[]) {

		PostOffice pst = new PostOffice();
		
		String context = "Hello,It's me,do you know who I am? I'm your old lover. I'd like to....";
		String address = "Zhengfang Road No.888, Jiangsu Province, Nanjing";

		pst.postSendLetter(context, address);
	}
	
	
}
