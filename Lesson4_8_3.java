/**
	String�ǻ�
	
*/
public class Lesson4_8_3{
	public static void main(String[] args){
		Person1 p = new Person1();
		method(p);
		System.out.println("Name="+p.name);
	}
	public static void method(Person1 per){
		per.name="�p��";
	}
	
}
class Person1{
	String name ="����";
}
