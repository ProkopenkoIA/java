package ru.geekbrains.lesson1.sample;

import ru.geekbrains.lesson1.BottleOfWater;
import ru.geekbrains.lesson1.Product;

public class Juice extends BottleOfWater {
    private String typeJuice;

    public String getTypeOfJuice(){
        return typeJuice;
    }
    public Juice(String brand, String name, double price, int volume, String typeJuice){
        super(brand, name, price,volume);
        this.typeJuice = typeJuice;
    }


}
