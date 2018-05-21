/**
	�A�t���Ҧ�(Adapter):�N�@���������f�ഫ���Ȥ�Ʊ檺�t�~�@�ӱ��f�C
	�A�t���Ҧ��ϱo�쥻�ѩ󱵤f���ݮe�Ӥ���b�@�_�u�@���������i�H�@�_�u�@
*/
public class Lesson5_15{
	public static void main(String[] args){
		PowerA powera = new PowerAImpl();
		work(powera);
		PowerB powerb = new PowerBImpl();
		//work(powerb);
		Adapter adapter = new Adapter(powerb);
		work(adapter);
	}
	public static void work(PowerA a){
		System.out.println("���b�s��...");
		a.insert();
		System.out.println("�u�@����");
	}
}


//�A�t��
class Adapter implements PowerA{
	private PowerB powerb;
	public Adapter(PowerB powerb){
		this.powerb = powerb;
	}
	public void insert(){
		powerb.connet();
	}
}
interface PowerB{
	public void connet();
}

class PowerBImpl implements PowerB{
	public void connet(){
		System.out.println("�q��B�}�l�u�@");
	}
}

interface PowerA{
	public void insert();
}

class PowerAImpl implements PowerA{
	public void insert(){
		System.out.println("�q��A�}�l�u�@");
	}
}