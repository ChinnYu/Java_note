/**
	面試題: overloading和overriding的區別?
	overloading:方法的重載,發生在同一個類中,方法名相同，參數列表不同，與返回值無關。
	overloading: 方法的重寫，發生在子父類中，方法名相同，參數列表相同，
	返回值相同，子類的訪問修飾符要大於或等於父類，子類的異常聲明必須小於或等於父類
	的異常聲明,如果方法被private,static,final修飾，那麼不能被重寫
*/

public class Lesson5_3{
	public static void main(String[] args){
		HomeDog hg=new HomeDog("旺旺");
		hg.print();
		hg.eat();
		//Dog d=new Dog();
		//d.name="sd";
		HuskyDog kd = new HuskyDog();
		kd.eat();
	}
	
}

class Dog{
	protected String name;
	private String sex;
	public Dog(String name,String sex){
		this.name = name;
		this.sex = sex;
		System.out.println("我是Dog構造");
	}
	protected void eat(){
		System.out.println("吃飯");
	}
}
class HomeDog extends Dog{
	public HomeDog(String name){
		super(name,"公");//只能在第一句
		System.out.println("我是HomeDog構造");
	}
	public void print(){
		//super.屬性 表示調用父類的屬性，如果是繼承過來的屬性，那麼super可以省略
		System.out.println(super.name+"我是一隻狗");
	}
	//重寫父類方法
	public void eat(){
		super.eat();//調用父類得方法
		System.out.println("我是家狗，我喜歡吃骨頭");
	}
}
class HuskyDog extends Dog{
	public HuskyDog(){
		super("哈士奇","母");
		System.out.println("我是HuskyDog構造");
	}
	public void show(){
		System.out.println("我是哈士奇");
	}
	public void eat(){
		System.out.println("我是Husky狗，我喜歡吃雞肝");
	}
}