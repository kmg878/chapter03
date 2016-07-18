package chapther03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<String,Integer>();  //객체만 들어간다
		
		map.put("둘리",new Integer(100));
		map.put("마이콜",50);
		map.put("도우넛",80);
		
		int score = map.get("마이콜");  //자동 언박싱
 		System.out.println(map.get("마이콜"));
 		System.out.println(map.get(100));
 		
 		//전체 순회
 		Set<String> set=map.keySet();
 		Iterator<String> it = set.iterator();
 		while (it.hasNext()){
 			String key = it.next();
 			int value = map.get(key);
 			
 			System.out.println("key:"+key+" value"+value);
 		}
		
		

	}

}
