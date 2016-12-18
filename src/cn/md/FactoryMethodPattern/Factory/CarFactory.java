package cn.md.FactoryMethodPattern.Factory;

import java.util.List;
import java.util.Random;

import cn.md.FactoryMethodPattern.CarDAO.ICarsDAO;
import cn.md.util.ClassUtils;

/**
 * <Description> 汽车创建工厂类<br> 
 * @author Jesus<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月8日 <br>
 * @since V1.0<br>
 * @see cn.md.FactoryMethodPattern.Factory <br>
 */
public class CarFactory {

	/**
	 * Description: 创建指定的汽车<br> 
	 * @author Jesus<br>
	 * @param c Class<br>
	 * @return ICarsDAO<br>
	 */
	@SuppressWarnings("rawtypes")
	public static ICarsDAO createCar(Class c) {
		ICarsDAO car = null;
		 try {
			 car = (ICarsDAO) Class.forName(c.getName()).newInstance();
		 } catch (InstantiationException e) {
			 System.out.println("必须指定车的类型！");
		 } catch (IllegalAccessException e) {
			 System.out.println("车辆定义错误！");
		 } catch (ClassNotFoundException e) {
			 System.out.println("找不到车类型！");
		 }
		return car;
	}
	
	/**
	 * Description: 随机创建汽车<br> 
	 * @author Jesus<br>
	 * @return ICarsDAO<br>
	 */
	@SuppressWarnings("rawtypes")
	public static ICarsDAO createCar() {
		ICarsDAO car = null;
		List<Class> concreteCarList = ClassUtils.getAllClassByInterface(ICarsDAO.class);
		
		Random random = new Random();
		int rand = random.nextInt(concreteCarList.size());
		
		car = createCar(concreteCarList.get(rand));
		return car;
	}
}
