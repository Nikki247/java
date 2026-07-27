package DAY3;

public class P4_string1 {
    public static void main() {
//        String s1 = "nikhil";         //stack
//        char[] ch = {'x','y','z'};
//        String s2 = new String(ch);  // heap
//        String s3 = "cse";
//        String s4 = "cse";
//        String s5 = new String("hello!");
        String s1 = "Good morning!!";
        String s2 = "good evening";
        String s3 = new String("Good morning!!");

        System.out.println(s1.concat("mr.nikhil"));
        System.out.println(s1);
        System.out.println(s1.charAt(5));
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }
}
