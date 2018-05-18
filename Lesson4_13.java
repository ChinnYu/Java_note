/**
	單類設計模式
	1.構造方法私有化
	2.聲明一個本類對象
	3.給外部提供一個靜態方法獲取對象實例
	
	1.餓漢式 : 在類被加載後，對象被創建，到程序結束後釋放
	2.懶漢式 : 在第一次調用getInstance方法時，對象被創建，到程序結束後釋放
	
	在項目中為什麼要用單例，單例有什麼好處?
	1.在設計一些工具類的時候(通常工具類，只有功能方法，沒有屬性)
	2.工具類可能被頻繁調用
	目的是為了節省內存重複創建對象所帶來的內存消耗，從而來提高效率
	能不能使用構造方法私有化+靜態方法來替代單例?
*/

public class Lesson4_13{
	public static void main(String[] args){
		Singleton2 s = Singleton2.getInstance();
		s.print();
		Singleton2 s1 = Singleton2.getInstance();
		System.out.println(s==s1);
	}
}
//使用構造方法私有化+靜態方法 來實現工具類，比如Math
class Tools{
	private Tools(){}
	public static void print(){
		
	}
	public static void print2(){
		
	}
}


//餓漢式 :占用內存的時間長，提高效率
class Singleton1{
	private Singleton1(){}
	private static Singleton1 s = new Singleton1();
	public static Singleton1 getInstance(){
		return s;
	}
	public void print(){
		System.out.println("測試方法");
	}
}

//懶漢式 :占用內存的時間短，效率低(懶加載，延遲加載)
//在多線程訪問時會有安全問題
class Singleton2{
	private Singleton2(){}
	private static Singleton2 s;
	public static Singleton2 getInstance(){
		if(s==null){
			s = new Singleton2();
		}
		return s;
	}
	public void print(){
		System.out.println("測試方法");
	}
	
}