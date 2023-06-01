//class Thread1 implements Runnable {
//    @Override
//    public void run() {
//        for (int i=0;i<5;i++) {
//            System.out.println("Thread 1");
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
//class Thread2 implements Runnable{
//    @Override
//    public void run() {
//        for (int i=0;i<5;i++) {
//            System.out.println("Thread 2");
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Thread1 t1=new Thread1();
//        Thread2 t2=new Thread2();
//        Thread thh1=new Thread(t1);
//        Thread thh2=new Thread(t2);
//        thh1.start();
//        thh2.start();
//    }
//}
public class Main  {
    public static void main(String[] args) throws Exception {
        Thread t1=new Thread(() ->{
            for (int i=0;i<5;i++) {
                System.out.println("Thread 1");
                try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);}
            }
        },"Thread rename1"); //we can rename a thread like this or (see below)
        Thread t2=new Thread(() ->{
            for (int i=0;i<5;i++) {
                System.out.println("Thread 2");
                try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);}
            }
        });
        t2.setName("Re2"); //we can rename the thread like this also(see above)
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        //PRIORITY
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(8);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.start();
        t2.start();
        t1.join();
        t2.join(); //next line will print only after threads joined with main thread
        System.out.println("End");
    }
}