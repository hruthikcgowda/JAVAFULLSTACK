class Grandparent{
    public void noDrinking(){
        System.out.println("no Drinking");
    }
}
class Parent extends Grandparent{
    String eyeColour = "Brown";
    String skinColour = "Brown";
    String hairColour = "Black";
    String noiseStructure = "Wide";

    public void readBooks(){
        System.out.println("Reading Books");
    }
    public void noSmoking(){
        System.out.println("no smoking");
    } 
}

public class Inherit{
    public static void main(String[] args){
        Child c1 = new Child();
        System.out.println(c1.eyeColour);
        System.out.println(c1.hairColour);
        c1.noDrinking();

        Child c2 = new Child();
        System.out.println(c2.eyeColour);
        System.out.println(c2.hairColour);
        c2.noDrinking();

        Child c3 = new Child();
        System.out.println(c3.eyeColour);
        System.out.println(c3.hairColour);
        c3.noDrinking();
    }
}