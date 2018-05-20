/**
	抽象類: 用abstract 關鍵字聲明的類稱為抽象類,很多具有相同特徵和
	行為的對象可以抽象為一個類,很多具有相同特徵和行為的類可以抽象為一個抽象類(無法實體化)
	
*/

public class Lesson5_6{
	public static void main(String[] args){
		Man man = new Man();
		man.move();
		man.eat();
		Woman w = new Woman();
		w.move();
		w.eat();
	}
}

abstract class Animals{
	public abstract void move();//方法的聲明，抽象方法只有聲明，沒有實現
}

abstract class Person extends Animals{
	public abstract void eat();
	public void sleep(){
		System.out.println("我是sleep");
	}
}
//繼承抽象類的具體類必須實現所有抽象方法
class Man extends Person{
	public void move(){
		System.out.println("我是man 跑");
	}
	public void eat(){
		System.out.println("我是man 吃");
	}
}

class Woman extends Person{
	public void move(){
	System.out.println("我是Woman 逛");
	}
	public void eat(){
		System.out.println("我是Woman 吃");
	}
}