package DAY3;

interface musicPlayer {
    void playMusic();
}
interface camera {
    void takePhoto();
}
interface gps {
    void tracking();
}
class mobile implements musicPlayer,camera,gps {
    public void playMusic() {
        System.out.println("music!");
    }

    public void takePhoto() {
        System.out.println("clicking photos");
    }

    public void tracking() {
        System.out.println("tracking gps");

    }
}

public class P3_interface2 {
    public static void main() {
        mobile mb = new mobile();
        mb.playMusic();
        mb.takePhoto();
        mb.tracking();
    }
}
