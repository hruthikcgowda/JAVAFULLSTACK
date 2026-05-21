class Balance{
    private int bal;

    public void setBal(int data){
        if(data < 0){
            System.out.print("Invalid num");
        }else{
            bal=data;
        }
    }
    public int getBal(){
        return bal;
    }
}
public class Amount{
    public static void main(String[] args){
        Balance sbi = new Balance();

        sbi.setBal(-10000);
        System.out.print(sbi.getBal());
    }
}