/**
	�ʸ˩�
	�p�G�ݩʨS���ʸˡA����b�������~�Ыع�H��A�i�H�����X���ݩ�
	private ����r:�X���v���׹��� ,public ��ܤ����� private��ܨp�����ݩʩΤ�k �A
	�u��b�������X�ݡA�������ݩʩM��k�A�i�H�Q���~������L���X�ݡA�Q�n�b���~���X��
	�p���ݩʡA�ڭ̻ݭn���Ѥ�����k�Ӷ����X��
	�q�`�b�@�������A�ݩʳ��p���ơA�ù�~����getter and setter��k
*/
public class Lesson4_4{
	public static void main(String[] args){
		
		Person p1= new Person();
		//p1.name = "����";
		//p1.age = 16;
		p1.setName("����");
		p1.setAge(16);
	}

}

//�S����ˤ��e
class Person{
	//�ݩʪ��ʸ�
	private String name;//�����ܶq,�����w�q
	private int age;//�����ܶq,�����w�q
	
	//getter and setter
	
	//��~���Ѥ@�Ӭ�name�ݩʳ]�Ȫ���k
	public void setName(String name){
		this.name = name;
	}
	//��~���Ѥ@�����name�ݩʪ���k
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void run(int len){//�ѼƤ]�O�����ܶq
		int m = len;//m�]�O�����ܶq
	}
	
}