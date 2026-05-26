class test1{
    int x,y;
    test1(){
        super();
        x=100;
        y=200;
    }
    test1(int x,int y){
        
        this.x = y;
        this.y = y;
    }
}
class test2 extends test1{
    int a,b;
    test2(){
        this(99,9);
        a=300;
        b=400;
    }
    test2(int a,int b){
        super();
        this.a = a;
        this.b = b;
    }
    void display(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
    }
}
public class ConstChain{
    public static void main(String[] args){
        test2 t2 = new test2();
        t2.display();
    }
}
