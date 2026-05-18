import java.util.Scanner;
public class Prime{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=2; i<=n/2; i++){
            if(n % i == 0){
                System.out.println(n+"not a prime number");
            }else{
                System.out.println(n+"is prime number");
            }
        }
    }
}