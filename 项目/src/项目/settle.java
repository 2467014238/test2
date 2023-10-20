package 项目;
import java.util.Scanner;

public class settle {
	Scanner in=new Scanner(System.in);
	public  void putin() {
		System.out.println("输入密码：");
		String sc=in.nextLine();//输入字符
		int n=0;
		char[] array=sc.toCharArray();//获取字符数组
		for(int i=0;i<array.length;i++) {
		array[i]=(char)(array[i]+i+4);
		n++;
		}//将密码的偏移值复原；
			char first=array[0];
			char last=array[n-1];
			array[0]=last;array[n-1]=first;//将字符第一位和最后一位调转
			
			for(int i=array.length-1;i>=0;i--) {
			System.out.println((char)array[i]);
			}//将字符反转
	}

}
