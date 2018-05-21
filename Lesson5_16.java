/**
	內部類(只有內部類可以用靜態,外部類不行)
	1.成員內部類: 直接在類中定義的類
	2.方法內部類 : 在一個類中的方法內定義一個類
		(1)方法內部類只能在定義該內部的方法內實例化,不可以在此方法外
		對其實例化
		(2)方法內部類對象不能使用該內部類所在方法的非final局部變量(i.e 只能用final)
	3.靜態內部類 : 在類中定義一個靜態修飾的內部類,
		(1)靜態的含意是該內部類可以向其他靜態成員一樣,沒有外部類對象時,也能夠訪問他
		(2)靜態嵌套類僅能訪問外部類的靜態成員和方法。
	4.匿名內部類就是沒有名子的內部類
		匿名內部類的三種情況
		(1)繼承式的匿名內部類
		(2)接口式的暱名內部類
		(3)參數式的暱名內部類
*/
public class Lesson5_16{
	public static void main(String[] args){
		Outer outer = new Outer();
		//在外部創建成員內部類的實例,因為成員內部類需要依賴外部類的對象
		//通常情況下,我們不建議這樣來實力化內部類的對象( 因為這樣很亂)
		//Outer.Inner inner = outer.new Inner();
		//inner.print();
		
		outer.innerPrint();
		outer.show();
		
		Outer.Inner3 inner3 = new Outer.Inner3();
		inner3.print();
		
		outer.print1();
		outer.print2();
		//參數式的暱名內部類
		outer.print3(new Eat(){
			public void eat(){
				System.out.println("eat:參數式匿名內部類");
			}
		});
	}
}

class Outer{
	private String name="outer";
	
	//-------------- 成員內部類--------------------------------------------
	//建議在外部類中定義一個方法，對外提供訪問內部類的接口
	public void innerPrint(){//封裝內部類(相對來講就是隱藏內部類，不對外公開)
		Inner inner = new Inner();
		inner.print();
	}
	
	//成員內部類
	private class Inner{
		public void print(){
			System.out.println("成員內部類"+name);
		}
	}
	
	//-------------- 方法內部類--------------------------------------------
	//show方法的局部變量或方法的參數,實際必須是常量 final
	public void show(){
		final int x= 10;//原本是要寫final ,但JDK1.8後 就預設這裡面即是final(可不寫)
		class Inner2{
			public void print(){
				//x++;//從內部類引用的本地變量必須是最終變量或實際上的最終變量
				System.out.println("方法內部類"+x+name);
			}
		}
		Inner2 inner2 = new Inner2();
		inner2.print();
	}
	
	//-------------- 靜態內部類--------------------------------------------
	//無法從靜態上下文中引用非靜態變量(i.e.只能使用靜態變量)
	static class Inner3{
		public void print(){
			System.out.println("靜態內部類");
		}
	}
	//-------------- 匿名內部類--------------------------------------------
	//繼承式
	public void print1(){
		Cat cat = new Cat(){//abstract類 無法自己實體化 //大括號表示實現
			public void eat(){
				System.out.println("eat:繼承式匿名內部類");
			}
		};//一定要加分號
		cat.eat();
	}
	//接口式
	public void print2(){
		Eat eat = new Eat(){
			public void eat(){
				System.out.println("eat:接口式匿名內部類");
			}
		};
		eat.eat();
	}
	
	//參數式
	public void print3(Eat eat){
		eat.eat();
	}
	
}

interface Eat{
	public void eat();
}

abstract class Cat{
	public abstract void eat();
}