/**
	��H��: ��abstract ����r�n�������٬���H��,�ܦh�㦳�ۦP�S�x�M
	�欰����H�i�H��H���@����,�ܦh�㦳�ۦP�S�x�M�欰�����i�H��H���@�ө�H��(�L�k�����)
	
*/

public class Lesson5_6{
	public static void main(String[] args){
		Man man = new Man();
		man.move();
		man.eat();
		Woman w = new Woman();
		w.move();
		w.eat();
	}
}

abstract class Animals{
	public abstract void move();//��k���n���A��H��k�u���n���A�S����{
}

abstract class Person extends Animals{
	public abstract void eat();
	public void sleep(){
		System.out.println("�ڬOsleep");
	}
}
//�~�ө�H����������������{�Ҧ���H��k
class Man extends Person{
	public void move(){
		System.out.println("�ڬOman �]");
	}
	public void eat(){
		System.out.println("�ڬOman �Y");
	}
}

class Woman extends Person{
	public void move(){
	System.out.println("�ڬOWoman �}");
	}
	public void eat(){
		System.out.println("�ڬOWoman �Y");
	}
}