package cn.md.AbstractFactoryPattern.factory;

/** 
 * <Description> 列出世界上有哪些类型的人<br> 
 * @author Jizuz<br>
 * @version 1.0<br>
 * @CreateDate 2016年12月9日 <br>
 * @since V1.0<br>
 * @see cn.md.AbstractFactoryPattern.factory <br>
 */
public enum HumanEnum {

	YellowMaleHuman("cn.md.AbstractFactoryPattern.human.extend.YellowMaleHuman"),
	
	YellowFemaleHuman("cn.md.AbstractFactoryPattern.human.extend.YellowFemaleHuman"),
	
	WhiteMaleHuman("cn.md.AbstractFactoryPattern.human.extend.WhiteMaleHuman"),
	
	WhiteFemaleHuman("cn.md.AbstractFactoryPattern.human.extend.WhiteFemaleHuman"),
	
	BlackMaleHuman("cn.md.AbstractFactoryPattern.human.extend.BlackMaleHuman"),
	
	BlackFemaleHuman("cn.md.AbstractFactoryPattern.human.extend.BlackFemaleHuman");
	
	/**
	 * value
	 */
	private String value = "";

	/**
	 * 定义构造函数，目的是Data(value)类型的相匹配<br>
	 * @param value<br>
	 */
	private HumanEnum(String value){
		this.value = value;
	}
	
	/**
	 * Description: <br> 
	 * @author Jizuz<br>
	 * @return String<br>
	 */
	public String getValue(){
		return this.value;
	}
}
