class web{
    synchronized void show(String name){
        for(int i=0;i<5;i++){
            System.out.println("welcome");
            System.out.println(name);
            try {
                Thread.sleep(1000);
            }
            catch(Exception e) {
            }
            }
        }

    }

public class synchronization  extends Thread{
    web ob;
    String name;
    synchronization(web ob,String name){
        this.ob=ob;
        this.name=name;
    }
    public void run(){
     ob.show(name);
    }
}
class sub {
    public static void main(String[] args) {
        web wb=new web();
        synchronization sc= new synchronization(wb,"user1");
        synchronization sm= new synchronization(wb,"user2");
        sc.start();
        sm.start();


    }
}

