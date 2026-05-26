class BankAccount
{
    public BankAccount(){
        System.out.println("Inside bank account class");
        
    }
    private int accNum=654321;
    private int pin = 9999;

}
class Hacker extends BankAccount
{
    public Hacker(){
        super();
        System.out.println("inside hacker class");
    }   
}

public class Account{
    public static void main(String[] args){

        Hacker h = new Hacker();
    }
}