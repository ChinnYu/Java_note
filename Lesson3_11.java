/**
	Array �u����
*/
import java.util.Arrays;
public class Lesson3_11{
	public static void main(String[] args){
		int[] num={50,86,12,45,35};
		
		//�G���d��
		int index=Arrays.binarySearch(num,12);
		System.out.println(index);
		
		//��X�}�C -- �b���ծѥX�ƾڮɡA�i�H�ϥΡA��[��K
		System.out.println(Arrays.toString(num));
		
		//�}�C�Ƨ�
		int[] num2={50,86,12,45,35,100,58,64};
		Arrays.sort(num2); //�ֳt�Ƨ�
		System.out.println(Arrays.toString(num2));
		
		//�}�C���ƻs
		num2 = Arrays.copyOf(num2,10);
		System.out.println(Arrays.toString(num2));
		
		//
		/* int[] newnum = new int[num2.length];
		System.arraycopy(num2,0,newnum,0,num2.length);
		System.out.println(Arrays.toString(newnum)); */
		
		/*
			�Ĳv�Ѱ���C�ƧǬO:System.arraycopy->Arrays.copyOf->for
		*/
		
		//�P�_��Ӱ}�C�O�_�۵�
		System.out.println(Arrays.equals(num,num2));
		
		//��R�}�C
		Arrays.fill(num2,0);
		System.out.println(Arrays.toString(num2));
		
	}
	
	
}
