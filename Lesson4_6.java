/**
	�c�y��k:�c�y��k�O�b�����w�q���A�c�y��k���w�q�榡:��k�W�ٻP���W�٬ۦP
	�A�L��^���������n��
*/
public class Lesson4_6{
	public static void main(String[] args){
		
		Dog dog = new Dog();
		Dog dog1 = new Dog("����",5);
	}

}

class Dog{
	//�q�{�c�y��k�A�q�`����L�c�y��k�ɡA�n�O�d�q�{
	public Dog(){
		System.out.println("�c�y��k����F");
	}
	public Dog(String name){
		this.name = name;
		System.out.println("�@�Ѽƺc�y��k����F");
	}
	public Dog(String name,int age){
		this(name);//�b�եΨ�L�c�y��k�ɡA���y�y�ݭn�b�Ĥ@�y�A�b�c�y��k���۽եήɥ����n���X�f
		//this.name = name;
		this.age = age;
		System.out.println("��Ѽƺc�y��k����F");
	}
	private String name;
	private int age;
	
	
	
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void run(int len){
		int m = len;
	}
	
}