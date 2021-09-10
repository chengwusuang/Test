package test;

public class Test {
    public static void main(String[] args) {
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("hello");
        System.out.println("first commit");
        System.out.println("checkout");
        System.out.println("master commit");
        System.out.println("hot-fix test");
    }
}
