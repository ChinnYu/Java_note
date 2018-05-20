/**
	多態性
*/

public class Lesson5_9{
	public static void main(String[] args){
		Chicken hc = new HomeChicken("小雞雞");
		Chicken yc = new YeChicken("大雞雞");
		eat(hc);
		eat(yc);
		Chicken jc = new JianChicken("尖叫雞");
		eat(jc);
	}
	
	public static void eat(Chicken c){
		System.out.println("雞吃飯");
		c.eat();
		
		//當我們需要把父類的實例強制轉換為子類引用時，
		//為了避免類型轉換異常 java.lang.ClasscastException
		//那麼我們需要在轉換之前作類型檢查(判斷)
		if(c instanceof JianChicken){//成立的條件是，對象是本身即對象的父類型，都可以通過檢查
			JianChicken jc = (JianChicken)c;
			jc.song();
		}
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