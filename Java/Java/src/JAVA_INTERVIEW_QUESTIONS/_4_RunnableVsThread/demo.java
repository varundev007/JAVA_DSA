package JAVA_INTERVIEW_QUESTIONS._4_RunnableVsThread;

class A implements Runnable{ //inheriting thread to use it property
    public void run(){ // A thread must contain run()
        for(int i=0; i<10 ; i++){
            System.out.println("hi");

            try {
                Thread.sleep(10); // in 1 milis processor can execute multiple "hii". therefore puting sleep
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i=0; i<10 ; i++){
            System.out.println("hello");

            try {
                Thread.sleep(10); // in 1 milis processor can execute multiple "hii". therefore puting sleep
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class demo {
    public static void main(String[] args) {
        Runnable obj1 = new A();//referance of a interface and object of a class
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
