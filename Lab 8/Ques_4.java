class Thread1 implements Runnable
{
    public void run()
    {
        if(Thread.currentThread().getPriority() >= 9)
        {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() +  " " + Thread.currentThread().getPriority());
    }
}


public class Ques_4 {
    public static void main(String[] args) {
        Thread[] threads = new Thread[5];
        Thread1 obj = new Thread1();
        threads[0] = new Thread(obj);
        threads[1] = new Thread(obj);
        threads[2] = new Thread(obj);
        threads[3] = new Thread(obj);
        threads[4] = new Thread(obj);

        threads[0].setPriority(5);
        threads[1].setPriority(6);
        threads[2].setPriority(7);
        threads[3].setPriority(9);
        threads[4].setPriority(10);

        threads[0].start();
        threads[1].start();
        threads[2].start();
        threads[3].start();
        threads[4].start();
    }
}
