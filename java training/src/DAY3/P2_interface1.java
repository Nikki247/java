package DAY3;

interface Remote {
    void plusButton();
    void minusButton();
}
class TV implements Remote {
    public void plusButton() {
        System.out.println("Increment channel!");

    }
    public void minusButton() {
        System.out.println("Decrement channel");
    }
}

public class P2_interface1 {
    public static void main() {
        TV tv = new TV();
        tv.plusButton();
        tv.minusButton();
    }
}
