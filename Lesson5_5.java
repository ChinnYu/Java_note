/**
	final ����r
	1.�ϥ�final �n���@���ݩʡA�N�O�`�q�A�`�q���R�W�W�h��ĳ�ϥΥ��j�g,
	�`�q�����b�w�q�ɩκc�y������l��
	2.�ϥ�final�n������k�A����Q�l�����g�A�u��Q�~��
	3.�ϥ�final����r�n���@�����A�����N�ର�̲����A�S���l�������Afinal�׹�����
	�L�k�Q�~��
*/
public class Lesson5_5{
	//private static final int PERSON_NUM = 10;
	public static void main(String[] args){
		System.out.println(Constant.PERSON_NUM);
		FinalClass fc = new FinalClass();
		fc.setLength(123);
	}
	
}

//�`�q��(�u����):�b�ɰO���ض}�o���A�`�q���q�`�Ω�w�q���ؤ��@�Ǥ��@���A���ܪ��ƾ�

final class Constant{
	public static final int PERSON_NUM = 10;//�H��
}

class FinalClass{
	public final int DAY_NUMBER ;//�u�@�Ѽ�
	
	public FinalClass(){//�q�`���o�˥ΡA�]���N������ȤF
		DAY_NUMBER = 22;
	}
	
	public final void print(){
		System.out.println("�ڬOfinal");
	}
	public void setLength(final int size){
		
		size++;
		System.out.println(size);
	}
}
class SubClass extends FinalClass{
	/* public void print(){
		System.out.println("�ڬOfinal");
	} */
}