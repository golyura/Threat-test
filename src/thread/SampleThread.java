package thread;

public class SampleThread extends Thread {
   static Thread thread2;

    @Override
    public void run() {
        System.out.println("Hello from SampleThread");
        System.out.println(Thread.currentThread().getName());
        try {
            thread2.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End thread2");
        
            }

    public static void main(String[] args) {
        System.out.println("Thread main");
//       Thread thread = Thread.currentThread();
//        thread.interrupt();
//        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());
//
//        System.out.println(Thread.interrupted());
//        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());


        thread2 = new SampleThread();
        thread2.start();
        System.out.println("thread2.isInterrupted() = " + thread2.isInterrupted());
        thread2.interrupt();
        System.out.println("thread2.isInterrupted() = " + thread2.isInterrupted());



        System.out.println("End main thread");
    }
}
