package ru.geekbrains.lesson1;

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