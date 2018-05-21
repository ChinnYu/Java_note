/**
	������(�u���������i�H���R�A,�~��������)
	1.����������: �����b�����w�q����
	2.��k������ : �b�@����������k���w�q�@����
		(1)��k�������u��b�w�q�Ӥ�������k����Ҥ�,���i�H�b����k�~
		����Ҥ�
		(2)��k��������H����ϥθӤ������Ҧb��k���Dfinal�����ܶq(i.e �u���final)
	3.�R�A������ : �b�����w�q�@���R�A�׹���������,
		(1)�R�A���t�N�O�Ӥ������i�H�V��L�R�A�����@��,�S���~������H��,�]����X�ݥL
		(2)�R�A�O�M���ȯ�X�ݥ~�������R�A�����M��k�C
	4.�ΦW�������N�O�S���W�l��������
		�ΦW���������T�ر��p
		(1)�~�Ӧ����ΦW������
		(2)���f�����ʦW������
		(3)�ѼƦ����ʦW������
*/
public class Lesson5_16{
	public static void main(String[] args){
		Outer outer = new Outer();
		//�b�~���Ыئ��������������,�]�������������ݭn�̿�~��������H
		//�q�`���p�U,�ڭ̤���ĳ�o�˨ӹ�O�Ƥ���������H( �]���o�˫ܶ�)
		//Outer.Inner inner = outer.new Inner();
		//inner.print();
		
		outer.innerPrint();
		outer.show();
		
		Outer.Inner3 inner3 = new Outer.Inner3();
		inner3.print();
		
		outer.print1();
		outer.print2();
		//�ѼƦ����ʦW������
		outer.print3(new Eat(){
			public void eat(){
				System.out.println("eat:�ѼƦ��ΦW������");
			}
		});
	}
}

class Outer{
	private String name="outer";
	
	//-------------- ����������--------------------------------------------
	//��ĳ�b�~�������w�q�@�Ӥ�k�A��~���ѳX�ݤ����������f
	public void innerPrint(){//�ʸˤ�����(�۹�����N�O���ä������A����~���})
		Inner inner = new Inner();
		inner.print();
	}
	
	//����������
	private class Inner{
		public void print(){
			System.out.println("����������"+name);
		}
	}
	
	//-------------- ��k������--------------------------------------------
	//show��k�������ܶq�Τ�k���Ѽ�,��ڥ����O�`�q final
	public void show(){
		final int x= 10;//�쥻�O�n�gfinal ,��JDK1.8�� �N�w�]�o�̭��Y�Ofinal(�i���g)
		class Inner2{
			public void print(){
				//x++;//�q�������ޥΪ����a�ܶq�����O�̲��ܶq�ι�ڤW���̲��ܶq
				System.out.println("��k������"+x+name);
			}
		}
		Inner2 inner2 = new Inner2();
		inner2.print();
	}
	
	//-------------- �R�A������--------------------------------------------
	//�L�k�q�R�A�W�U�夤�ޥΫD�R�A�ܶq(i.e.�u��ϥ��R�A�ܶq)
	static class Inner3{
		public void print(){
			System.out.println("�R�A������");
		}
	}
	//-------------- �ΦW������--------------------------------------------
	//�~�Ӧ�
	public void print1(){
		Cat cat = new Cat(){//abstract�� �L�k�ۤv����� //�j�A����ܹ�{
			public void eat(){
				System.out.println("eat:�~�Ӧ��ΦW������");
			}
		};//�@�w�n�[����
		cat.eat();
	}
	//���f��
	public void print2(){
		Eat eat = new Eat(){
			public void eat(){
				System.out.println("eat:���f���ΦW������");
			}
		};
		eat.eat();
	}
	
	//�ѼƦ�
	public void print3(Eat eat){
		eat.eat();
	}
	
}

interface Eat{
	public void eat();
}

abstract class Cat{
	public abstract void eat();
}