/**
	
*/
import java.util.Random;//�ͦ�?�H����
public class Lesson3_5{
	public static void main(String[] args){
		
		//�Ĥ@��
		int[] nums = new int[5];
		int len = nums.length;
		Random r = new Random();//�Ыؤ@�ӥi�H�ͦ��H���ƪ��u��
		for(int i=0;i<len;i++){
			nums[i]=r.nextInt(50);
		}
		//System.out.println(nums.length);
		for(int x:nums){
			System.out.println(x);
		}
		
	}
	
	
}
