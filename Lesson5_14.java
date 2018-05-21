/**
	代理模式(Proxy):為其他對象提供一種帶裡以控制對這個對象的訪問。
	代理模式說白了就是"真時對象"的代表，在訪問對象時引入一定程度的間接性
	因為這種間接性可以附加多種用途。
*/

public class Lesson5_14{
	public static void main(String[] args){
		Action userAction = new UserAction();
		ActionProxy proxy = new ActionProxy(userAction);
		proxy.doAction();
	}
}
interface Action{
	public void doAction();
}

class ActionProxy implements Action{
	private Action target;//被代理的對象
	public ActionProxy(Action target){
		this.target = target;
	}
	//執行操作
	public void doAction(){
		long startTime = System.currentTimeMillis();
		target.doAction();//執行真正業務
		long endTime = System.currentTimeMillis();
		System.out.println("共耗時:"+(endTime-startTime));
	}
}

class UserAction implements Action{
	public void doAction(){
		for(int i=0;i<100;i++){
			System.out.println("用戶開始工作");
		}
		
	}
}