/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/2, 20:25
 * @Auther:ShiShc
 */

public class Test {
    public static void main(String[] args) {

        MyThread mt = new MyThread();
        new Thread(mt).start();
        new Thread(mt).start();

        System.out.println("----------------");

        new MyThread2().start();
        new MyThread2().start();
    }

    static class MyThread implements Runnable {
        private int ticket = 5;
        public void run() {
            while(true) {
                System.out.println("Runnable ticket = " + ticket--);
                if(ticket < 0) {
                    break;
                }
            }
        }
    }

    static class MyThread2 extends Thread {
        static int ticket = 5;
        public void run() {
            while(true) {
                System.out.println("Thread ticket = " + ticket--);
                if(ticket < 0) {
                    break;
                }
            }
        }


    }


}
