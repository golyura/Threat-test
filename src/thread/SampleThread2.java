package thread;

public class SampleThread2 implements Runnable{
    Object object = new Object();

    @Override
    public void run() {
        System.out.println("Hello from thread #2");
    }

    public static void main(String[] args) {
//        Thread thread2 = new Thread(new SampleThread2());
//        thread2.start();
//        thread2.start();
        SampleThread2 sync = new SampleThread2();

        synchronized (sync){
            System.out.println("synchro block in main");
        }

        sync.meth1();
        sync.meth2();
        SampleThread2.meth3();
        SampleThread2.meth4();

    }

    public synchronized void meth1(){
        System.out.println("synchronised method 1");
    }
    public  void meth2() {
        synchronized (this) {
            System.out.println("synchronised method 2");
        }
    }

    public static synchronized void meth3(){
        System.out.println("synchronised static method 3");
    }

    public static void meth4(){
        synchronized (SampleThread2.class) {
            System.out.println("synchronised static method 4");
        }
    }
}
