/**
	this����r
	�ե��������ݩ�
	�ե���������k�P�c�y��k
	��ܷ�e��H:�b��k�Q�եΪ��L�{���A���ӹ�H�եΤF��k�A�b��k����this�N��ܽ�
	���W.this
*/
public class Lesson4_7{
	public static void main(String[] args){
		
		Cat cat = new Cat();
		cat.setName("�}�}");
		cat.setAge(3);
		cat.eat();
	}

}

class Cat{
	
	private String name;
	private int age;
	
	public void setName(String name){ //name=�}�}
		this.name = name;//this �N���O��e��H
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
	public void eat(){
		//�b��k���ϥ�this�ե���������L��k���ݩʡAthis �i�H�ٲ�,this�e���i�H�ϥη�e�����W.this
		//�b�᭱�������������I���|�A�Ψ�
		System.out.println("�ڬO"+Cat.this.getName()+"�Y��");
		System.out.println("�ڬO"+name+"�Y��");
	}
	
}