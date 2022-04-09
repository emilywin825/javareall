package chapter04;
import java.util.*;
public class MovieBook {
	public static void main(String args[])
	{
		 Scanner input=new Scanner(System.in);
		 int sitnu;
		 int numberarray=9;
		 int[] number=new int[numberarray];
		 System.out.println("----------------------------------");
		 for(int i=1;i<=10;i++)
		 {
			 System.out.print(i+"  ");
		 }
		 System.out.println("\n"+"----------------------------------");
		 for(int i=0;i<number.length;i++)
		 {
			 System.out.print("원하시는 좌석번호를 입력하세요(종료는 -1): ");
			 sitnu=input.nextInt();
			 if(sitnu==-1)
			 {System.out.println("종료");
			   break;}
			 ++number[sitnu];
		 }
	}

}
