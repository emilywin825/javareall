package chapter05;

public class StringTest {
	public static void main(String[] args)
	{
		String st=new String("A barking dog");
		
		//int size=st.length();
		//String add=st.concat(" never Bites!");
		String re=st.replace('b', 'B');
		String sub=st.substring(2, 7);
		String upper=st.toUpperCase();
		String s1="Hello";
		String s2=" How are you?";
		String s3=s1+s2;
		
		System.out.println("문자열의 길이="+"Are you crazy?".length()); //String 클래스의 메소드를 문자열 상수를 통해서도 사용할 수 있음.
		System.out.println(st.concat(" never Bites"));
		System.out.println(re);		
		System.out.println(sub);
		System.out.println(upper);
		System.out.println(s3);
	}
}
