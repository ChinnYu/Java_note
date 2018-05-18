/**
	陣列的定義:一組能夠存?相同數據類型的數據集合
	陣列一定要有長度
	陣列中的每個位數據稱為元素
	陣列元素的位置從0開始
	陣列中的位置稱為下標
*/
public class Lesson3_3{
	public static void main(String[] args){
		
		//第一種
		int[] nums = new int[50];
		nums[0]=1;
		//第二種
		int x=6;
		int[] nums2;//先聲明(定義)
		nums2 = new int[x];
		//第三種
		int[] nums3 = new int[]{1,2,3,4,5};//[]別在填
		//第四種
		int[] nums4 = {1,2,3,4,5};
		//所有陣列的屬性皆有length
		System.out.println(nums2.length);
	}
	
	
	
}
