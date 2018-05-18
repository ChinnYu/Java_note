/**
	二維陣列事例:JAVA中無真正的多維陣列，多維陣列的表示方式是陣列中的元素還是陣列
	一起參加屌絲乘續元大賽吧，有三個班級各三名學員參賽，計錄每個學員的成績
	，並計算每個班的平均分
*/
import java.util.Random;//生成隨機數
public class Lesson3_6{
	public static void main(String[] args){
		
		//第一種
		int[][] nums = {{58,60,50},{84,51,62},{95,12,66}};
		int len = nums.length;
		for(int i=0;i<len;i++){
			int sum = 0;
			int count=nums[i].length;
			for(int j=0;j<count;j++){
				sum+=nums[i][j];
			}
			int avg= sum/count;
			System.out.println("第"+(i+1)+"班是"+avg);
		}
		
	}
	/*
		10 20 300
		20 39 
		39 13 45
	*/
	
}
