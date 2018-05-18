/**
	構造方法:構造方法是在類中定義的，構造方法的定義格式:方法名稱與類名稱相同
	，無返回值類型的聲明
*/
public class Lesson4_6{
	public static void main(String[] args){
		
		Dog dog = new Dog();
		Dog dog1 = new Dog("旺旺",5);
	}

}

class Dog{
	//默認構造方法，通常有其他構造方法時，要保留默認
	public Dog(){
		System.out.println("構造方法執行了");
	}
	public Dog(String name){
		this.name = name;
		System.out.println("一參數構造方法執行了");
	}
	public Dog(String name,int age){
		this(name);//在調用其他構造方法時，此語句需要在第一句，在構造方法互相調用時必須要有出口
		//this.name = name;
		this.age = age;
		System.out.println("兩參數構造方法執行了");
	}
	private String name;
	private int age;
	
	
	
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void run(int len){
		int m = len;
	}
	
}