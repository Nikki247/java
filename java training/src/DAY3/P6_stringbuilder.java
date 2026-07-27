package DAY3;

class Mythread extends Thread {
    StringBuilder sb;
    Mythread(StringBuilder sb) {
        this.sb = sb;
    }
    public void run() {
        for(int i=0;i<100;i++) {
            this.sb.append(i);
        }
    }
}
public class P6_stringbuilder {
    public static void main(String[] args) throws InterruptedException {

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();

        Mythread mt1 = new Mythread(sb);
        Mythread mt2 = new Mythread(sb1);

        mt1.start();
        mt2.start();

        mt1.join();
        mt2.join();
    }


}
