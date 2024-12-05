public class MyThread1 extends Thread {
    public void run(){
        System.out.println(Thread.currentThread());
        for(int i=1;i<=20;i++){
            System.out.println(i);
            try{
                Thread.sleep(2000);

            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        
    }
    public static void main(String args[]){
        MyThread1 th1 =new MyThread1();
        MyThread2 th2 = new MyThread2();
        System.out.println("Priority - "+th1.getPriority());//5
        System.out.println("Priority - "+th2.getPriority());//5

        th1.setPriority(MAX_PRIORITY);
        th2.setPriority(MIN_PRIORITY);

        System.out.println("Priority - "+th1.getPriority());//10
        System.out.println("Priority - "+th2.getPriority());//1

        th1.start();
        th2.start();
    }
    
}
