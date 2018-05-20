/**
	模板方法
*/

public class Lesson5_10{
	public static void main(String[] args){
		UserManager um = new UserManager();
		um.action("test","add");
	}	
}

abstract class BaseManager{
	public void action(String name,String method){
		if("admin".equals(name)){
			execute(method);
		}else{
			System.out.println("你沒有操作權限");
		}
	}
	public abstract void execute(String method);
}

class UserManager extends BaseManager{

	public void execute(String method){
		//用戶是否登入的驗證
		//驗證成功後才可以執行以下操作
		if("add".equals(method)){
			System.out.println("執行添加操作");
		}else if("del".equals(method)){
			System.out.println("執行刪除操作");
		}
	}
}

class ClassManager{
	
}