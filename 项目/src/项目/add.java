package 项目;
import java.util.Scanner;
public class add {
	Scanner sc=new Scanner(System.in);
	
	public void jiemi() {
		System.out.println("输入需要解密的密码：");
		String s=sc.nextLine();
		int n=0;
		char[] array=s.toCharArray();//获取字符数组
			for(int i1=array.length-1;i1>=0;i1--) {
				
			n++;
			}//将字符反转
			char first=array[0];
			char last=array[n-1];
			array[0]=last;array[n-1]=first;//将字符第一位和最后一位调转
			for(int i1=0;i1<array.length;i1++) {
			
			}
			for(int i1=array.length-1;i1>=0;i1--) {
				
				array[i1]=(char)(array[i1]-(n-i1)-3);
				System.out.println((char)array[i1]);
				}//输出最后加密的密码；
	
	
	}
	}
