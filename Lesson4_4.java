/**
	封裝性
	如果屬性沒有封裝，那麼在本類之外創建對象後，可以直接訪問屬性
	private 關鍵字:訪問權限修飾符 ,public 表示公有的 private表示私有的屬性或方法 ，
	只能在本類中訪問，公有的屬性和方法，可以被類外部的其他類訪問，想要在類外部訪問
	私有屬性，我們需要提供公有方法來間接訪問
	通常在一個類中，屬性都私有化，並對外提供getter and setter方法
*/
public class Lesson4_4{
	public static void main(String[] args){
		
		Person p1= new Person();
		//p1.name = "飛飛";
		//p1.age = 16;
		p1.setName("飛飛");
		p1.setAge(16);
	}

}

//沒有方裝之前
class Person{
	//屬性的封裝
	private String name;//成員變量,類中定義
	private int age;//成員變量,類中定義
	
	//getter and setter
	
	//對外提供一個為name屬性設值的方法
	public void setName(String name){
		this.name = name;
	}
	//對外提供一個獲取name屬性的方法
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void run(int len){//參數也是局部變量
		int m = len;//m也是局部變量
	}
	
}