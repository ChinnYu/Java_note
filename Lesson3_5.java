/**
	
*/
import java.util.Random;//生成?隨機數
public class Lesson3_5{
	public static void main(String[] args){
		
		//第一種
		int[] nums = new int[5];
		int len = nums.length;
		Random r = new Random();//創建一個可以生成隨機數的工具
		for(int i=0;i<len;i++){
			nums[i]=r.nextInt(50);
		}
		//System.out.println(nums.length);
		for(int x:nums){
			System.out.println(x);
		}
		
	}
	
	
}
