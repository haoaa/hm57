package party.haoqi.$01base;

/**
 * Created by Administrator on 2020/1/30. All right reserved.
 */
interface USB {
    void open();
    void close();
}
class Mouse implements USB {
    public void open() {
        System.out.println("��꿪���������һ��");
    }

    public void close() {
        System.out.println("���ر�");
    }
    public void click() {
        System.out.println("�����");
    }
}
class Keyboard implements USB {
    public void open() {
        System.out.println("���̿����������һ��");
    }

    public void close() {
        System.out.println("���̹ر�");
    }
    public void type() {
        System.out.println("�����û�");
    }
}

class Laptop {
    public void use(USB usb) {
        if (usb != null) {
            usb.open();
            if (usb instanceof Mouse) {
                Mouse m = (Mouse) usb;
                m.click();
            } else if (usb instanceof Keyboard) {
                Keyboard m = (Keyboard) usb;
                m.type();
            }
            usb.close();
        }
    }
}
abstract class Fly{
    public void fly() {

    }
}
public class day10 {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        Keyboard k = new Keyboard();
        Mouse m = new Mouse();
        l.use(k);
        l.use(m);
        showFly(new Fly() {
            public void fly() {
                System.out.println("fly");
            }
        });
    }
    public static void showFly(Fly f) {
        f.fly();
    }
}
