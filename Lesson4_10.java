/**
	static 關鍵字
	1.靜態變量或方法不屬於對象，依賴類
	2.靜態變量是全局變量，生命週期從類被加載後一值到程序結束
	3.靜態變量只有一份，在靜態方法區中儲存
	4.靜態變量是本類所有對象共享一份
	5.建議不要用對象名去調用靜態數據，直接使用類名調用
	6.static 修飾一個方法，那麼該方法屬於類，不屬於對象，直接用類名調用
	7.靜態方法不能訪問非靜態的屬性和方法，只能訪問靜態
*/
public class Lesson4_10{
	public static void main(String[] args){
		/* Role brr = new Role("倍倍","屬國");
		Role yun = new Role("云云","屬國");
		Role fei = new Role("飛飛","屬國"); */
		System.out.println(args.length);
		for(String x:args){
			System.out.println(x);
		}
		Role brr = new Role("倍倍");
		Role yun = new Role("云云");
		Role fei = new Role("飛飛");
		
		System.out.println(brr.getInfo());
		System.out.println(yun.getInfo());
		System.out.println(fei.getInfo());
		
		System.out.println(brr.country);
		System.out.println(yun.country);
		System.out.println(fei.country);
		
		brr.country="晉國";
		System.out.println("---");
		System.out.println(brr.country);
		System.out.println(yun.country);
		System.out.println(fei.country);
		
		System.out.println("---");
		System.out.println(Role.country);//用類名調用靜態變量
	}
	
}
class Role{
	private String name;
	static String country = "屬國";//靜態變量(全局變量)
	
	
	public Role(String name){
		this.name=name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	//靜態方法不能訪問非靜態的數據
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
		return "Name"+name+"國家"+country;
	}
}
