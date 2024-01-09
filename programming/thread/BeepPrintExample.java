package programming.thread;

public class BeepPrintExample {
    public static void main(String[] args) {
        // 직접 Thread 클래스로 직접 생성하거나 Runnable 익명 구현 객체를 매개값으로 사용할 수 있다.
        // Thread thread = new Thread(new Runnable() {
        //     @Override
        //     public void run() {
        //         for (int i = 0; i < 5; i++) {
        //             System.out.println("1");
        //             try {
        //                 Thread.sleep(500);
        //             } catch (Exception e) {
        //             }
        //         }
        //     }
        // });

        //Thread 자식 클래스로 생성하거나, Thread 익명 자식 객체를 사용할 수도 있다.
        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("1");
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                    }
                }
            }
        };

        thread.start();

        for(int i=0;i<5;i++){
            System.out.println("2");
        }
        try{
            Thread.sleep(500);
        }catch (Exception e){}
    }
}
