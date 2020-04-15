package party.haoqi.$01base;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Administrator on 2020/2/4.
 */
class CustExcep extends Exception {
	public CustExcep() {
	}

	public CustExcep(String message) {
		super(message);
	}
}
public class day16_exception_thread {
	public static void main(String[] args) {
		//System.out.println(fret());
		try {
			throw new CustExcep("xxx");
		} catch (CustExcep custExcep) {
			custExcep.printStackTrace();
		}
	}
	static int fret() {
		try {
			readPath("x");
			return 1;
		} catch (IOException e) {
			e.printStackTrace();
			return 2;
		} finally {
			//当只有在try或者catch中调用退出JVM的相关方法,此时ﬁnally才不会执行,否则ﬁnally永远会执行。
			//如果ﬁnally有return语句,永远返回ﬁnally中的结果,避免该情况.
			System.out.println("final");
			return 3;
		}
	}
	static void readPath(String path) throws FileNotFoundException, IOException{
		if (!path.equals("a.b")) {
			throw new FileNotFoundException("灭的文件");
		}
		if (!path.equals("b")){
			throw new IOException("bbb");
		}
	}
}
