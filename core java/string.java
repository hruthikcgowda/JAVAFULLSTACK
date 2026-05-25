import java.util.*;
public class string{
    public static void main(String[] args){
        String s1 = "Java";
        String s2 = "Python";

        if(s1 == s2){
            System.out.println("Ref are equal");
        }else{
            System.out.println("Ref are not equal");
        }
        if(s1.equals(s2)){
            System.out.println("Value are equal");
        }else{
            System.out.println("Values are not equal");
        }
    }
}




 