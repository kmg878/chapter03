package chapther03;

import java.util.Formatter;

public class FromatterTest {

	public static void main(String[] args) {
		String name ="김민정";
		int score =100;
		
		System.out.println(name+","+score);
		
		//String 클래스의  format static 메서드를 사용하는 경우
		
		System.out.println(String.format("학생 %s는 자바시험을  %d 점 받았습니다", name,score));
		
		//Fommatter를 사용하는 경우
		StringBuffer sb = new StringBuffer();
		Formatter fm = new Formatter( sb );
		fm.format("학생 %s는 자바시험을  %d 점 받았습니다", name,score);
		

	}

}
