/**
	
*/
public class Lesson3_4{
	public static void main(String[] args){
		
		//�Ĥ@��
		int[] nums = {50,60,70,80,90,100};
		System.out.println(nums.length);
		
		//for
		
		//foreach jdk1.5����
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
	
	//jdl1.5 �i�ܰѼ�
	//�i�ܰѼƥu��O�ѼƦC�����̫�@��
	//�i�ܰѼƧ@���Ʋըϥ�
	public static void print2(int k,int... x){
		int len = x.length;
		for(int i =0;i<len;i++){
			System.out.println(x[i]);
		}
		
	}
	
	//���հ}�C�����`NullPointerException(�ū��w)
	public static void print3(int[] x){
		//java.lang.NullPointerException
		//��@���ܶq��null(�S����Ȯ�),�ڭ̥h�եΤF���ܶq���ݩʩM��k
		int len = x.length;
	}
	
	//���հ}�C�����`�A�}�C�U�жV��
	public static void print4(int[] x){
		// java.lang.ArrayIndexOutOfBoundsException
		//��@���ܶq��null(�S����Ȯ�),�ڭ̥h�եΤF���ܶq���ݩʩM��k
		for(int i =0;i<=x.length;i++){
			System.out.println(x[i]);
		}
	}
}
