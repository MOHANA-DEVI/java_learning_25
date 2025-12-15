public class multithreading_using_runnable implements Runnable {
 public void run(){
     for(int i=0;i<5;i++){
         System.out.println("multithreading using runnable");
     }
 }
}
class mu extends Thread {
    public static void main(String[] args)  {
        multithreading_using_runnable ms=new multithreading_using_runnable();
        Thread th=new Thread(ms);
        th.start();
        System.out.println("good work");
    }
}

