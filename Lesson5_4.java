/**
	
*/

public class Lesson5_4{
	public static void main(String[] args){
		SortCosmeticManager cm = new SortCosmeticManager();
		cm.add(new Cosmetic("相奈爾","進口",1000));
		cm.add(new Cosmetic("java","進口",800));
		cm.add(new Cosmetic("C#","國產",100));
		cm.add(new Cosmetic("C","國產",200));
		cm.printInfo();
		
	}
	
}
//可輸出進口化妝品的管理類
class ImportCosmeticManager extends CosmeticManager{
	public void printInfo(){
		//比較兩個字符串的值是否相等，不能使用==,使用equals()
		for(int i=0;i<count;i++){
			if("進口".equals(cs[i].getType())){
				System.out.println(cs[i].getInfo());
			}
		}
	}
}

//可按單價排序的化妝品管理類
class SortCosmeticManager extends CosmeticManager{
	//排序輸出所有產品
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

//化妝品管理類
class CosmeticManager{
	
	protected Cosmetic[] cs = new Cosmetic[4];
	protected int count;
	
	//進貨功能
	public void add(Cosmetic c){
		int size = cs.length;
		if(count>=size){
			int newLen = size*2;
			cs = java.util.Arrays.copyOf(cs,newLen);
		}
		cs[count] = c;
		count++;
	}
	//輸出所有產品
	public void printInfo(){
		for(int i=0;i<count;i++){
			System.out.println(cs[i].getInfo());
		}
	}
}

//化妝品類
class Cosmetic{
	protected String name;//品牌
	private String type;//進口或國產
	private int price;//單價
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
