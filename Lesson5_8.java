/**
	�h�A��
*/

public class Lesson5_8{
	public static void main(String[] args){
		//�Τ������ޥΫ��V�l����H(�Τj��������O�p������),�۰��ഫ(�V�W�૬)
		Chicken hc = new HomeChicken("�p����");
		//hc.eat();
		
		Chicken yc = new YeChicken("�j����");
		//yc.eat();
		//hc=yc;
		//hc.eat();
		//eat(hc);
		//eat(yc);
		Chicken jc = new JianChicken("�y�s��");
		eat(jc);
	}
	//��H(�ɫ�) //���V��H�s�{(���V���f�s��)
	public static void eat(Chicken c){
		System.out.println("���Y��");
		c.eat();
		JianChicken jc = (JianChicken)c;//�j�������ഫ���p������,�j���ഫ(�V�U�૬)
		jc.song();
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