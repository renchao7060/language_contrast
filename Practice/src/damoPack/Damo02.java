package damoPack;

public class Damo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Damo02 hello=new Damo02();//�������󣬶�����Ϊhello
		int maxScore=hello.getMaxAge();//���÷�������������ֵ�����ڱ���maxScore��
		System.out.println("�������Ϊ�� "+maxScore);//����������

	}
	/*
	 * ���ܣ����ѧ����������ֵ 
     * ����һ���޲εķ���������ֵΪ��������ֵ
     * �ο����裺
     * 1������һ���������� ages ������ѧ�����䣬����Ԫ������Ϊ 18 ,23 ,21 ,19 ,25 ,29 ,17
     * 2������һ�����α��� max ,����ѧ��������䣬��ʼʱ�ٶ������еĵ�һ��Ԫ��Ϊ���ֵ
     * 3��ʹ�� for ѭ�����������е�Ԫ�أ�����ٶ������ֵ�Ƚϣ�����ȼٶ������ֵҪ�����滻��ǰ�����ֵ
     * 4��ʹ�� return �������ֵ
	 */
	public int getMaxAge() {
		int [] ages= {18,23,21,19,25,29,40};
		int max=ages[0];
		for (int i=1;i<ages.length;i++) {
			if(max<ages[i]) {
				max=ages[i];
			}
		}
		return max;
	}

}
