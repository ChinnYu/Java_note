/**
	final 關鍵字
	1.使用final 聲明一個屬性，就是常量，常量的命名規則建議使用全大寫,
	常量必須在定義時或構造器中初始化
	2.使用final聲明的方法，不能被子類重寫，只能被繼承
	3.使用final關鍵字聲明一個類，該類就轉為最終類，沒有子類的類，final修飾的類
	無法被繼承
*/
public class Lesson5_5{
	//private static final int PERSON_NUM = 10;
	public static void main(String[] args){
		System.out.println(Constant.PERSON_NUM);
		FinalClass fc = new FinalClass();
		fc.setLength(123);
	}
	
}

//常量類(工具類):在時記項目開發中，常量類通常用於定義項目中一些公共的，不變的數據

final class Constant{
	public static final int PERSON_NUM = 10;//人數
}

class FinalClass{
	public final int DAY_NUMBER ;//工作天數
	
	public FinalClass(){//通常不這樣用，因為就直接賦值了
		DAY_NUMBER = 22;
	}
	
	public final void print(){
		System.out.println("我是final");
	}
	public void setLength(final int size){
		
		size++;
		System.out.println(size);
	}
}
class SubClass extends FinalClass{
	/* public void print(){
		System.out.println("我是final");
	} */
}