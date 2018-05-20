/**
	�����Ҧ�(strategy Pattern):�w�q�@�t�C����k�A�N�C�@�غ�k�ʸ˰_��
	�i�H���۴����ϥΡA�����Ҧ�����k�W�ߩ�ϥΥL���Ȥ����ΦӿW���ܤ�
	
	
	��i�ܪ��欰��H�X��,�o�˪��n�B�O�o�Ǧ欰�i�H�b�ϥήɬۤ�����
*/

public class Lesson5_11{
	public static void main(String[] args){
		BaseService user = new UserService();
		user.setIsave(new FileSave());
		user.add("user");
	}	
}
//��i�ܪ��欰��H�X��,�w�q�@�t�C����k
interface ISave{
	public void save(String data);
}

class FileSave implements ISave{
	public void save(String data){
		System.out.println("��ƾڦs����"+data);
	}
}

class NetSave implements ISave{
	public void save(String data){
		System.out.println("��ƾڦs�������"+data);
	}
}

abstract class BaseService{
	
	private ISave iSave;//�զX���f(�]�N�O��L���ݩʶ�Jclass)
	public void setIsave(ISave iSave){
		this.iSave = iSave;
	}
	public void add(String data){
		System.out.println("�ˬd�ƾڦX�k��");
		iSave.save(data);
		System.out.println("�ƾګO�s����");
	}
}

class UserService extends BaseService{
	
}