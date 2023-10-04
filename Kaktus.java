package Sprint1.Inlämning1;

public class Kaktus extends Växt{

    public Kaktus(String name, double length, String typeOfWater){
        super(name, length, typeOfWater);
    }

    @Override
    public double getAmountOfWater() {
        return this.amountOfWater = 0.02;
    }

}
