class car{
    public static void milesTokm(float miles)
    {
        float km = miles * 1.6f;
        System.out.println(km);
    }
    public void calcMilage()
    {

    }
}
public class Day19b{
    public static void main(String [] args){
       car.milesTokm(300);
    }
}