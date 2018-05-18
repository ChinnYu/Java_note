public class Lesson3{
	public static void main(String[] args){
		getMenu();//秸ノよ猭砆笲︽
		//よ猭秸ノ把计嘿龟把
		printStar(6);
	}
	//public 砐拜舦耿才
	//static 繰篈耿才磞瓃よ猭钡秸ノ
	//void (礚)
	//getMenu よ猭
	//﹚竡よ猭⊿Τ秸ノ琌ぃ穦笲︽
	public static void getMenu(){
		System.out.println("и");
	}
	/**
		盿把计よ猭
		把:よ猭﹚竡把计嘿把
	*/
	public static void printStar(int line){
		for(int i=1;i<=line;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
}
