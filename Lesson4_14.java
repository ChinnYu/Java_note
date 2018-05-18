/**
	對象數組管理
	使用對象數組實現多個Chicken的管理
	動態陣列:
	1.陣列是一種線性數據結構
	2.陣列不適合作刪除插入等操作，適合添加與查找，遍歷
*/
import java.util.Arrays;
public class Lesson4_14{
	public static void main(String[] args){
		ChickenManager cm = new ChickenManager(5);
		cm.add(new Chicken(1,"小小",10));
		cm.add(new Chicken(2,"小u",2));
		cm.add(new Chicken(3,"小i",3));
		cm.add(new Chicken(4,"小j",4));
		cm.add(new Chicken(5,"小g",5));
		cm.add(new Chicken(6,"小j",5));
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

//小雞管理類
class ChickenManager{
	private Chicken[] cs = null;
	private int count = 0; //記錄當前數組的元素個數(下標)
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
	//添加: 實現動態陣列
	public void add(Chicken c){
		if(count>=cs.length){//數組已滿，需要擴充
			//算法一 : 擴充原來數組大小的一半 cs.length*3/2+1
			//算法二 : 擴充原來數組的一倍 cs.length*2
			int newLen=cs.length*2;
			cs = Arrays.copyOf(cs,newLen);
			
		}
		cs[count]=c;
		count++;
	}
	//刪除
	public void delete(int id){
		for(int i=0;i<count;i++){
			if(cs[i].getId()==id){//找到要刪除的對象，把該對象之後的對象向前移動一位
				for(int j=i;j<count-1;j++){
					cs[j]=cs[j+1];
				}
				//把最後一個對象賦值為空(刪除)
				cs[count-1]=null;
				count--;//下標減一
				break;
			}
		}
	}
	//更新
	public void update(Chicken c){
		Chicken temp=find(c.getId());
		if(temp!=null){
			temp.setName(c.getName());
			temp.setAge(c.getAge());
		}
	}
	//查找
	public Chicken find(int id){
		for(int i=0;i<count;i++){
			if(cs[i].getId()==id){
				return cs[i];
			}
		}
		return null;
	}
	//輸出所有
	public void printAll(){
		for(int i=0;i<count;i++){
			cs[i].print();
		}
	}
}

//小雞類(數據對象) value object(vo)
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