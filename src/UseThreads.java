public class UseThreads {
    public static void main(String[] args) {
        System.out.println("Main Starting");


        MyThread mt = new MyThread("Child #1");
        Thread newThrd = new Thread(mt);
        newThrd.start();

        for (int i=0; i<50; i++){
            System.out.println(".");
            try{
                Thread.sleep(100);
            }catch (InterruptedException exc){
                System.out.println("Main Thread is Interrupted");
            }
        }
        System.out.println("Main thread ending.");
    }
}
