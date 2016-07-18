package chapther03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy- MM- dd hh:mm:ss");
		System.out.println(sdf.format(now));
		
		//메서드 사용 (deprecated);
		printDate(now);
		
		Date d = new Date();
		printDate(d);
		
	}
	public static void printDate(Date date){
			System.out.println((date.getYear()+1900)+"년"); //1900 -
			System.out.println((date.getMonth()+1)+"월");   //0-
			System.out.println(date.getDate()+"일");
			System.out.println(date.getHours()+":");
			System.out.println(date.getMinutes()+":");
			System.out.println(date.getSeconds()+":");
			System.out.println("");
	}

}
