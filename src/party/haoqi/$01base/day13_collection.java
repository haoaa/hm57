package party.haoqi.$01base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * collection:
 * 	list 有索引
 * 	set 无索引,不能重复
 */
class Ii implements Iterator{
	String name;
	int idx;
	Ii(String name) {
		this.name = name;
		idx = 0;
	}
	@Override
	public boolean hasNext() {
		return name.length() > idx;
	}

	@Override
	public Object next() {
		int curI = idx;
		idx++;
		return name.substring(curI, curI + 1);
	}
}
class MyGenericMethod {
	public <GType> void show(GType mvp) {
		System.out.println(mvp.getClass());
	}

	public <GType> GType show2(GType mvp) {
		return mvp;
	}
}
class day13_collection {
	public static void main(String[] args) throws Exception {
		//col_method();
		col_it();
		new MyGenericMethod().show("ste");
	}

	private static void col_generic() {
		/*
		* 泛型好处: 将运行时期的ClassCastException，转移到了编译时期变成了编译失败。
		避免了类型强转的麻烦。
		* 类在创建对象的时候确定泛型, 方法在调用方法时，确定泛型的类型
		* 不知道使用什么类型来接收的时候,此时可以使用?,?表示未知通配符。
		* 泛型的上限： 类型名称 <? extends 类 > 对象名称, 只能接收该类型及其子类
		  泛型的下限： 类型名称 <? super 类 > 对象名称, 只能接收该类型及其父类型
		* */
		Collection<Integer> list1 = new ArrayList<Integer>();
		Collection<String> list2 = new ArrayList<String>();
		Collection<Number> list3 = new ArrayList<Number>();
		Collection<Object> list4 = new ArrayList<Object>();

		getElement(list1);
		//getElement(list2);//报错
		getElement(list3);
		//getElement(list4);//报错

		//getElement2(list1);//报错
		//getElement2(list2);//报错
		getElement2(list3);
		getElement2(list4);

	}
	static void getElement2(Collection<? super Number> col) {}
	static void getElement(Collection<? extends Number> col) {}
	private static void col_it() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("串串星人");
		coll.add("吐槽星人");
		coll.add("汪星人");
		//遍历
		//使用迭代器 遍历   每个集合对象都有自己的迭代器
		Iterator<String> it = coll.iterator();
		//  泛型指的是 迭代出 元素的数据类型
		//while(it.hasNext()){ //判断是否有迭代元素
		//	String s = it.next();//获取迭代出的元素
		//	System.out.println(s);
		//}
		//it.next();
		int[] arr = {3,5,6,87};
		//使用增强for遍历数组
		for(int a : arr){//a代表数组中的每个元素
			System.out.println(a);
		}
	}

	private static void col_method() {
		// 使用多态形式
		Collection<String> coll = new ArrayList<String>();
		// 使用方法
		// 添加功能  boolean  add(String s)
		coll.add("小李广");
		coll.add("扫地僧");
		coll.add("石破天");
		System.out.println(coll);

		// boolean contains(E e) 判断o是否在集合中存在
		System.out.println("判断  扫地僧 是否在集合中" + coll.contains("扫地僧"));

		//boolean remove(E e) 删除在集合中的o元素
		System.out.println("删除石破天：" + coll.remove("石破天"));
		System.out.println("操作之后集合中元素:" + coll);

		// size() 集合中有几个元素
		System.out.println("集合中有" + coll.size() + "个元素");

		// Object[] toArray()转换成一个Object数组
		Object[] objects = coll.toArray();
		// 遍历数组
		for (int i = 0; i < objects.length; i++) {
			System.out.println(objects[i]);
		}

		// void  clear() 清空集合
		coll.clear();
		System.out.println("集合中内容为：" + coll);
		// boolean  isEmpty()  判断是否为空
		System.out.println(coll.isEmpty());
	}
}
