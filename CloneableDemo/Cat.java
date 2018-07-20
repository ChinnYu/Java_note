package com.jason;
/**
 * 
 * @author Liu
 * @description
 *   對象須具備克隆功能:
 *  1.實現Cloneable接口,(標記接口)
 *  2.重寫Object類中的clone方法
 */
public class Cat implements Cloneable{
	private String name;
	private int age;
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//重寫Object中的clone方法,也是標記方法
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
	
	
}
