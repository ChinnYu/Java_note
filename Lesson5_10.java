/**
	�ҪO��k
*/

public class Lesson5_10{
	public static void main(String[] args){
		UserManager um = new UserManager();
		um.action("test","add");
	}	
}

abstract class BaseManager{
	public void action(String name,String method){
		if("admin".equals(name)){
			execute(method);
		}else{
			System.out.println("�A�S���ާ@�v��");
		}
	}
	public abstract void execute(String method);
}

class UserManager extends BaseManager{

	public void execute(String method){
		//�Τ�O�_�n�J������
		//���Ҧ��\��~�i�H����H�U�ާ@
		if("add".equals(method)){
			System.out.println("����K�[�ާ@");
		}else if("del".equals(method)){
			System.out.println("����R���ާ@");
		}
	}
}

class ClassManager{
	
}