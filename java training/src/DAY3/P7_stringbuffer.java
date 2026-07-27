package DAY3;

class Mythread_buf extends Thread {
    StringBuilder sb = new StringBuilder();
    Mythread_buf(StringBuilder sb) {
        this.sb = sb;
    }
    public void run() {
        for (int i = 0; i < 100; i++) {
            this.sb.append(i);
        }
    }
}
public class P7_stringbuffer {
    public static void main(String[] args) throws InterruptedException {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        Mythread_buf mt1 = new Mythread_buf(sb);
        Mythread_buf mt2 = new Mythread_buf(sb1);
        mt1.start();
        mt2.start();
        mt1.join();
        mt2.join();
        System.out.println("length :"+ sb.length());
    }
}

