/**
	��H�Ʋպ޲z
	�ϥι�H�Ʋչ�{�h��Chicken���޲z
	�ʺA�}�C:
	1.�}�C�O�@�ؽu�ʼƾڵ��c
	2.�}�C���A�X�@�R�����J���ާ@�A�A�X�K�[�P�d��A�M��
*/
import java.util.Arrays;
public class Lesson4_14{
	public static void main(String[] args){
		ChickenManager cm = new ChickenManager(5);
		cm.add(new Chicken(1,"�p�p",10));
		cm.add(new Chicken(2,"�pu",2));
		cm.add(new Chicken(3,"�pi",3));
		cm.add(new Chicken(4,"�pj",4));
		cm.add(new Chicken(5,"�pg",5));
		cm.add(new Chicken(6,"�pj",5));
		System.out.println(cm.length());
		System.out.println("----printAll------");
		cm.printAll();
		System.out.println("----find------");
		Chicken c = cm.find(6);
		c.print();
		System.out.println("----update------");
		cm.update(new Chicken(1,"fc",20));
		cm.printAll();
	}
}

//�p���޲z��
class ChickenManager{
	private Chicken[] cs = null;
	private int count = 0; //�O����e�Ʋժ������Ӽ�(�U��)
	public ChickenManager(int size){
		if(size>0){
			cs= new Chicken[size];
		}else{
			cs = new Chicken[5];
		}
	}
	public int length(){
		return cs.length;
	}
	//�K�[: ��{�ʺA�}�C
	public void add(Chicken c){
		if(count>=cs.length){//�Ʋդw���A�ݭn�X�R
			//��k�@ : �X�R��ӼƲդj�p���@�b cs.length*3/2+1
			//��k�G : �X�R��ӼƲժ��@�� cs.length*2
			int newLen=cs.length*2;
			cs = Arrays.copyOf(cs,newLen);
			
		}
		cs[count]=c;
		count++;
	}
	//�R��
	public void delete(int id){
		for(int i=0;i<count;i++){
			if(cs[i].getId()==id){//���n�R������H�A��ӹ�H���᪺��H�V�e���ʤ@��
				for(int j=i;j<count-1;j++){
					cs[j]=cs[j+1];
				}
				//��̫�@�ӹ�H��Ȭ���(�R��)
				cs[count-1]=null;
				count--;//�U�д�@
				break;
			}
		}
	}
	//��s
	public void update(Chicken c){
		Chicken temp=find(c.getId());
		if(temp!=null){
			temp.setName(c.getName());
			temp.setAge(c.getAge());
		}
	}
	//�d��
	public Chicken find(int id){
		for(int i=0;i<count;i++){
			if(cs[i].getId()==id){
				return cs[i];
			}
		}
		return null;
	}
	//��X�Ҧ�
	public void printAll(){
		for(int i=0;i<count;i++){
			cs[i].print();
		}
	}
}

//�p����(�ƾڹ�H) value object(vo)
class Chicken{
	
	private String name;
	private int id;
	private int age;
	
	public Chicken(){}
	public Chicken(int id,String name,int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void print(){
		System.out.println("id"+id+",name"+name+",age"+age);
	}
	
}