package chapter03;
import java.util.*;
public class Switch {
	/*
	 * public static void main(String args[]) { Scanner input=new
	 * Scanner(System.in); int grade; String score; int number;
	 * System.out.println("성적을 입력하시오:"); grade=input.nextInt(); number=grade/10;
	 * switch(number) { case 10: score="만점 A+"; break; case 9: score="B"; break;
	 * case 8: score="c"; default: score="분발"; break; }
	 * System.out.println("학점:"+score); }
	 */
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		String Month;
		System.out.print("월의 이름을 입력하시오:");
		Month=input.next();
		int Monthnumber=0;
		switch (Month)
		{
		case "November":
			Monthnumber=11;
			break;	
		}
		System.out.println(Monthnumber+"월");}
	/*
	 * public static void main(String args[]) { int Month; int date=0; Scanner
	 * input=new Scanner(System.in); System.out.print("일수를 알고 싶은 월을 입력하시오:");
	 * Month=input.nextInt();
	 * 
	 * switch(Month) { case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	 * date=31; break; case 4: case 6: case 9: case 11: date=30; break; case 2:
	 * date=28; break;} System.out.println("월의 날수는"+date); }
	 */

}
