
class Thread1 implements Runnable
{
    int i =0;
    synchronized public void run()
    {
        System.out.println(++i);
    }
}


public class Ques_3 {
    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        Thread1 obj = new Thread1();
        for(int i=0; i< 10; i++)
        {
            threads[i] = new Thread(obj);
            threads[i].start();
        }


    }
}
