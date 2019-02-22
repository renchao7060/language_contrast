package damoPack;

import java.util.Scanner;

public class Damo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int classNum=3;//班级数量
		int stuNum=4;//学生数量
		double sum=0;//成绩总和
		double avg=0;//成绩平均分
		Scanner input=new Scanner(System.in);
		for(int i=1;i<=classNum;i++) {
			sum=0;
			System.out.println("***请输入第"+i+"个班级的成绩***");
			for(int j=1;j<=stuNum;j++) {
				System.out.print("请输入第"+j+"个学院的成绩： ");
				int score=input.nextInt();
				sum=sum+score;
			}
			avg=sum/stuNum;
			System.out.println("第"+i+"个班级学生的平均分为： "+avg);
		}

	}

}
