/**
	�����D: overloading�Moverriding���ϧO?
	overloading:��k������,�o�ͦb�P�@������,��k�W�ۦP�A�ѼƦC���P�A�P��^�ȵL���C
	overloading: ��k�����g�A�o�ͦb�l�������A��k�W�ۦP�A�ѼƦC��ۦP�A
	��^�ȬۦP�A�l�����X�ݭ׹��ŭn�j��ε�������A�l�������`�n�������p��ε������
	�����`�n��,�p�G��k�Qprivate,static,final�׹��A���򤣯�Q���g
*/

public class Lesson5_3{
	public static void main(String[] args){
		HomeDog hg=new HomeDog("����");
		hg.print();
		hg.eat();
		//Dog d=new Dog();
		//d.name="sd";
		HuskyDog kd = new HuskyDog();
		kd.eat();
	}
	
}

class Dog{
	protected String name;
	private String sex;
	public Dog(String name,String sex){
		this.name = name;
		this.sex = sex;
		System.out.println("�ڬODog�c�y");
	}
	protected void eat(){
		System.out.println("�Y��");
	}
}
class HomeDog extends Dog{
	public HomeDog(String name){
		super(name,"��");//�u��b�Ĥ@�y
		System.out.println("�ڬOHomeDog�c�y");
	}
	public void print(){
		//super.�ݩ� ��ܽեΤ������ݩʡA�p�G�O�~�ӹL�Ӫ��ݩʡA����super�i�H�ٲ�
		System.out.println(super.name+"�ڬO�@����");
	}
	//���g������k
	public void eat(){
		super.eat();//�եΤ����o��k
		System.out.println("�ڬO�a���A�ڳ��w�Y���Y");
	}
}
class HuskyDog extends Dog{
	public HuskyDog(){
		super("���h�_","��");
		System.out.println("�ڬOHuskyDog�c�y");
	}
	public void show(){
		System.out.println("�ڬO���h�_");
	}
	public void eat(){
		System.out.println("�ڬOHusky���A�ڳ��w�Y���x");
	}
}