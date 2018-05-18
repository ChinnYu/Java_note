/**
	よ猭(ㄧ计)
	よ猭更:摸いよ猭把计ぃぃ更兵ン
*/
public class Lesson3_2{
	public static void main(String[] args){
		//秸ノよ猭
		//狹 = 狦ツ诀()
		boolean a = isRunNian(2017);
		System.out.println(a);
		
		int x= add(1,2);
		System.out.println(x);
		float xx= add(0.1234,0.1234);
		System.out.println(xx);
	}
	
	public static boolean isRunNian(int year){
		if(year%4==0 && year%100!=0 || year%400==0){
			return true;
		}else{
			return false;
		}
		
	}
	public static int add(int a,int b){
		return a+b;
	}
	public static float add(float a,float b){
		return a+b;
	}
	
}
