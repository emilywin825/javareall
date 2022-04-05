package chapter03;
import java.util.Random;
import java.util.*;
public class For{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int rn;int sum=0;
		System.out.println("난수의 개수:");
		rn=input.nextInt();
		Random generator=new Random();
		for(int i=1;i<=rn;i++)
		{ 
			int number=generator.nextInt(100);
			sum+=number;
		}
		System.out.println("합은"+sum);
	}
}