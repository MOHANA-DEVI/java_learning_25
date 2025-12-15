public class multithreading extends Thread {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("run method");
        }
    }
    public static void main(String[] args){
        multithreading mu=new multithreading();
        mu.start(); //start new thread but main thread does not excetue this
        for(int i=0;i<5;i++){
            System.out.println("main");
        }
    }
}
// this file create the thread using extend the thread class from runnable interface
