


class Thread1 extends Thread
{
    public void run()
    {
        int i = 10000;
        while(i > 0)
        {
            System.out.println("hello vinay");
            i--;
        }
    }
}

class Thread2 implements Runnable
{
    public void run()
    {
        int i = 10000;
        while(i > 0)
        {
            System.out.println("hello thapa");
            i--;
        }
    }
}

public class Ques_1
{
    public static void main(String[] args) {
        Thread1 obj1 = new Thread1();
        Thread2 obj2 = new Thread2();
        Thread obj3 = new Thread(obj2);
        obj1.start();
        obj3.start();
    }
}