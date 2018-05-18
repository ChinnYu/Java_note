public class Lesson4_2{
	public static void main(String[] args){
		Horse h= null;//聲明一個類的變量(除了八種基本數據類型以外，都是引用數據類型，包括數組)
		//創建一個Horse類型的對象，實例對象
		h=new Horse();
		//有了對象，我們就可以調用對象的屬性和方法
		h.name = "馬";
		h.age = 123;
		h.run();

		//匿名對象 只能使用一次，用完後，該對象就會被釋放
		new Horse().eat();

		h=null;//對象釋放
		
		Horse h1=new Horse();
		Horse h2=null;
		h1.name="小白";
		h1.age=4;
		h2=h1;
		h2.name="小黑";//對象之間的賦值，相同類型才可以賦值
		System.out.println(h1.name);
	}

}
class Horse{
	String name;//字符串式引用類型變量，不是基本數據類型變量
	int age;
	public void run(){
		System.out.println("我是"+name+",我"+age+"歲了");
	}
	public void eat(){
		System.out.println("我吃好多草");
	}
}