package damoPack;

import java.util.Scanner;

public class Damo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int classNum=3;//�༶����
		int stuNum=4;//ѧ������
		double sum=0;//�ɼ��ܺ�
		double avg=0;//�ɼ�ƽ����
		Scanner input=new Scanner(System.in);
		for(int i=1;i<=classNum;i++) {
			sum=0;
			System.out.println("***�������"+i+"���༶�ĳɼ�***");
			for(int j=1;j<=stuNum;j++) {
				System.out.print("�������"+j+"��ѧԺ�ĳɼ��� ");
				int score=input.nextInt();
				sum=sum+score;
			}
			avg=sum/stuNum;
			System.out.println("��"+i+"���༶ѧ����ƽ����Ϊ�� "+avg);
		}

	}

}
