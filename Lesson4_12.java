/**
	代碼塊
	1.普通代碼塊，在方法中寫的代碼塊
	2.構造塊是在類中定義的代碼塊，在創建對象時被調用，優於構造方法執行
	3.靜態代碼塊,在第一次使用的時候(創建對象)，只會執行一次，優於構造塊執行,
		我們在項目開發中，通常會使用靜態代碼塊來初始化只調用一次的數據，比如說:
		小結:重點會使用的順序是靜態代碼塊，普通代碼塊，同步代碼塊，構造代碼塊
*/
public class Lesson4_12{
	public static void main(String[] args){
		Student s = new Student();
		
	}
	
}
class Student{
	static{
		System.out.println("我是靜態代碼塊");
	}
	
	{
		System.out.println("我是構造");
	}
	
	public Student(){
		System.out.println("構造方法");
	}
	
	public void study(){
		//限制作用域
		{
			int i=10;
			System.out.println("我是普通");
		}
		
	}
}
