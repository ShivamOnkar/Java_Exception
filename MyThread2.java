public class MyThread2 extends Thread {
    public void run(){
        for(int i=501;i<=510;i++){
            System.out.println(Thread.currentThread());
            System.out.println(i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
}
