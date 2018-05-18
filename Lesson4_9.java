/**
	兩個物件之間的一對一關係
	比如:一個英雄（Hero)對一個兵器(Weapon)
	雙向一對一
	單向一對一
*/
public class Lesson4_9{
	public static void main(String[] args){
		
		Hero hero= new Hero("劉備",300);
		Weapon weapon = new Weapon("雙股劍",3);
		
		//把兩個對象關連起來
		hero.setWeapon(weapon);
		weapon.setHero(hero);
		
		//通過英雄來獲取訊息
		String name = hero.getName();
		int age = hero.getAge();
		Weapon w = hero.getWeapon();
		System.out.println("Name="+name+" 歲"+age+"武器"+w.getName()+" 排行"+w.getGrade());
		
	}

}


class Hero{
	
	private String name;
	private int age;
	private Weapon weapon;//一對一關係
	
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