/**
	�G���}�C�ƨ�:JAVA���L�u�����h���}�C�A�h���}�C����ܤ覡�O�}�C���������٬O�}�C
	�@�_�ѥ[�x�����򤸤j�ɧa�A���T�ӯZ�ŦU�T�W�ǭ����ɡA�p���C�Ӿǭ������Z
	�A�íp��C�ӯZ��������
*/
import java.util.Random;//�ͦ��H����
public class Lesson3_6{
	public static void main(String[] args){
		
		//�Ĥ@��
		int[][] nums = {{58,60,50},{84,51,62},{95,12,66}};
		int len = nums.length;
		for(int i=0;i<len;i++){
			int sum = 0;
			int count=nums[i].length;
			for(int j=0;j<count;j++){
				sum+=nums[i][j];
			}
			int avg= sum/count;
			System.out.println("��"+(i+1)+"�Z�O"+avg);
		}
		
	}
	/*
		10 20 300
		20 39 
		39 13 45
	*/
	
}
