package 项目;
import java.util.Scanner;
public class project {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		settle t=new settle();
		add w=new add();
		while(true) {
		System.out.println("1、加密；2、解密;3、结束程序");
		int op=in.nextInt();
		switch(op) {
		case 1:t.putin();break;
		case 2:w.jiemi();break;
		case 3:System.exit(0);
		}//根据使用者的选择来完成不同的功能；
	}
	}

}
