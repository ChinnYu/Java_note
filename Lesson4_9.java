/**
	��Ӫ��󤧶����@��@���Y
	��p:�@�ӭ^���]Hero)��@�ӧL��(Weapon)
	���V�@��@
	��V�@��@
*/
public class Lesson4_9{
	public static void main(String[] args){
		
		Hero hero= new Hero("�B��",300);
		Weapon weapon = new Weapon("���ѼC",3);
		
		//���ӹ�H���s�_��
		hero.setWeapon(weapon);
		weapon.setHero(hero);
		
		//�q�L�^��������T��
		String name = hero.getName();
		int age = hero.getAge();
		Weapon w = hero.getWeapon();
		System.out.println("Name="+name+" ��"+age+"�Z��"+w.getName()+" �Ʀ�"+w.getGrade());
		
	}

}


class Hero{
	
	private String name;
	private int age;
	private Weapon weapon;//�@��@���Y
	
	public void setWeapon(Weapon weapon){
		this.weapon=weapon;
	}
	
	public Weapon getWeapon(){
		return weapon;
	}
	public Hero(){}
	public Hero(String name,int age){
		this.name=name;
		this.age=age;
	}
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

class Weapon{
	
	private String name;
	private int grade;
	private Hero hero;
	public void setHero(Hero hero){
		this.hero=hero;
	}
	public Hero getHero(){
		return hero;
	}
	public Weapon(){}
	public Weapon(String name,int grade){
		this.name=name;
		this.grade=grade;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	public void setGrade(int grade){
		this.grade = grade;
	}
	public int getGrade(){
		return grade;
	}
	
	
}