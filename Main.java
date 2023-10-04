package Sprint1.Inlämning1;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        //Polymorfism. Skapar en ny variabel av typen Växt, men objektet är av subklassen så jag kan
        // använda mig av deras respektive metoder som är ärvda av superklassen.
        Växt laura = new Palm("laura",5, Liquids.Kranvatten.liquidType);

        Växt igge = new Kaktus("igge",0.2, Liquids.Mineralvatten.liquidType);

        Växt meatloaf = new KöttätandeVäxt("meatloaf",0.7,Liquids.Proteindryck.liquidType);

        Växt olof = new Palm("olof",1,Liquids.Mineralvatten.liquidType);


        String typeOfPlantInput = JOptionPane.showInputDialog("Vilken växt ska få mat?").toLowerCase();

        while (true){
            if (typeOfPlantInput.equals(laura.name)){

            }
        }
       switch (typeOfPlantInput) {
           case "igge" -> {JOptionPane.showMessageDialog(null, "Kaktusen Igge ska ha " +
                   igge.getAmountOfWater() + " liter " + igge.getLiquidType() + ".");
           }
            case "laura" -> {JOptionPane.showMessageDialog(null,
                    "Laura ska ha " + laura.getAmountOfWater() + " liter " + laura.getLiquidType() + ".");
            }
            case "meatloaf" -> {JOptionPane.showMessageDialog(null, "Meatloaf ska ha " +
                    meatloaf.getAmountOfWater() + " liter " + meatloaf.getLiquidType() + ".");
            }
            case "olof" -> {JOptionPane.showMessageDialog(null,"Palmen Olof ska ha " +
                    olof.getAmountOfWater() + " liter " + olof.getLiquidType() + ".");
            }
        }

    }
}
