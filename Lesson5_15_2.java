/**
	適配器模式(Adapter):將一個類的接口轉換成客戶希望的另外一個接口。
	適配器模式使得原本由於接口不兼容而不能在一起工作的那些類可以一起工作
*/
public class Lesson5_15_2{
	public static void main(String[] args){
		
	}
}

interface Animal{//因為太多function 在實體化時麻煩 ，所以建個適配器用繼承重寫
	public void sing();
	public void cry();
	public void run();
	public void swim();
}
//適配器
abstract class AnimalsFunction{
	public void sing(){}
	public void cry(){}
	public void run(){}
	public void swim(){}
}
class Dog extends AnimalsFunction{
	public void run(){
		System.out.println("我是瘋狗");
	}
}