/**
	�h�A��
*/

public class Lesson5_9{
	public static void main(String[] args){
		Chicken hc = new HomeChicken("�p����");
		Chicken yc = new YeChicken("�j����");
		eat(hc);
		eat(yc);
		Chicken jc = new JianChicken("�y�s��");
		eat(jc);
	}
	
	public static void eat(Chicken c){
		System.out.println("���Y��");
		c.eat();
		
		//��ڭ̻ݭn���������ұj���ഫ���l���ޥήɡA
		//���F�קK�����ഫ���` java.lang.ClasscastException
		//����ڭ̻ݭn�b�ഫ���e�@�����ˬd(�P�_)
		if(c instanceof JianChicken){//���ߪ�����O�A��H�O�����Y��H���������A���i�H�q�L�ˬd
			JianChicken jc = (JianChicken)c;
			jc.song();
		}
	}
}
//��
abstract class Chicken{
	private String name;
	public Chicken(){}
	
	public Chicken(String name){
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public abstract void eat();
}

//�a��
class HomeChicken extends Chicken{
	
	public HomeChicken(String name){
		super(name);
	}
	public void eat(){
		System.out.println(this.getName()+",�ڷR�Y��");
	}
}

//����
class YeChicken extends Chicken{
	
	public YeChicken(String name){
		super(name);
	}
	
	public void eat(){
		System.out.println(this.getName()+",�ڷR��");
	}
	
}

//
class JianChicken extends Chicken{
	public JianChicken(String name){
		super(name);
	}
	public void eat(){
		System.out.println(this.getName()+",�ڨB�Y");
	}
	public void song(){
		System.out.println("�ڥs");
	}
}