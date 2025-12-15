package oops.com;
class test{
    public void m1(int... i){
        System.out.println("var-arg");
    }
}
class test2 extends test{
    public void m1(int i){
        System.out.print("child");
    }
}
public class overriding_vararg {
    public static void main(String[] args){
        test t=new test();
        t.m1(10);
        test t1= new test2();
        t1.m1(10,20);
    }
}
