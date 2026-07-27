package DAY3;

abstract class ems {
    public abstract void login();
    public abstract void logout();
    public void salary () {
        System.out.println("salary credited");
    }
}
class manager extends ems {
    public void login() {
        System.out.println("login successful!");
    }
    public void logout() {
        System.out.println("logout successful!");
    }

}

public class D3_P1_abs1 {
    public static void main() {
        manager e = new manager();
        e.login();

    }
}
