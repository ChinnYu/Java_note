/**
	
*/

public class Lesson5_4{
	public static void main(String[] args){
		SortCosmeticManager cm = new SortCosmeticManager();
		cm.add(new Cosmetic("�۩`��","�i�f",1000));
		cm.add(new Cosmetic("java","�i�f",800));
		cm.add(new Cosmetic("C#","�겣",100));
		cm.add(new Cosmetic("C","�겣",200));
		cm.printInfo();
		
	}
	
}
//�i��X�i�f�Ƨ��~���޲z��
class ImportCosmeticManager extends CosmeticManager{
	public void printInfo(){
		//�����Ӧr�Ŧꪺ�ȬO�_�۵��A����ϥ�==,�ϥ�equals()
		for(int i=0;i<count;i++){
			if("�i�f".equals(cs[i].getType())){
				System.out.println(cs[i].getInfo());
			}
		}
	}
}

//�i������ƧǪ��Ƨ��~�޲z��
class SortCosmeticManager extends CosmeticManager{
	//�Ƨǿ�X�Ҧ����~
	public void printInfo(){
		Cosmetic[] temp = java.util.Arrays.copyOf(cs,count);
		Cosmetic c = null;
		for(int i=0;i<temp.length-1;i++){
			for(int j=0;j<temp.length-i-1;j++){
				if(temp[j].getPrice()>temp[j+1].getPrice()){
					c = temp[j];
					temp[j] = temp[j+1];
					temp[j+1] = c;
				}
			}
		}
		for(Cosmetic cosmetic: temp){
			System.out.println(cosmetic.getInfo());
		}
	}
}

//�Ƨ��~�޲z��
class CosmeticManager{
	
	protected Cosmetic[] cs = new Cosmetic[4];
	protected int count;
	
	//�i�f�\��
	public void add(Cosmetic c){
		int size = cs.length;
		if(count>=size){
			int newLen = size*2;
			cs = java.util.Arrays.copyOf(cs,newLen);
		}
		cs[count] = c;
		count++;
	}
	//��X�Ҧ����~
	public void printInfo(){
		for(int i=0;i<count;i++){
			System.out.println(cs[i].getInfo());
		}
	}
}

//�Ƨ��~��
class Cosmetic{
	protected String name;//�~�P
	private String type;//�i�f�ΰ겣
	private int price;//���
	public Cosmetic(){}
	public Cosmetic(String name,String type,int price){
		this.name = name;
		this.type = type;
		this.price = price;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public String getType(){
		return type;
	}
	
	public void setPrice(int price){
		this.price = price;
	}
	
	public int getPrice(){
		return price;
	}
	public String getInfo(){
		return "name="+name+"type"+type+"price"+price;
	}
}
