/**
	this關鍵字
	調用類中的屬性
	調用類中的方法與構造方法
	表示當前對象:在方法被調用的過程中，哪個對象調用了方法，在方法內的this就表示誰
	類名.this
*/
public class Lesson4_7{
	public static void main(String[] args){
		
		Cat cat = new Cat();
		cat.setName("咪咪");
		cat.setAge(3);
		cat.eat();
	}

}

class Cat{
	
	private String name;
	private int age;
	
	public void setName(String name){ //name=咪咪
		this.name = name;//this 代表的是當前對象
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
	public void eat(){
		//在方法中使用this調用類中的其他方法或屬性，this 可以省略,this前面可以使用當前的類名.this
		//在後面的內部類知識點中會涉及到
		System.out.println("我是"+Cat.this.getName()+"吃魚");
		System.out.println("我是"+name+"吃魚");
	}
	
}