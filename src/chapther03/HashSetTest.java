package chapther03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<String>();
		
		set.add("둘리");
		set.add("마이콜");
		set.add("도우넛");
		System.out.println(set.size());
		set.add("마이콜");
		set.add("도우넛");
		System.out.println(set.size());  //같은 값은 들어가지 않는다.
		
		System.out.println(set.contains("마이콜"));
		System.out.println(set.contains("고길동"));  //가져오는 방법 없음 번호도 순서도 없음
		
		//전체 가져오기
		Iterator<String> it =set.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
	

	}

}
