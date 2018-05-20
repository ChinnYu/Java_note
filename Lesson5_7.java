/**
	接口
*/

public class Lesson5_7{
	public static void main(String[] args){
		Girl g = new Girl("jie");
		g.sleep();
		g.eat();
		g.run();
		g.print();
	}
}

interface IEat{
	//public abstract void eat();//接口中只能定義抽象方法
	void eat();//接口中定義的方法沒有聲明修飾符,默認為public abstract
	public static final int Num = 10;//接口中定義一個常量
	int NUM = 10;//常量
	public default void print(){//JDK1.8後新特性，可以被所有實現類繼承
		System.out.println("eat");//實現類為實現接口的類
	}
}

interface IRun extends IEat{
	void run();
}
//接口之間可以多繼承(注意:類只能單繼承)
interface ISleep extends IEat,IRun{
	void sleep();
}

//具體類實現接口必須實現接口的所有方法
class Girl implements ISleep,IEat{
	private String name;
	public Girl(){}
	public Girl(String name){
		this.name = name;
	}
	public void sleep(){
		System.out.println("我愛睡覺");
	}
	
	public void eat(){
		System.out.println("我是"+name+"我愛吃");
	}
	
	public void run(){
		System.out.println("跑跑");
	}
	
}