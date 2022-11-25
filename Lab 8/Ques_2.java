class Thread1 extends Thread
{
    public void run()
    {
        int i =1;
        while(i < 100)
        {
            if(i%2 != 0)
                System.out.println(i);
            i++;
        }
    }
}
class Thread2 extends Thread
{
    public void run()
    {
        int i =1;
        while(i < 100)
        {
            if(i%2 == 0)
                System.out.println(i);
            i++;
        }
    }
}
public class Ques_2{
    public static void main(String[] args) {
        Thread1 obj1 = new Thread1();
        Thread2 obj2 = new Thread2();
        obj1.start();
        obj2.start();
    }
}