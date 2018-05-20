/**
	策略模式(strategy Pattern):定義一系列的算法，將每一種算法封裝起來
	可以互相替換使用，策略模式讓算法獨立於使用他的客戶應用而獨立變化
	
	
	把可變的行為抽象出來,這樣的好處是這些行為可以在使用時相互替換
*/

public class Lesson5_11{
	public static void main(String[] args){
		BaseService user = new UserService();
		user.setIsave(new FileSave());
		user.add("user");
	}	
}
//把可變的行為抽象出來,定義一系列的算法
interface ISave{
	public void save(String data);
}

class FileSave implements ISave{
	public void save(String data){
		System.out.println("把數據存到文件中"+data);
	}
}

class NetSave implements ISave{
	public void save(String data){
		System.out.println("把數據存到網路中"+data);
	}
}

abstract class BaseService{
	
	private ISave iSave;//組合接口(也就是把他當屬性塞入class)
	public void setIsave(ISave iSave){
		this.iSave = iSave;
	}
	public void add(String data){
		System.out.println("檢查數據合法性");
		iSave.save(data);
		System.out.println("數據保存完畢");
	}
}

class UserService extends BaseService{
	
}