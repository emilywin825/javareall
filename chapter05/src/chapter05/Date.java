package chapter05;

public class Date {
	private int year;
	private String month;
	private int day;
	
	Date(int year,String month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	Date(int year){
		this(year,"1¿ù",1);
	}
	Date(){
		this(1900,"1¿ù",1);
	}
	@Override
	public String toString() {
		return "Date [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	
	
}
