/**
	�u�t�Ҧ�
*/
public class Lesson5_13{//�ϥΪ�
	public static void main(String[] args){
		//�ϥΪ̩M�Q�ϥΪ̨�̤���,���X,���ͤF�̿�,��Q�ϥΪ̧��ܮ�,�|�v�T�ϥΪ�
		//�ϥΤu�t�Ҧ��ӭ��C��̤������̿�
		//Product phone = new Phone();//�̿�new phone,�p�Gphone �S���N�a
		Product phone = ProductFactory.getProduct("phone");
		if(null!=phone){
			phone.work();
		}
		
	}

}

//�u�t��
class ProductFactory{
	public static Product getProduct(String name){
		if("phone".equals(name)){
			return new Phone();
		}else if("computer".equals(name)){
			return new Computer();
		}else{
			return null;
		}
	}
}

interface Product{
	public void work();
}

class Phone implements Product{//�Q�ϥΪ�
	public void work(){
		System.out.println("����}�l�u�@");
	}
}

class Computer implements Product{
	public void work(){
		System.out.println("�q���}�l�u�@");
	}
	
}