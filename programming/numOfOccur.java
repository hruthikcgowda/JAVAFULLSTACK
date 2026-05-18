import java.util.Scanner;
public class numOfOccur{
    public static int numOfOccur(int[] ar,int k){
        int count=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]==k){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];

        for(int i=0;i<ar.length;i++){
            ar[i]= scan.nextInt();
        }
        int k = scan.nextInt();
        int result = numOfOccur(ar,k);
        System.out.println(result);
    }
}