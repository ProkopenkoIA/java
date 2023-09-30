package ru.geekbrains.lesson1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }
    public BottleOfMilk getBottleOfMilk(String name, int volume) {
        for (Product product : products){
            if (product instanceof BottleOfMilk){
                BottleOfMilk bottleOfMilk = (BottleOfMilk)product;
                if (bottleOfMilk.getName().equals(name) && bottleOfMilk.getVolume() == volume)
                    return bottleOfMilk;
            }
        }
        return null;
    }

    public Program.Juice getJuicePack(String name, String typeJuice) {
        for (Product product : products){
            if (product instanceof Program.Juice){
                Program.Juice newJuicePack = (Program.Juice)product;
                if (newJuicePack.getName().equals(name) && newJuicePack.getTypeOfJuice() == typeJuice)
                    return newJuicePack;
            }
        }
        return null;
    }


}
