package JAVA_INTERVIEW_QUESTIONS._3_UnderstandThreading;

// THREAD - In a program there are multiple thread(ex- 48 threads)
// MULTIPLE THREADING - Depneding on Core of the CPU(ex octa core ) i,e 8 threads can run simultaniouly.
//SCHEDULAR - it is the resposiblity of schedular to decide which 8 threads will be executed after execution of prev 8 threads
//We cant control schedular we can just suggest it by giving priority

class A extends Thread{ //inheriting thread to use it property
    public void run(){ // A thread must contain run()
        for(int i=0; i<100 ; i++){
            System.out.println("hi");

            try {
                Thread.sleep(10); // in 1 milis processor can execute multiple "hii". therefore puting sleep
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0; i<100 ; i++){
            System.out.println("hello");

            try {
                Thread.sleep(10); // in 1 milis processor can execute multiple "hii". therefore puting sleep
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class _1_demo {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

//        System.out.println(obj1.getPriority());//Priority 1 - 10 . 1->least prior, 10 -> max prior
//        obj2.setPriority(Thread.MAX_PRIORITY);// to set priority

        obj1.start();// start() -> to start a thread
        obj2.start();
    }
}
