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
        System.out.println("Êó±ê¿ªÆô£¬ºìµÆÉÁÒ»ÉÁ");
    }

    public void close() {
        System.out.println("Êó±ê¹Ø±Õ");
    }
    public void click() {
        System.out.println("Êó±êµã»÷");
    }
}
class Keyboard implements USB {
    public void open() {
        System.out.println("¼üÅÌ¿ªÆô£¬ºìµÆÉÁÒ»ÉÁ");
    }

    public void close() {
        System.out.println("¼üÅÌ¹Ø±Õ");
    }
    public void type() {
        System.out.println("¼üÅÌÇÃ»÷");
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
