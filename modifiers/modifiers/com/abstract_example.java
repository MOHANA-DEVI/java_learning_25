package modifiers.com;

  abstract class vehicles {
    public abstract int noofwheels();
}
class Bus extends vehicles {
    public int noofwheels(){
        return 6;
    }
}
class auto extends vehicles {
    public int noofwheels(){
        return 3;
    }
}
public class abstract_example
{
    public static void main(String[] args){
        Bus b= new Bus();
        System.out.println(b.noofwheels());
        auto a=new auto();
        System.out.println(a.noofwheels());
    }
}
