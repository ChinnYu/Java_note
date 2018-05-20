/**
	Object 對象
*/
public class Lesson5_12{
	public static void main(String[] args){
		Student s = new Student(1,"飛飛",18);
		System.out.println(s);//s.toString可直接打s省略toString
		Student s2 = new Student(1,"飛飛",18);
		boolean b = s.equals(s2);
		System.out.println(b);
		System.out.println(s.getClass());
	}

}

class Student{
	
	private String name;
	private int sid;
	private int age;
	public Student(){}
	public Student(int sid,String name,int age){
		this.sid = sid;
		this.name = name;
		this.age = age;
	}
	//重寫object類中的toString方法
	public String toString(){
		return "sid="+sid+",name="+name+",age"+age;
	}
	
	//重寫object類中的equals方法,來實現兩個對象的比較
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(obj instanceof Student){
			Student s =(Student)obj;
			if(!this.name.equals(s.name)){
				return false;
			}else if(this.sid!=s.sid){
				return false;
			}else if(this.age!=s.age){
				return false;
			}
			return true;
		}
		return false;
	}
}