/**
	適配器模式(Adapter):將一個類的接口轉換成客戶希望的另外一個接口。
	適配器模式使得原本由於接口不兼容而不能在一起工作的那些類可以一起工作
*/
public class Lesson5_15{
	public static void main(String[] args){
		PowerA powera = new PowerAImpl();
		work(powera);
		PowerB powerb = new PowerBImpl();
		//work(powerb);
		Adapter adapter = new Adapter(powerb);
		work(adapter);
	}
	public static void work(PowerA a){
		System.out.println("正在連接...");
		a.insert();
		System.out.println("工作結束");
	}
}


//適配器
class Adapter implements PowerA{
	private PowerB powerb;
	public Adapter(PowerB powerb){
		this.powerb = powerb;
	}
	public void insert(){
		powerb.connet();
	}
}
interface PowerB{
	public void connet();
}

class PowerBImpl implements PowerB{
	public void connet(){
		System.out.println("電源B開始工作");
	}
}

interface PowerA{
	public void insert();
}

class PowerAImpl implements PowerA{
	public void insert(){
		System.out.println("電源A開始工作");
	}
}