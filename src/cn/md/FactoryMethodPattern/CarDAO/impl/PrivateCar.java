package cn.md.FactoryMethodPattern.CarDAO.impl;

import cn.md.FactoryMethodPattern.CarDAO.ICarsDAO;

/** 
 * <Description> <br> 
 * @author Jesus<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月8日 <br>
 * @since V1.0<br>
 * @see cn.md.FactoryMethodPattern.CarDAO.impl <br>
 */
public class PrivateCar implements ICarsDAO {

	/**
	 * Description: <br> 
	 * @author Jesus<br> <br>
	 */
	public void brake() {
		System.out.println("私家车刹车！");
	}

	/**
	 * Description: <br> 
	 * @author Jesus<br> <br>
	 */
	public void travel() {
		System.out.println("私家车行驶！");
	}

}
