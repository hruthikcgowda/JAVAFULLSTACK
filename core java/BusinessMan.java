import java.util.Scanner;

class BusinessMan{
    private float si;
    private float p;
    private float t;
    static private float r;

    static{
        r = 15.2f;
    }
    
    public void acceptInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the principal: ");
        p=scan.nextInt();
        System.out.println("Enter the Time: ");
        t = scan.nextInt();
    }
    public void calcInterest()
    {
        si = (p*t*r)/100;
    }
    public void Display()
    {
        System.out.println(si);
    }
    public static void main(String[] args){
        BusinessMan b1 = new BusinessMan();
        b1.acceptInput();
        b1.calcInterest();
        b1.Display();

        BusinessMan b2 = new BusinessMan();
        b2.acceptInput();
        b2.calcInterest();
        b2.Display();

        BusinessMan b3 = new BusinessMan();
        b3.acceptInput();
        b3.calcInterest();
        b3.Display();
    }
}