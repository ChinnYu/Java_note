/**
	���f
*/

public class Lesson5_7{
	public static void main(String[] args){
		Girl g = new Girl("jie");
		g.sleep();
		g.eat();
		g.run();
		g.print();
	}
}

interface IEat{
	//public abstract void eat();//���f���u��w�q��H��k
	void eat();//���f���w�q����k�S���n���׹���,�q�{��public abstract
	public static final int Num = 10;//���f���w�q�@�ӱ`�q
	int NUM = 10;//�`�q
	public default void print(){//JDK1.8��s�S�ʡA�i�H�Q�Ҧ���{���~��
		System.out.println("eat");//��{������{���f����
	}
}

interface IRun extends IEat{
	void run();
}
//���f�����i�H�h�~��(�`�N:���u����~��)
interface ISleep extends IEat,IRun{
	void sleep();
}

//��������{���f������{���f���Ҧ���k
class Girl implements ISleep,IEat{
	private String name;
	public Girl(){}
	public Girl(String name){
		this.name = name;
	}
	public void sleep(){
		System.out.println("�ڷR��ı");
	}
	
	public void eat(){
		System.out.println("�ڬO"+name+"�ڷR�Y");
	}
	
	public void run(){
		System.out.println("�]�]");
	}
	
}