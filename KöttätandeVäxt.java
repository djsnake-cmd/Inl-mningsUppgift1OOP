package Sprint1.Inlämning1;

public class KöttätandeVäxt extends Växt{

    public KöttätandeVäxt(String name, double length, String liquidType){
        super(name, length, liquidType);

    }
    @Override
    public double getAmountOfWater() {
        return this.amountOfWater = 0.1 + (0.2* getLength());
    }

}
