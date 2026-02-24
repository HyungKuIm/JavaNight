package lesson6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JCFTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("lee");
		set.add("kim");
		set.add("lee");  // 중복 안됨
		System.out.println(set);

		List<String> list = new ArrayList<String>();
		list.add("lee");
		list.add("kim");
		list.add("lee"); // 중복 가능
		System.out.println(list);

		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "chang");
		map.put("1", "chang2"); //중복안되고 덮어씀
		map.put("2", "park");
		map.putIfAbsent("1", "myung");
		map.replace("1", "chang2", "bu");
		System.out.println(map);

	}

}
