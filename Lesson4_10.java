/**
	static ����r
	1.�R�A�ܶq�Τ�k���ݩ��H�A�̿���
	2.�R�A�ܶq�O�����ܶq�A�ͩR�g���q���Q�[����@�Ȩ�{�ǵ���
	3.�R�A�ܶq�u���@���A�b�R�A��k�Ϥ��x�s
	4.�R�A�ܶq�O�����Ҧ���H�@�ɤ@��
	5.��ĳ���n�ι�H�W�h�ե��R�A�ƾڡA�����ϥ����W�ե�
	6.static �׹��@�Ӥ�k�A����Ӥ�k�ݩ����A���ݩ��H�A���������W�ե�
	7.�R�A��k����X�ݫD�R�A���ݩʩM��k�A�u��X���R�A
*/
public class Lesson4_10{
	public static void main(String[] args){
		/* Role brr = new Role("����","�ݰ�");
		Role yun = new Role("����","�ݰ�");
		Role fei = new Role("����","�ݰ�"); */
		System.out.println(args.length);
		for(String x:args){
			System.out.println(x);
		}
		Role brr = new Role("����");
		Role yun = new Role("����");
		Role fei = new Role("����");
		
		System.out.println(brr.getInfo());
		System.out.println(yun.getInfo());
		System.out.println(fei.getInfo());
		
		System.out.println(brr.country);
		System.out.println(yun.country);
		System.out.println(fei.country);
		
		brr.country="�ʰ�";
		System.out.println("---");
		System.out.println(brr.country);
		System.out.println(yun.country);
		System.out.println(fei.country);
		
		System.out.println("---");
		System.out.println(Role.country);//�����W�ե��R�A�ܶq
	}
	
}
class Role{
	private String name;
	static String country = "�ݰ�";//�R�A�ܶq(�����ܶq)
	
	
	public Role(String name){
		this.name=name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	//�R�A��k����X�ݫD�R�A���ƾ�
	public static void setCountry(String country){
		Role.country=country;
	}
	/* public void setCountry(String country){
		this.country = country;
	}
	public String getCountry(){
		return country;
	} */
	public String getInfo(){
		return "Name"+name+"��a"+country;
	}
}
