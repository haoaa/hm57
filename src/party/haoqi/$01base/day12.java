package party.haoqi.$01base;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Administrator on 2020/2/1. All right reserved.
 */
class Person {
    private String name;
    private int age;
    Person(String name, int age) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

class day12 {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Chloe", 34);
        Person person2 = new Person("Chloe", 34);
        //System.out.println(person);
        //System.out.println(person.equals(person2));
        //System.out.println("s".equals("s"));
		//DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //System.out.println(format.format(new Date()));
		//df();
		calc();
		sb();
    }
    public static void sb() {
		StringBuilder builder = new StringBuilder();
		//public StringBuilder append(任意类型)
		StringBuilder builder2 = builder.append("hello");
		//对比一下
		System.out.println("builder:"+builder);
		System.out.println("builder2:"+builder2);
		System.out.println(builder == builder2); //true
		// 可以添加 任何类型
		builder.append("hello");
		builder.append("world");
		builder.append(true);
		builder.append(100);
		// 在我们开发中，会遇到调用一个方法后，返回一个对象的情况。然后使用返回的对象继续调用方法。
		// 这种时候，我们就可以把代码现在一起，如append方法一样，代码如下
		//链式编程
		builder.append("hello").append("world").append(true).append(100);
		System.out.println("builder:"+builder);

		try {
			Double.parseDouble("1x.33333");
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}
    public static void calc() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		// 设置月
		int month = cal.get(Calendar.MONTH) + 1;
		// 设置日
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		System.out.print(year + "年" + month + "月" + dayOfMonth + "日");
		// 使用add方法
		cal.add(Calendar.DAY_OF_MONTH, 2); // 加2天
		cal.add(Calendar.YEAR, -3); // 减3年
		System.out.println(year + "年" + month + "月" + dayOfMonth + "日"); // 2015年1月18日;

		System.out.println(System.currentTimeMillis());

		int[] src = new int[]{1,2,3,4,5};
		int[] dest = new int[]{6,7,8,9,10};
		System.arraycopy( src, 0, dest, 0, 3);
		System.out.println(Arrays.toString(dest));
	}
	public static void df() throws Exception {
		System.out.println("请输入出生日期 格式 YYYY-MM-dd");
		// 获取出生日期,键盘输入
		String birthdayString = new Scanner(System.in).next();

		// 将字符串日期,转成Date对象
		// 创建SimpleDateFormat对象,写日期模式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// 调用方法parse,字符串转成日期对象
		Date birthdayDate = sdf.parse(birthdayString);
		// 获取今天的日期对象
		Date todayDate = new Date();
		// 将两个日期转成毫秒值,Date类的方法getTime
		long birthdaySecond = birthdayDate.getTime();
		long todaySecond = todayDate.getTime();
		long secone = todaySecond-birthdaySecond;
		if (secone < 0){
			System.out.println("还没出生呢");
		} else {
			System.out.println(secone/1000/60/60/24);
		}
	}
}
