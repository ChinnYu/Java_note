/**
	多態性
*/

public class Lesson5_8{
	public static void main(String[] args){
		//用父類的引用指向子類對象(用大的類型表是小的類型),自動轉換(向上轉型)
		Chicken hc = new HomeChicken("小雞雞");
		//hc.eat();
		
		Chicken yc = new YeChicken("大雞雞");
		//yc.eat();
		//hc=yc;
		//hc.eat();
		//eat(hc);
		//eat(yc);
		Chicken jc = new JianChicken("尖叫雞");
		eat(jc);
	}
	//抽象(粒度) //面向抽象編程(面向接口編成)
	public static void eat(Chicken c){
		System.out.println("雞吃飯");
		c.eat();
		JianChicken jc = (JianChicken)c;//大的類型轉換為小的類型,強制轉換(向下轉型)
		jc.song();
	}
}
//雞
abstract class Chicken{
	private String name;
	public Chicken(){}
	
	public Chicken(String name){
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public abstract void eat();
}

//家雞
class HomeChicken extends Chicken{
	
	public HomeChicken(String name){
		super(name);
	}
	public void eat(){
		System.out.println(this.getName()+",我愛吃米");
	}
}

//野雞
class YeChicken extends Chicken{
	
	public YeChicken(String name){
		super(name);
	}
	
	public void eat(){
		System.out.println(this.getName()+",我愛蟲");
	}
	
}

//
class JianChicken extends Chicken{
	public JianChicken(String name){
		super(name);
	}
	public void eat(){
		System.out.println(this.getName()+",我步吃");
	}
	public void song(){
		System.out.println("我叫");
	}
}