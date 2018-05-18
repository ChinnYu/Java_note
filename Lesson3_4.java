/**
	
*/
public class Lesson3_4{
	public static void main(String[] args){
		
		//第一種
		int[] nums = {50,60,70,80,90,100};
		System.out.println(nums.length);
		
		//for
		
		//foreach jdk1.5之後
		for(int x:nums){
			System.out.println(x);
		}
		System.out.println("--------------:");
		//print(nums);
		print2(50,60,70,80,90,100);
		//print3(null);
		//print4(nums);
	}
	
	public static void print(int[] x){
		int len = x.length;
		for(int i =0;i<len;i++){
			System.out.println(x[i]);
		}
		
	}
	
	//jdl1.5 可變參數
	//可變參數只能是參數列表中的最後一個
	//可變參數作為數組使用
	public static void print2(int k,int... x){
		int len = x.length;
		for(int i =0;i<len;i++){
			System.out.println(x[i]);
		}
		
	}
	
	//測試陣列的異常NullPointerException(空指針)
	public static void print3(int[] x){
		//java.lang.NullPointerException
		//當一個變量為null(沒有賦值時),我們去調用了該變量的屬性和方法
		int len = x.length;
	}
	
	//測試陣列的異常，陣列下標越界
	public static void print4(int[] x){
		// java.lang.ArrayIndexOutOfBoundsException
		//當一個變量為null(沒有賦值時),我們去調用了該變量的屬性和方法
		for(int i =0;i<=x.length;i++){
			System.out.println(x[i]);
		}
	}
}
