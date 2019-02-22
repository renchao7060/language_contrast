package damoPack;

public class Damo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Damo02 hello=new Damo02();//创建对象，对象名为hello
		int maxScore=hello.getMaxAge();//调用方法，并将返回值保存在变量maxScore中
		System.out.println("最大年龄为： "+maxScore);//输出最大年龄

	}
	/*
	 * 功能：输出学生年龄的最大值 
     * 定义一个无参的方法，返回值为年龄的最大值
     * 参考步骤：
     * 1、定义一个整形数组 ages ，保存学生年龄，数组元素依次为 18 ,23 ,21 ,19 ,25 ,29 ,17
     * 2、定义一个整形变量 max ,保存学生最大年龄，初始时假定数组中的第一个元素为最大值
     * 3、使用 for 循环遍历数组中的元素，并与假定的最大值比较，如果比假定的最大值要大，则替换当前的最大值
     * 4、使用 return 返回最大值
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
