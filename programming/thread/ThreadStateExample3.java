package programming.thread;

//스레드의 상태 변환
public class ThreadStateExample3 {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject();

        ThreadA threadA = new ThreadA(sharedObject);
        ThreadB threadB = new ThreadB(sharedObject);

        threadA.start();
        threadB.start();
    }
}

class WorkObject{
    public synchronized void methodA(){
        System.out.println("ThreadA의 methodA Working");
        notify();
        try {wait();} catch (Exception e){}
    }
    public synchronized void methodB(){
        System.out.println("ThreadB의 methodB Working");
        notify();
        try {wait();} catch (Exception e){}
    }
}

class ThreadA extends Thread{
    private WorkObject workObject;

    public ThreadA(final WorkObject workObject) {
        this.workObject = workObject;
    }

    public void run(){
        for (int i = 0; i < 10; i++) workObject.methodA();
    }
}
class ThreadB extends Thread{
    private WorkObject workObject;

    public ThreadB(final WorkObject workObject) {
        this.workObject = workObject;
    }

    public void run(){
        for (int i = 0; i < 10; i++) workObject.methodB();
    }
}