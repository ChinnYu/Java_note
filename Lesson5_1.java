/**
	繼承:繼承是從已有的類創建新類的過程
	繼承一個父類，只能繼承非私有的數據(屬性和方法)
	protected 訪問權限修飾符,在繼承關係中使用，在父類中使用protected修飾的屬性
	或方法可以被子類繼承
	創建子類對象時，父類的構造方法也會被調用，為什麼?
	因為子類要使用到父類的數據，那麼就要通過父類的構造方法來初始化數據
	如果創建子類對象時使用默認的構造方法，那麼父類的默認構造方法也會被調用
	如果創建子類對象使用的是帶參數的構造方法，那麼父類的默認構造方法也會被調用
	如果創建子類對象時會調用父類的默認構造方法
	
	當父類中沒有無參構造方法時，子類必須顯示的調用父類的帶參構造方法，怎麼調用?
	可以在子類中顯示的使用super(....)調用父類的構造方法，只能出現在第一句中的第一句
*/

public class Lesson5_1{
	public static void main(String[] args){
		HomeDog hg=new HomeDog("旺旺");
		hg.print();
		hg.eat();
		//Dog d=new Dog();
		//d.name="sd";
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
	public void eat(){
		System.out.println("吃飯");
	}
}
class HomeDog extends Dog{
	public HomeDog(String name){
		super(name,"公");//只能在第一句
		System.out.println("我是HomeDog構造");
	}
	public void print(){
		System.out.println(name+"我是一隻狗");
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
}