public class Lesson3{
	public static void main(String[] args){
		getMenu();//�եΤ�k�A���ɤ~��Q�B��
		//�b��k�եήɪ��Ѽƺ٬����
		printStar(6);
	}
	//public �X���v���׹���
	//static �R�A�׹��šA�y�z����k�i�H�����ե�
	//void ��^��(�L��^��)
	//getMenu ��k�W
	//�w�q�@�Ӥ�k�A�b�S���եήɬO���|�B��
	public static void getMenu(){
		System.out.println("�ڦY�n�h��");
	}
	/**
		�a�ѼƤ�k
		�ΰ�:�b��k�w�q�ɪ��Ѽƺ٬��ΰ�
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
