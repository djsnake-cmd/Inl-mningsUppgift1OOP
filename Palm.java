package Sprint1.Inlämning1;

public class Palm extends Växt{

    public Palm(String name, double length, String liquidType){
        super(name, length, liquidType);
    }
    @Override
    public double getAmountOfWater() {
        return this.amountOfWater = getLength() * 0.5;
    }
    public String getName(){
        return this.name;
    }


}
