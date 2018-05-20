/**
	Object ��H
*/
public class Lesson5_12{
	public static void main(String[] args){
		Student s = new Student(1,"����",18);
		System.out.println(s);//s.toString�i������s�ٲ�toString
		Student s2 = new Student(1,"����",18);
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
	//���gobject������toString��k
	public String toString(){
		return "sid="+sid+",name="+name+",age"+age;
	}
	
	//���gobject������equals��k,�ӹ�{��ӹ�H�����
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