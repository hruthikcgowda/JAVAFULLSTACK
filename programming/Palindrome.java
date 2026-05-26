import java.util.Scanner;

public class Palindrome{
    public static String palindrom(String s){
        String t = "";
        for(int i=s.length()-1;i>=0;i--){
            t = t + s.charAt(i);
        }
        return s.equals(t) ? "palindrome" : "Not palindrome";
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String a = palindrom(s);
        System.out.println(a);
    }   
}