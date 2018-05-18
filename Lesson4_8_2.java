/**
	String傳遞
	字符串本身就是一個對象
*/
public class Lesson4_8_2{
	public static void main(String[] args){
		String name = "小飛";
		method(name);
		System.out.println("Name="+name);
	}
	public static void method(String sname){
		sname="小倍";
	}
}

