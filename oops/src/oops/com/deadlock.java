package oops.com;
class a{
    synchronized void m1(b obj){
        System.out.println("first");
        obj.m4();
    }
    synchronized void m2(){

    }
}
class b{
    synchronized void m3(a ob){
        System.out.print("second class");
        ob.m2();
    }
    synchronized void m4(){

    }
}
class caller1 extends Thread{
    a ob;
    b obj;
    caller1(a ob,b obj){
       this.ob=ob;
       this.obj=obj;
    }
    public void run(){
        ob.m1(obj);
    }
}
class caller2 extends Thread{
    a ob;
    b obj;
    caller2(a ob,b obj){
        this.ob=ob;
        this.obj=obj;
    }
    public void run(){
        obj.m3(ob);
    }
}
public class deadlock {

    public static void main(String[] args){
        a am=new a();
        b bm= new b();
        caller1 cl1=new caller1(am,bm);
        caller2 cl2= new caller2(am,bm);
        cl1.start();
        cl2.start();
    }
}
