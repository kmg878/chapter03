package chapther03;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		printDate(calendar);
		
//		calendar.set(2017,0,1);
//		printDate(calendar);
//		
//		calendar.set(Calendar.YEAR,2017);
//		printDate(calendar);
		//
		calendar.set(2012,03,12);
		calendar.add(Calendar.DATE,2012);
		printDate(calendar);
		
		//오늘
		calendar = Calendar.getInstance();
		
		//10달전
		calendar.add(Calendar.MONTH,-10);
		printDate(calendar);
		
		//오늘은 올해의 몇 일째 되는 날?
		
		calendar =Calendar.getInstance();
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

	}
	public static void printDate(Calendar calendar){
		final String[] DAYS ={"일","월","화","수","목","금","토"};
		
		
		System.out.print(calendar.get(Calendar.YEAR)+" 년 ");
		System.out.print((calendar.get(Calendar.MONTH)+1)+" 월 ");
		System.out.print(calendar.get(Calendar.DATE)+" 일 ");
		System.out.print(DAYS [ calendar.get(Calendar.DAY_OF_WEEK)-1 ]+"요일");
		System.out.print((calendar.get(Calendar.AM_PM)==0? "AM":"PM")+" ");
		System.out.print(calendar.get(Calendar.HOUR)+" 시 ");
		System.out.print(calendar.get(Calendar.MINUTE)+" 분 ");
		System.out.print("\n");
	}

}
