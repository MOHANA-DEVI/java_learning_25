class LimitreachedException extends Exception{
    LimitreachedException(){
        super();
    }
}
public class user_defined_exception {
    int balance = 100000;
    int limit = 20000;

    void widthdrawal(int amount) throws LimitreachedException {
        if (amount > limit) {
            throw new LimitreachedException();
        } else {
            balance -= amount;
            System.out.println("amount debited successfully");
        }
    }


    public static void main(String[] args) throws LimitreachedException {
        user_defined_exception us=new user_defined_exception();
        us.widthdrawal(30000);
    }
}
