/**
	Array 工具類
*/
import java.util.Arrays;
public class Lesson3_11{
	public static void main(String[] args){
		int[] num={50,86,12,45,35};
		
		//二分查找
		int index=Arrays.binarySearch(num,12);
		System.out.println(index);
		
		//輸出陣列 -- 在測試書出數據時，可以使用，更加方便
		System.out.println(Arrays.toString(num));
		
		//陣列排序
		int[] num2={50,86,12,45,35,100,58,64};
		Arrays.sort(num2); //快速排序
		System.out.println(Arrays.toString(num2));
		
		//陣列的複製
		num2 = Arrays.copyOf(num2,10);
		System.out.println(Arrays.toString(num2));
		
		//
		/* int[] newnum = new int[num2.length];
		System.arraycopy(num2,0,newnum,0,num2.length);
		System.out.println(Arrays.toString(newnum)); */
		
		/*
			效率由高到低排序是:System.arraycopy->Arrays.copyOf->for
		*/
		
		//判斷兩個陣列是否相等
		System.out.println(Arrays.equals(num,num2));
		
		//填充陣列
		Arrays.fill(num2,0);
		System.out.println(Arrays.toString(num2));
		
	}
	
	
}
