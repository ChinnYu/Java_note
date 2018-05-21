/**
	�N�z�Ҧ�(Proxy):����L��H���Ѥ@�رa�̥H�����o�ӹ�H���X�ݡC
	�N�z�Ҧ����դF�N�O"�u�ɹ�H"���N��A�b�X�ݹ�H�ɤޤJ�@�w�{�ת�������
	�]���o�ض����ʥi�H���[�h�إγ~�C
*/

public class Lesson5_14{
	public static void main(String[] args){
		Action userAction = new UserAction();
		ActionProxy proxy = new ActionProxy(userAction);
		proxy.doAction();
	}
}
interface Action{
	public void doAction();
}

class ActionProxy implements Action{
	private Action target;//�Q�N�z����H
	public ActionProxy(Action target){
		this.target = target;
	}
	//����ާ@
	public void doAction(){
		long startTime = System.currentTimeMillis();
		target.doAction();//����u���~��
		long endTime = System.currentTimeMillis();
		System.out.println("�@�Ӯ�:"+(endTime-startTime));
	}
}

class UserAction implements Action{
	public void doAction(){
		for(int i=0;i<100;i++){
			System.out.println("�Τ�}�l�u�@");
		}
		
	}
}