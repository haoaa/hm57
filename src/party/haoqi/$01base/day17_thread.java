package party.haoqi.$01base;

/**
 * Created by Administrator on 2020/2/6.
 */
class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 5000; i++) {
			System.out.println(i);
		}
	}
}
public class day17_thread {
	public static void main(String[] args) {
		MyThread tt = new MyThread("kfslek");
		tt.run();
		for (int i = 0; i < 5000; i++) {
			System.out.println("main " + i);
		}

	}
}
