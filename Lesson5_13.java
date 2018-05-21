/**
	工廠模式
*/
public class Lesson5_13{//使用者
	public static void main(String[] args){
		//使用者和被使用者兩者之間,耦合,產生了依賴,當被使用者改變時,會影響使用者
		//使用工廠模式來降低兩者之間的依賴
		//Product phone = new Phone();//依賴new phone,如果phone 沒有就壞
		Product phone = ProductFactory.getProduct("phone");
		if(null!=phone){
			phone.work();
		}
		
	}

}

//工廠類
class ProductFactory{
	public static Product getProduct(String name){
		if("phone".equals(name)){
			return new Phone();
		}else if("computer".equals(name)){
			return new Computer();
		}else{
			return null;
		}
	}
}

interface Product{
	public void work();
}

class Phone implements Product{//被使用者
	public void work(){
		System.out.println("手機開始工作");
	}
}

class Computer implements Product{
	public void work(){
		System.out.println("電腦開始工作");
	}
	
}