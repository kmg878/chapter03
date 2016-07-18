package chapther03;

public class StringTest {

	public static void main(String[] args) {
		
		//이스케이프 문자 사용
		char c='\'';
		String s = "He\"lllo\" World\n";
		
		System.out.println(s);
		System.out.println(c);
		
		//+ 연산
		System.out.println("Hello"+"world"+2);
		StringBuffer sb= new StringBuffer("Hello");
		sb.append("World");
		sb.append(2);
		System.out.println(sb);
		System.out.println(new StringBuffer("Hello").append("World"));

	}

}
