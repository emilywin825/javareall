package chapter05;
public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	public Time()
	{
		this(0,0,0);
	}

	public Time(int h,int m,int s)
	{
		hour=((h>=0&&h<24) ?h :0);
		minute=((m>=0&&m<60)?m:0);
		second=((s>=00&&s<60)?s:0);
	}
	
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d:",hour,minute,second );
	}

	public static void main(String[] args) {
		Time time1=new Time();
		System.out.println(time1);
		
		Time time2=new Time(13,27,06);
		System.out.println(time2.toString());
		
		Time time3=new Time(-13,27,06);
		System.out.println(time3);

	}

}
