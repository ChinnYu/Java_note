public class Lesson4_2{
	public static void main(String[] args){
		Horse h= null;//�n���@�������ܶq(���F�K�ذ򥻼ƾ������H�~�A���O�ޥμƾ������A�]�A�Ʋ�)
		//�Ыؤ@��Horse��������H�A��ҹ�H
		h=new Horse();
		//���F��H�A�ڭ̴N�i�H�եι�H���ݩʩM��k
		h.name = "��";
		h.age = 123;
		h.run();

		//�ΦW��H �u��ϥΤ@���A�Χ���A�ӹ�H�N�|�Q����
		new Horse().eat();

		h=null;//��H����
		
		Horse h1=new Horse();
		Horse h2=null;
		h1.name="�p��";
		h1.age=4;
		h2=h1;
		h2.name="�p��";//��H��������ȡA�ۦP�����~�i�H���
		System.out.println(h1.name);
	}

}
class Horse{
	String name;//�r�Ŧꦡ�ޥ������ܶq�A���O�򥻼ƾ������ܶq
	int age;
	public void run(){
		System.out.println("�ڬO"+name+",��"+age+"���F");
	}
	public void eat(){
		System.out.println("�ڦY�n�h��");
	}
}