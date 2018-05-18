/**
	�����]�p�Ҧ�
	1.�c�y��k�p����
	2.�n���@�ӥ�����H
	3.���~�����Ѥ@���R�A��k�����H���
	
	1.�j�~�� : �b���Q�[����A��H�Q�ЫءA��{�ǵ���������
	2.�i�~�� : �b�Ĥ@���ե�getInstance��k�ɡA��H�Q�ЫءA��{�ǵ���������
	
	�b���ؤ�������n�γ�ҡA��Ҧ�����n�B?
	1.�b�]�p�@�Ǥu�������ɭ�(�q�`�u�����A�u���\���k�A�S���ݩ�)
	2.�u�����i��Q�W�c�ե�
	�ت��O���F�`�٤��s���ƳЫع�H�ұa�Ӫ����s���ӡA�q�ӨӴ����Ĳv
	�ण��ϥκc�y��k�p����+�R�A��k�Ӵ��N���?
*/

public class Lesson4_13{
	public static void main(String[] args){
		Singleton2 s = Singleton2.getInstance();
		s.print();
		Singleton2 s1 = Singleton2.getInstance();
		System.out.println(s==s1);
	}
}
//�ϥκc�y��k�p����+�R�A��k �ӹ�{�u�����A��pMath
class Tools{
	private Tools(){}
	public static void print(){
		
	}
	public static void print2(){
		
	}
}


//�j�~�� :�e�Τ��s���ɶ����A�����Ĳv
class Singleton1{
	private Singleton1(){}
	private static Singleton1 s = new Singleton1();
	public static Singleton1 getInstance(){
		return s;
	}
	public void print(){
		System.out.println("���դ�k");
	}
}

//�i�~�� :�e�Τ��s���ɶ��u�A�Ĳv�C(�i�[���A����[��)
//�b�h�u�{�X�ݮɷ|���w�����D
class Singleton2{
	private Singleton2(){}
	private static Singleton2 s;
	public static Singleton2 getInstance(){
		if(s==null){
			s = new Singleton2();
		}
		return s;
	}
	public void print(){
		System.out.println("���դ�k");
	}
	
}