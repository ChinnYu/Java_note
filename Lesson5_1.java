/**
	�~��:�~�ӬO�q�w�������Ыطs�����L�{
	�~�Ӥ@�Ӥ����A�u���~�ӫD�p�����ƾ�(�ݩʩM��k)
	protected �X���v���׹���,�b�~�����Y���ϥΡA�b�������ϥ�protected�׹����ݩ�
	�Τ�k�i�H�Q�l���~��
	�Ыؤl����H�ɡA�������c�y��k�]�|�Q�եΡA������?
	�]���l���n�ϥΨ�������ƾڡA����N�n�q�L�������c�y��k�Ӫ�l�Ƽƾ�
	�p�G�Ыؤl����H�ɨϥ��q�{���c�y��k�A����������q�{�c�y��k�]�|�Q�ե�
	�p�G�Ыؤl����H�ϥΪ��O�a�Ѽƪ��c�y��k�A����������q�{�c�y��k�]�|�Q�ե�
	�p�G�Ыؤl����H�ɷ|�եΤ������q�{�c�y��k
	
	��������S���L�Ѻc�y��k�ɡA�l��������ܪ��եΤ������a�Ѻc�y��k�A���ե�?
	�i�H�b�l������ܪ��ϥ�super(....)�եΤ������c�y��k�A�u��X�{�b�Ĥ@�y�����Ĥ@�y
*/

public class Lesson5_1{
	public static void main(String[] args){
		HomeDog hg=new HomeDog("����");
		hg.print();
		hg.eat();
		//Dog d=new Dog();
		//d.name="sd";
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
	public void eat(){
		System.out.println("�Y��");
	}
}
class HomeDog extends Dog{
	public HomeDog(String name){
		super(name,"��");//�u��b�Ĥ@�y
		System.out.println("�ڬOHomeDog�c�y");
	}
	public void print(){
		System.out.println(name+"�ڬO�@����");
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
}