/**
	�A�t���Ҧ�(Adapter):�N�@���������f�ഫ���Ȥ�Ʊ檺�t�~�@�ӱ��f�C
	�A�t���Ҧ��ϱo�쥻�ѩ󱵤f���ݮe�Ӥ���b�@�_�u�@���������i�H�@�_�u�@
*/
public class Lesson5_15_2{
	public static void main(String[] args){
		
	}
}

interface Animal{//�]���Ӧhfunction �b����Ʈɳ·� �A�ҥH�حӾA�t�����~�ӭ��g
	public void sing();
	public void cry();
	public void run();
	public void swim();
}
//�A�t��
abstract class AnimalsFunction{
	public void sing(){}
	public void cry(){}
	public void run(){}
	public void swim(){}
}
class Dog extends AnimalsFunction{
	public void run(){
		System.out.println("�ڬO�ƪ�");
	}
}