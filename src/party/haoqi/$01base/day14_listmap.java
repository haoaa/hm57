package party.haoqi.$01base;

import java.util.*;

/**
 * Created by Administrator on 2020/2/3. All right reserved.
 */
class Cat {
	@Override
	public String toString() {
		return "Cat{" +
				"name='" + name + '\'' +
				'}';
	}

	String name;
	public Cat(String n) {
		this.name = n;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Cat cat = (Cat) o;
		return Objects.equals(name, cat.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
public class day14_listmap {
	public static void main(String[] args) {
		//list();
		//f(1, 3, 4, 6);
		map();
	}

	static void map() {
		HashMap<String, String> mp = new HashMap<>();
		mp.put("a", "1");
		mp.put("b", "1");
		mp.put("c", "1");

		Set<Map.Entry<String, String>> entries = mp.entrySet();
		for (Map.Entry<String, String> entrie:
			 entries) {
			//System.out.println(entrie.getKey() + " " + entrie.getValue());
		}
		Set<Number> a = Set.of(1, 3, 5, 5.6);
		System.out.println(a);
		Map<Number, Number> b = Map.of(1, 2, 3, 4);
		System.out.println(b);
	}
	static void list() {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("ab");
		hashSet.add("cab");
		hashSet.add("aab");
		//for (String na :
		//		hashSet) {
		//	System.out.println(na);
		//}
		HashSet<Cat> cs = new HashSet<>();
		cs.add(new Cat("bb"));
		cs.add(new Cat("bb"));
		cs.add(new Cat("bb"));
		for (Cat c : cs) {
			System.out.println(c);
		}
	}
	static void f(int... ar) {
		for (int i : ar) {
			System.out.println(i);
		}
	}
	static void colUtil() {
		//java.lang.Comparable java.util.Comparator实现collection 的 sort

	}
}
