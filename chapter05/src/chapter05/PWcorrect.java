package chapter05;
import java.util.Scanner;
public class PWcorrect {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("패스워드를 입력해주세요.");
		String pw1=sc.next();
		System.out.println("위에서 입력한 패스워드를 다시 입력해주세요.");
		String pw2=sc.next();
		
		if(pw1.equals(pw2)==true)
		{
			System.out.println("회원가입을 축하드립니다.");
			break;
		}
		else
		{
			System.out.println("다시 입력해주세요");
		}
	}
	}
}
