package JAVA_INTERVIEW_QUESTIONS._6_RaceCondition_Thread_Mutation;

class Counter
{
    int count;
    public synchronized void increment() //making thread safe. it make sure ony one thread can execute this at a time
    {
        count++;
    }
}

public class demo {
    public static void main(String[] args) throws InterruptedException {

        Counter c= new Counter();

        Runnable obj1 = () ->
        { // A thread must contain run()
            for(int i=0; i<1000 ; i++)
            {
                c.increment();
            }
        };

        Runnable obj2 = () ->
        { // A thread must contain run()
            for(int i=0; i<1000 ; i++)
            {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
