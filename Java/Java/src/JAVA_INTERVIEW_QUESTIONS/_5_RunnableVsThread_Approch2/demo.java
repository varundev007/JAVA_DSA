package JAVA_INTERVIEW_QUESTIONS._5_RunnableVsThread_Approch2;

//class A implements Runnable{ //inheriting thread to use it property
//    public void run(){ // A thread must contain run()
//        for(int i=0; i<10 ; i++){
//            System.out.println("hi");
//
//            try {
//                Thread.sleep(10); // in 1 milis processor can execute multiple "hii". therefore puting sleep
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

//class B implements Runnable{
//    public void run(){
//        for(int i=0; i<10 ; i++){
//            System.out.println("hello");
//
//            try {
//                Thread.sleep(10); // in 1 milis processor can execute multiple "hii". therefore puting sleep
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

public class demo {
    public static void main(String[] args) {
//        Runnable obj1 = new Runnable() { //functional interface
//            public void run(){ // A thread must contain run()
//            for(int i=0; i<10 ; i++){
//                System.out.println("hi");
//
//                try {
//                    Thread.sleep(10); // in 1 milis processor can execute multiple "hii". therefore puting sleep
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//    }
//        };

        //Lamda expression for above
        //simillary we can write it for obj2

        Runnable obj1 = () ->
        { // A thread must contain run()
                for(int i=0; i<10 ; i++){
                    System.out.println("hi");

                    try {
                        Thread.sleep(10); // in 1 milis processor can execute multiple "hii". therefore puting sleep
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        };
        Runnable obj2 = new Runnable() {
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
        };

        Thread t1 = new Thread(obj1);
        Thread t2 =new Thread(obj2);
        t1.start();
        t2.start();
    }
}
