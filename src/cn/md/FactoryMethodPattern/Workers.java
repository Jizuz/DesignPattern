package cn.md.FactoryMethodPattern;

import cn.md.FactoryMethodPattern.CarDAO.ICarsDAO;
import cn.md.FactoryMethodPattern.CarDAO.impl.BusinessCar;
import cn.md.FactoryMethodPattern.CarDAO.impl.PrivateCar;
import cn.md.FactoryMethodPattern.CarDAO.impl.PublicCar;
import cn.md.FactoryMethodPattern.Factory.CarFactory;

/** 
 * <Description> <br> 
 * @author Jesus<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月8日 <br>
 * @since V1.0<br>
 * @see cn.md.FactoryMethodPattern <br>
 */
public class Workers {

	/**
	 * Description: <br> 
	 * @author Jesus<br>
	 * @param args <br>
	 */
	public static void main(String[] args) {
		
		System.out.println("-------------------private car-------------------------");
		ICarsDAO priCarDAO = CarFactory.createCar(PrivateCar.class);
		priCarDAO.brake();
		
		System.out.println("-------------------business car-------------------------");
		ICarsDAO bizCarDAO = CarFactory.createCar(BusinessCar.class);
		bizCarDAO.brake();
		bizCarDAO.travel();
		
		System.out.println("-------------------public car-------------------------");
		ICarsDAO pubCarDAO = CarFactory.createCar(PublicCar.class);
		pubCarDAO.brake();
		pubCarDAO.travel();
		
		System.out.println("-------------------random car-------------------------");
		for (int i = 0; i < 10; i++) {
			ICarsDAO carsDAO = CarFactory.createCar();
			carsDAO.brake();
			carsDAO.travel();
		}
	}

}
