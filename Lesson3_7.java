/**
	bubble sort
*/
import java.util.Random;//生成隨機數
public class Lesson3_7{
	public static void main(String[] args){
		
		//第一種
		int[] nums = {58,60,50,84,51,62};
		int temp;
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums.length-i-1;j++){
				if(nums[j]>nums[j+1]){
					temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
		
		for(int x:nums){
			System.out.println(x);
		}
	}
	
	
}
